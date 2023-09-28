package com.example.phonepe.model;

public class DealerModel {

   private String dealerName, discountOffer, discountAmt, discountWay, discountDetail;

   public DealerModel(String dealerName, String discountOffer, String discountAmt, String discountWay, String discountDetail) {
      this.dealerName = dealerName;
      this.discountOffer = discountOffer;
      this.discountAmt = discountAmt;
      this.discountWay = discountWay;
      this.discountDetail = discountDetail;
   }

   public String getDealerName() {
      return dealerName;
   }

   public void setDealerName(String dealerName) {
      this.dealerName = dealerName;
   }

   public String getDiscountOffer() {
      return discountOffer;
   }

   public void setDiscountOffer(String discountOffer) {
      this.discountOffer = discountOffer;
   }

   public String getDiscountAmt() {
      return discountAmt;
   }

   public void setDiscountAmt(String discountAmt) {
      this.discountAmt = discountAmt;
   }

   public String getDiscountWay() {
      return discountWay;
   }

   public void setDiscountWay(String discountWay) {
      this.discountWay = discountWay;
   }

   public String getDiscountDetail() {
      return discountDetail;
   }

   public void setDiscountDetail(String discountDetail) {
      this.discountDetail = discountDetail;
   }
}
