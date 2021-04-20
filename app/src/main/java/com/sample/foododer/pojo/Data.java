package com.sample.foododer.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("cart")
    @Expose
    private List<Object> cart;
    @SerializedName("batch")
    @Expose
    private List<Batch> batch;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("table_id")
    @Expose
    private Integer tableId;
    @SerializedName("restaurant_id")
    @Expose
    private Integer restaurantId;
    @SerializedName("AC")
    @Expose
    private Boolean ac;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("Fcm_id")
    @Expose
    private String fcmId;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("user_phone")
    @Expose
    private String userPhone;
    @SerializedName("coupon_applied")
    @Expose
    private Boolean couponApplied;
    @SerializedName("user_device_type")
    @Expose
    private String userDeviceType;
    @SerializedName("oid")
    @Expose
    private Integer oid;
    @SerializedName("restaurant_name")
    @Expose
    private String restaurantName;
    @SerializedName("restaurant_image")
    @Expose
    private String restaurantImage;
    @SerializedName("restaurant_location")
    @Expose
    private String restaurantLocation;
    @SerializedName("restaurant_acquirer")
    @Expose
    private String restaurantAcquirer;
    @SerializedName("sub_total_taxable")
    @Expose
    private Integer subTotalTaxable;
    @SerializedName("sub_total_nontaxable")
    @Expose
    private Integer subTotalNontaxable;
    @SerializedName("sub_total")
    @Expose
    private Integer subTotal;
    @SerializedName("discount_type")
    @Expose
    private String discountType;
    @SerializedName("discountPercentage")
    @Expose
    private Integer discountPercentage;
    @SerializedName("total_discount")
    @Expose
    private Integer totalDiscount;
    @SerializedName("amountRemaining")
    @Expose
    private Integer amountRemaining;
    @SerializedName("minimumAmount")
    @Expose
    private Integer minimumAmount;
    @SerializedName("discountRemaining")
    @Expose
    private Integer discountRemaining;
    @SerializedName("maximumDiscount")
    @Expose
    private Integer maximumDiscount;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("cart_discount")
    @Expose
    private Integer cartDiscount;
    @SerializedName("cart_total")
    @Expose
    private Integer cartTotal;
    @SerializedName("cart_total_nontaxable")
    @Expose
    private Integer cartTotalNontaxable;
    @SerializedName("cart_total_taxable")
    @Expose
    private Integer cartTotalTaxable;
    @SerializedName("cgst")
    @Expose
    private Float cgst;
    @SerializedName("grand_total")
    @Expose
    private Float grandTotal;
    @SerializedName("net_total")
    @Expose
    private Integer netTotal;
    @SerializedName("net_total_nontaxable")
    @Expose
    private Integer netTotalNontaxable;
    @SerializedName("net_total_taxable")
    @Expose
    private Integer netTotalTaxable;
    @SerializedName("peAR_discount")
    @Expose
    private Integer peARDiscount;
    @SerializedName("restaurant_discount")
    @Expose
    private Integer restaurantDiscount;
    @SerializedName("service_charge")
    @Expose
    private Integer serviceCharge;
    @SerializedName("sgst")
    @Expose
    private Float sgst;
    @SerializedName("amount_transferrable")
    @Expose
    private Integer amountTransferrable;
    @SerializedName("bill_status")
    @Expose
    private String billStatus;
    @SerializedName("bonus_status")
    @Expose
    private String bonusStatus;
    @SerializedName("commission_amount")
    @Expose
    private Integer commissionAmount;
    @SerializedName("commission_percentage")
    @Expose
    private Integer commissionPercentage;
    @SerializedName("payment_otp")
    @Expose
    private Integer paymentOtp;
    @SerializedName("payment_type")
    @Expose
    private String paymentType;
    @SerializedName("settlement_status")
    @Expose
    private String settlementStatus;
    @SerializedName("skip_getbill")
    @Expose
    private Boolean skipGetbill;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getCart() {
        return cart;
    }

    public void setCart(List<Object> cart) {
        this.cart = cart;
    }

    public List<Batch> getBatch() {
        return batch;
    }

    public void setBatch(List<Batch> batch) {
        this.batch = batch;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFcmId() {
        return fcmId;
    }

    public void setFcmId(String fcmId) {
        this.fcmId = fcmId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Boolean getCouponApplied() {
        return couponApplied;
    }

    public void setCouponApplied(Boolean couponApplied) {
        this.couponApplied = couponApplied;
    }

    public String getUserDeviceType() {
        return userDeviceType;
    }

    public void setUserDeviceType(String userDeviceType) {
        this.userDeviceType = userDeviceType;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(String restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantAcquirer() {
        return restaurantAcquirer;
    }

    public void setRestaurantAcquirer(String restaurantAcquirer) {
        this.restaurantAcquirer = restaurantAcquirer;
    }

    public Integer getSubTotalTaxable() {
        return subTotalTaxable;
    }

    public void setSubTotalTaxable(Integer subTotalTaxable) {
        this.subTotalTaxable = subTotalTaxable;
    }

    public Integer getSubTotalNontaxable() {
        return subTotalNontaxable;
    }

    public void setSubTotalNontaxable(Integer subTotalNontaxable) {
        this.subTotalNontaxable = subTotalNontaxable;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Integer getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(Integer amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Integer getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(Integer minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public Integer getDiscountRemaining() {
        return discountRemaining;
    }

    public void setDiscountRemaining(Integer discountRemaining) {
        this.discountRemaining = discountRemaining;
    }

    public Integer getMaximumDiscount() {
        return maximumDiscount;
    }

    public void setMaximumDiscount(Integer maximumDiscount) {
        this.maximumDiscount = maximumDiscount;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getCartDiscount() {
        return cartDiscount;
    }

    public void setCartDiscount(Integer cartDiscount) {
        this.cartDiscount = cartDiscount;
    }

    public Integer getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(Integer cartTotal) {
        this.cartTotal = cartTotal;
    }

    public Integer getCartTotalNontaxable() {
        return cartTotalNontaxable;
    }

    public void setCartTotalNontaxable(Integer cartTotalNontaxable) {
        this.cartTotalNontaxable = cartTotalNontaxable;
    }

    public Integer getCartTotalTaxable() {
        return cartTotalTaxable;
    }

    public void setCartTotalTaxable(Integer cartTotalTaxable) {
        this.cartTotalTaxable = cartTotalTaxable;
    }

    public Float getCgst() {
        return cgst;
    }

    public void setCgst(Float cgst) {
        this.cgst = cgst;
    }

    public Float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(Integer netTotal) {
        this.netTotal = netTotal;
    }

    public Integer getNetTotalNontaxable() {
        return netTotalNontaxable;
    }

    public void setNetTotalNontaxable(Integer netTotalNontaxable) {
        this.netTotalNontaxable = netTotalNontaxable;
    }

    public Integer getNetTotalTaxable() {
        return netTotalTaxable;
    }

    public void setNetTotalTaxable(Integer netTotalTaxable) {
        this.netTotalTaxable = netTotalTaxable;
    }

    public Integer getPeARDiscount() {
        return peARDiscount;
    }

    public void setPeARDiscount(Integer peARDiscount) {
        this.peARDiscount = peARDiscount;
    }

    public Integer getRestaurantDiscount() {
        return restaurantDiscount;
    }

    public void setRestaurantDiscount(Integer restaurantDiscount) {
        this.restaurantDiscount = restaurantDiscount;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Float getSgst() {
        return sgst;
    }

    public void setSgst(Float sgst) {
        this.sgst = sgst;
    }

    public Integer getAmountTransferrable() {
        return amountTransferrable;
    }

    public void setAmountTransferrable(Integer amountTransferrable) {
        this.amountTransferrable = amountTransferrable;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getBonusStatus() {
        return bonusStatus;
    }

    public void setBonusStatus(String bonusStatus) {
        this.bonusStatus = bonusStatus;
    }

    public Integer getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Integer commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(Integer commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public Integer getPaymentOtp() {
        return paymentOtp;
    }

    public void setPaymentOtp(Integer paymentOtp) {
        this.paymentOtp = paymentOtp;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Boolean getSkipGetbill() {
        return skipGetbill;
    }

    public void setSkipGetbill(Boolean skipGetbill) {
        this.skipGetbill = skipGetbill;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }




}
