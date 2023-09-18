package com.example.phonepe.model;

class OfferModel {

    private  String offerOn, offerDetails;
    private int image;

    public OfferModel(String offerOn, String offerDetails, int image) {
        this.offerOn = offerOn;
        this.offerDetails = offerDetails;
        this.image = image;
    }

    public String getOfferOn() {
        return offerOn;
    }

    public void setOfferOn(String offerOn) {
        this.offerOn = offerOn;
    }

    public String getOfferDetails() {
        return offerDetails;
    }

    public void setOfferDetails(String offerDetails) {
        this.offerDetails = offerDetails;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
