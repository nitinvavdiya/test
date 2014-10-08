package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * DonationItemMaster generated by hbm2java
 */
public class DonationItemMaster  implements java.io.Serializable {


     private Integer donationId;
     private int userMasterId;
     private int itemId;
     private double quantity;
     private int unitId;
     private int makerId;
     private Date systemDatetime;

    public DonationItemMaster() {
    }

    public DonationItemMaster(int userMasterId, int itemId, double quantity, int unitId, int makerId, Date systemDatetime) {
       this.userMasterId = userMasterId;
       this.itemId = itemId;
       this.quantity = quantity;
       this.unitId = unitId;
       this.makerId = makerId;
       this.systemDatetime = systemDatetime;
    }
   
    public Integer getDonationId() {
        return this.donationId;
    }
    
    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
    }
    public int getUserMasterId() {
        return this.userMasterId;
    }
    
    public void setUserMasterId(int userMasterId) {
        this.userMasterId = userMasterId;
    }
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public double getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public int getUnitId() {
        return this.unitId;
    }
    
    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
    public int getMakerId() {
        return this.makerId;
    }
    
    public void setMakerId(int makerId) {
        this.makerId = makerId;
    }
    public Date getSystemDatetime() {
        return this.systemDatetime;
    }
    
    public void setSystemDatetime(Date systemDatetime) {
        this.systemDatetime = systemDatetime;
    }




}


