package com.example.phonepe.model;

class TransactionModel {

    private String txnDate, txnMed, txnDealer, txnAmt, txnAntCd;
    private int imgTxnWay;

    public TransactionModel(String txnDate, String txnMed, String txnDealer, String txnAmt, String txnAntCd, int imgTxnWay) {
        this.txnDate = txnDate;
        this.txnMed = txnMed;
        this.txnDealer = txnDealer;
        this.txnAmt = txnAmt;
        this.txnAntCd = txnAntCd;
        this.imgTxnWay = imgTxnWay;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getTxnMed() {
        return txnMed;
    }

    public void setTxnMed(String txnMed) {
        this.txnMed = txnMed;
    }

    public String getTxnDealer() {
        return txnDealer;
    }

    public void setTxnDealer(String txnDealer) {
        this.txnDealer = txnDealer;
    }

    public String getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(String txnAmt) {
        this.txnAmt = txnAmt;
    }

    public String getTxnAntCd() {
        return txnAntCd;
    }

    public void setTxnAntCd(String txnAntCd) {
        this.txnAntCd = txnAntCd;
    }

    public int getImgTxnWay() {
        return imgTxnWay;
    }

    public void setImgTxnWay(int imgTxnWay) {
        this.imgTxnWay = imgTxnWay;
    }
}
