package com.sample.foododer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sample.foododer.pojo.Batch;
import com.sample.foododer.pojo.Item;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<List<Item>> dataList;
    Context context;



    public RecyclerAdapter(Context context, List<List<Item>> dataList) {
        this.context = context;
        this.dataList = dataList;

    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_total, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerAdapter.ViewHolder holder, final int position) {


        holder.tvItemName.setText(dataList.get(position).get(position).getName());
        holder.tvCustChoice.setText(dataList.get(position).get(position).getCustomisation());
        holder.tvInstruction.setText(dataList.get(position).get(position).getInstructions());
        holder.tvItemDisc.setText(String.valueOf("₹ ".concat(dataList.get(position).get(position).getOptionPrice().toString())));
        holder.tvItemPrice.setText(String.valueOf("₹ ".concat(dataList.get(position).get(position).getPrice().toString())));
        holder.tvQty.setText(String.valueOf("Qty: ".concat(dataList.get(position).get(position).getQuantity().toString())));

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItemName, tvItemPrice, tvItemDisc, tvCustChoice, tvInstruction, tvQty;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvItemName = itemView.findViewById(R.id.tvItemName);
            tvItemPrice = itemView.findViewById(R.id.tvItemPrice);
            tvItemDisc = itemView.findViewById(R.id.tvItemDisc);
            tvInstruction = itemView.findViewById(R.id.tvInstruction);
            tvCustChoice = itemView.findViewById(R.id.tvCustChoice);
            tvQty = itemView.findViewById(R.id.tvQty);

        }

    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

}
