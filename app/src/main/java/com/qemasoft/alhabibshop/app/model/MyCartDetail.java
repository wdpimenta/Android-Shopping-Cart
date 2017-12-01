package com.qemasoft.alhabibshop.app.model;

/**
 * Created by Inzimam on 17-Oct-17.
 */

public class MyCartDetail {
    private String cartId;
    private String orderDate;
    private String paymentMethod;
    private String deliveryMethod;
    private String orderStatus;
    private String productId;
    private String productImage;
    private String productName;
    private String productModel;
    private String orderQty;
    private String productPrice;
    private String total;
    private String subTotal;
    private String couponDiscount;
    private String grandTotal;

    public MyCartDetail(String productModel, String productName, String orderQty,
                        String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.orderQty = orderQty;
        this.productModel = productModel;
    }

    public MyCartDetail(String cartId, String productId, String productImage,
                        String productName, String orderQty,
                        String productPrice, String total) {
        this.cartId = cartId;
        this.productId = productId;
        this.productImage = productImage;
        this.productName = productName;
        this.orderQty = orderQty;
        this.productPrice = productPrice;
        this.total = total;
    }

    public String getCartId() {
        return cartId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public String getOrderQty() {
        return orderQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getTotal() {
        return total;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public String getCouponDiscount() {
        return couponDiscount;
    }

    public String getGrandTotal() {
        return grandTotal;
    }
}