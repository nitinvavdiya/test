package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * ApplianceMaster generated by hbm2java
 */
public class ApplianceMaster  implements java.io.Serializable {


     private Integer applianceId;
     private int templeMasterId;
     private String applianceName;
     private int applianceQty;
     private int applianceRate;
     private Date systemDatetime;
     private int isDeleted;

    public ApplianceMaster() {
    }

    public ApplianceMaster(int templeMasterId, String applianceName, int applianceQty, int applianceRate, Date systemDatetime, int isDeleted) {
       this.templeMasterId = templeMasterId;
       this.applianceName = applianceName;
       this.applianceQty = applianceQty;
       this.applianceRate = applianceRate;
       this.systemDatetime = systemDatetime;
       this.isDeleted = isDeleted;
    }
   
    public Integer getApplianceId() {
        return this.applianceId;
    }
    
    public void setApplianceId(Integer applianceId) {
        this.applianceId = applianceId;
    }
    public int getTempleMasterId() {
        return this.templeMasterId;
    }
    
    public void setTempleMasterId(int templeMasterId) {
        this.templeMasterId = templeMasterId;
    }
    public String getApplianceName() {
        return this.applianceName;
    }
    
    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }
    public int getApplianceQty() {
        return this.applianceQty;
    }
    
    public void setApplianceQty(int applianceQty) {
        this.applianceQty = applianceQty;
    }
    public int getApplianceRate() {
        return this.applianceRate;
    }
    
    public void setApplianceRate(int applianceRate) {
        this.applianceRate = applianceRate;
    }
    public Date getSystemDatetime() {
        return this.systemDatetime;
    }
    
    public void setSystemDatetime(Date systemDatetime) {
        this.systemDatetime = systemDatetime;
    }
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }




}

