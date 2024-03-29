package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * DonationReceiptMaster generated by hbm2java
 */
public class DonationReceiptMaster  implements java.io.Serializable {


     private Integer receiptId;
     private UserInfo userInfo;
     private String note;
     private String specialNote;
     private Date specialDate;
     private double totalAmount;
     private int templeId;
     private int receiptTempleId;
     private int makerId;
     private Date dt;

    public DonationReceiptMaster() {
    }

    public DonationReceiptMaster(UserInfo userInfo, String note, String specialNote, Date specialDate, double totalAmount, int templeId, int receiptTempleId, int makerId, Date dt) {
       this.userInfo = userInfo;
       this.note = note;
       this.specialNote = specialNote;
       this.specialDate = specialDate;
       this.totalAmount = totalAmount;
       this.templeId = templeId;
       this.receiptTempleId = receiptTempleId;
       this.makerId = makerId;
       this.dt = dt;
    }
   
    public Integer getReceiptId() {
        return this.receiptId;
    }
    
    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }
    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public String getSpecialNote() {
        return this.specialNote;
    }
    
    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }
    public Date getSpecialDate() {
        return this.specialDate;
    }
    
    public void setSpecialDate(Date specialDate) {
        this.specialDate = specialDate;
    }
    public double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public int getTempleId() {
        return this.templeId;
    }
    
    public void setTempleId(int templeId) {
        this.templeId = templeId;
    }
    public int getReceiptTempleId() {
        return this.receiptTempleId;
    }
    
    public void setReceiptTempleId(int receiptTempleId) {
        this.receiptTempleId = receiptTempleId;
    }
    public int getMakerId() {
        return this.makerId;
    }
    
    public void setMakerId(int makerId) {
        this.makerId = makerId;
    }
    public Date getDt() {
        return this.dt;
    }
    
    public void setDt(Date dt) {
        this.dt = dt;
    }




}


