package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0



/**
 * DonationReceiptInfo generated by hbm2java
 */
public class DonationReceiptInfo  implements java.io.Serializable {


     private Integer donationReceiptInfoId;
     private AccountManagementMaster accountManagementMaster;
     private int receiptId;
     private String guestDonorName;
     private int prasadId;
     private double amount;
     private int prasadQuantity;
     private int templeId;
     private double receiptTempleId;

    public DonationReceiptInfo() {
    }

    public DonationReceiptInfo(AccountManagementMaster accountManagementMaster, int receiptId, String guestDonorName, int prasadId, double amount, int prasadQuantity, int templeId, double receiptTempleId) {
       this.accountManagementMaster = accountManagementMaster;
       this.receiptId = receiptId;
       this.guestDonorName = guestDonorName;
       this.prasadId = prasadId;
       this.amount = amount;
       this.prasadQuantity = prasadQuantity;
       this.templeId = templeId;
       this.receiptTempleId = receiptTempleId;
    }
   
    public Integer getDonationReceiptInfoId() {
        return this.donationReceiptInfoId;
    }
    
    public void setDonationReceiptInfoId(Integer donationReceiptInfoId) {
        this.donationReceiptInfoId = donationReceiptInfoId;
    }
    public AccountManagementMaster getAccountManagementMaster() {
        return this.accountManagementMaster;
    }
    
    public void setAccountManagementMaster(AccountManagementMaster accountManagementMaster) {
        this.accountManagementMaster = accountManagementMaster;
    }
    public int getReceiptId() {
        return this.receiptId;
    }
    
    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }
    public String getGuestDonorName() {
        return this.guestDonorName;
    }
    
    public void setGuestDonorName(String guestDonorName) {
        this.guestDonorName = guestDonorName;
    }
    public int getPrasadId() {
        return this.prasadId;
    }
    
    public void setPrasadId(int prasadId) {
        this.prasadId = prasadId;
    }
    public double getAmount() {
        return this.amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getPrasadQuantity() {
        return this.prasadQuantity;
    }
    
    public void setPrasadQuantity(int prasadQuantity) {
        this.prasadQuantity = prasadQuantity;
    }
    public int getTempleId() {
        return this.templeId;
    }
    
    public void setTempleId(int templeId) {
        this.templeId = templeId;
    }
    public double getReceiptTempleId() {
        return this.receiptTempleId;
    }
    
    public void setReceiptTempleId(double receiptTempleId) {
        this.receiptTempleId = receiptTempleId;
    }




}

