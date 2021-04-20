package com.sample.foododer;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.sample.foododer.pojo.Batch;
import com.sample.foododer.pojo.Data;

import com.sample.foododer.pojo.Item;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    TextView tvTotal, tvStoreName, tvOrderDate, tvPayMode, tvPlaceName, tvTotalBill, tvTotalBillAmt, tvSubTtl, tvDiscAmout, tvTaxe, tvCouponDiscAmout, tvRestoDisc;
    ImageView ivIcon;
    List<Item> itemList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivIcon = findViewById(R.id.ivIcon);
        recyclerView = findViewById(R.id.recyclerView);
        tvTotal = findViewById(R.id.tvTotal);
        tvOrderDate = findViewById(R.id.tvOrderDate);
        tvPayMode = findViewById(R.id.tvPayMode);
        tvPlaceName = findViewById(R.id.tvPlaceName);
        tvStoreName = findViewById(R.id.tvStoreName);
        tvTotalBill = findViewById(R.id.tvTotalBill);
        tvTotalBillAmt = findViewById(R.id.tvTotalBillAmt);
        tvSubTtl = findViewById(R.id.tvSubTtl);
        tvDiscAmout = findViewById(R.id.tvDiscAmout);
        tvTaxe = findViewById(R.id.tvTaxe);
        tvCouponDiscAmout = findViewById(R.id.tvCouponDiscAmout);
        tvRestoDisc = findViewById(R.id.tvRestoDisc);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();

        APIIterface apiIterface = APIClient.getClient().create(APIIterface.class);

        Call<Data> call = apiIterface.setData();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {

                Data data = response.body();
                List<Batch> arrayList = response.body().getBatch();

                List<List<Item>> itemList = new ArrayList<>();

                if (response.isSuccessful()){
                    String imgURL = data.getRestaurantImage();
                    String totalAmount = data.getGrandTotal().toString();

                    float gst = data.getSgst()+ data.getSgst();

                    Picasso.get().load(imgURL).into(ivIcon);
                    tvPlaceName.setText(data.getRestaurantLocation());
                    tvStoreName.setText(data.getRestaurantName());
                    tvTotal.setText("₹ ".concat(totalAmount));
                    tvOrderDate.setText("Order on: ".concat(data.getOid().toString()));
                    tvPayMode.setText("Payment mode: ".concat(data.getPaymentType()));
                    tvTotalBill.setText("₹ ".concat(totalAmount));
                    tvTotalBillAmt.setText("₹ ".concat(totalAmount));
                    tvSubTtl.setText("₹ ".concat(data.getSubTotal().toString()));
                    tvDiscAmout.setText("- ₹ ".concat(data.getDiscountPercentage().toString()));
                    tvTaxe.setText("₹ ".concat(String.valueOf(gst)));
                    tvCouponDiscAmout.setText("- ₹ ".concat(String.valueOf(data.getTotalDiscount())));
                    tvRestoDisc.setText("₹ ".concat(String.valueOf(data.getRestaurantDiscount())));

                    for (int i=0 ; i < arrayList.size() ; i++)
                    {
                        itemList.add(arrayList.get(i).getItems());

                    }
                    recyclerAdapter = new RecyclerAdapter(getApplicationContext(),itemList);
                    recyclerView.setAdapter(recyclerAdapter);

                }

            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });

    }

}