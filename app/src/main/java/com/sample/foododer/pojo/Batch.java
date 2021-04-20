package com.sample.foododer.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Batch {

    @SerializedName("items")
    @Expose
    private List<Item> items;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("batch_total_taxable")
    @Expose
    private Integer batchTotalTaxable;
    @SerializedName("batch_total_nontaxable")
    @Expose
    private Integer batchTotalNontaxable;
    @SerializedName("batch_total")
    @Expose
    private Integer batchTotal;
    @SerializedName("batch_discount")
    @Expose
    private Integer batchDiscount;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBatchTotalTaxable() {
        return batchTotalTaxable;
    }

    public void setBatchTotalTaxable(Integer batchTotalTaxable) {
        this.batchTotalTaxable = batchTotalTaxable;
    }

    public Integer getBatchTotalNontaxable() {
        return batchTotalNontaxable;
    }

    public void setBatchTotalNontaxable(Integer batchTotalNontaxable) {
        this.batchTotalNontaxable = batchTotalNontaxable;
    }

    public Integer getBatchTotal() {
        return batchTotal;
    }

    public void setBatchTotal(Integer batchTotal) {
        this.batchTotal = batchTotal;
    }

    public Integer getBatchDiscount() {
        return batchDiscount;
    }

    public void setBatchDiscount(Integer batchDiscount) {
        this.batchDiscount = batchDiscount;
    }



}
