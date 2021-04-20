package com.sample.foododer.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("customisation")
    @Expose
    private String customisation;
    @SerializedName("instructions")
    @Expose
    private String instructions;
    @SerializedName("isAvailableJain")
    @Expose
    private Boolean isAvailableJain;
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @SerializedName("jain")
    @Expose
    private Boolean jain;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("optionPrice")
    @Expose
    private Integer optionPrice;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("taxable")
    @Expose
    private Boolean taxable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCustomisation() {
        return customisation;
    }

    public void setCustomisation(String customisation) {
        this.customisation = customisation;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Boolean getIsAvailableJain() {
        return isAvailableJain;
    }

    public void setIsAvailableJain(Boolean isAvailableJain) {
        this.isAvailableJain = isAvailableJain;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Boolean getJain() {
        return jain;
    }

    public void setJain(Boolean jain) {
        this.jain = jain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(Integer optionPrice) {
        this.optionPrice = optionPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

}

