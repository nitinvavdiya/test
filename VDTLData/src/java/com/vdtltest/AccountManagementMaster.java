package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AccountManagementMaster generated by hbm2java
 */
public class AccountManagementMaster  implements java.io.Serializable {


     private Integer accountId;
     private int prasadId;
     private String prasadStatus;
     private int templeId;
     private int makerId;
     private byte isDeleted;
     private Date systemDatetime;
     private String accountName;
     private Set donationReceiptInfos = new HashSet(0);

    public AccountManagementMaster() {
    }

	
    public AccountManagementMaster(int prasadId, String prasadStatus, int templeId, int makerId, byte isDeleted, Date systemDatetime, String accountName) {
        this.prasadId = prasadId;
        this.prasadStatus = prasadStatus;
        this.templeId = templeId;
        this.makerId = makerId;
        this.isDeleted = isDeleted;
        this.systemDatetime = systemDatetime;
        this.accountName = accountName;
    }
    public AccountManagementMaster(int prasadId, String prasadStatus, int templeId, int makerId, byte isDeleted, Date systemDatetime, String accountName, Set donationReceiptInfos) {
       this.prasadId = prasadId;
       this.prasadStatus = prasadStatus;
       this.templeId = templeId;
       this.makerId = makerId;
       this.isDeleted = isDeleted;
       this.systemDatetime = systemDatetime;
       this.accountName = accountName;
       this.donationReceiptInfos = donationReceiptInfos;
    }
   
    public Integer getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public int getPrasadId() {
        return this.prasadId;
    }
    
    public void setPrasadId(int prasadId) {
        this.prasadId = prasadId;
    }
    public String getPrasadStatus() {
        return this.prasadStatus;
    }
    
    public void setPrasadStatus(String prasadStatus) {
        this.prasadStatus = prasadStatus;
    }
    public int getTempleId() {
        return this.templeId;
    }
    
    public void setTempleId(int templeId) {
        this.templeId = templeId;
    }
    public int getMakerId() {
        return this.makerId;
    }
    
    public void setMakerId(int makerId) {
        this.makerId = makerId;
    }
    public byte getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Date getSystemDatetime() {
        return this.systemDatetime;
    }
    
    public void setSystemDatetime(Date systemDatetime) {
        this.systemDatetime = systemDatetime;
    }
    public String getAccountName() {
        return this.accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public Set getDonationReceiptInfos() {
        return this.donationReceiptInfos;
    }
    
    public void setDonationReceiptInfos(Set donationReceiptInfos) {
        this.donationReceiptInfos = donationReceiptInfos;
    }




}

