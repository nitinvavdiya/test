package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * ChartMaster generated by hbm2java
 */
public class ChartMaster  implements java.io.Serializable {


     private Integer chartId;
     private int prasadId;
     private int minimumRupees;
     private int maximumRupees;
     private double quantity;
     private int templeId;
     private int makerId;
     private int isDeleted;
     private Date systemDatetime;

    public ChartMaster() {
    }

    public ChartMaster(int prasadId, int minimumRupees, int maximumRupees, double quantity, int templeId, int makerId, int isDeleted, Date systemDatetime) {
       this.prasadId = prasadId;
       this.minimumRupees = minimumRupees;
       this.maximumRupees = maximumRupees;
       this.quantity = quantity;
       this.templeId = templeId;
       this.makerId = makerId;
       this.isDeleted = isDeleted;
       this.systemDatetime = systemDatetime;
    }
   
    public Integer getChartId() {
        return this.chartId;
    }
    
    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }
    public int getPrasadId() {
        return this.prasadId;
    }
    
    public void setPrasadId(int prasadId) {
        this.prasadId = prasadId;
    }
    public int getMinimumRupees() {
        return this.minimumRupees;
    }
    
    public void setMinimumRupees(int minimumRupees) {
        this.minimumRupees = minimumRupees;
    }
    public int getMaximumRupees() {
        return this.maximumRupees;
    }
    
    public void setMaximumRupees(int maximumRupees) {
        this.maximumRupees = maximumRupees;
    }
    public double getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;
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
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Date getSystemDatetime() {
        return this.systemDatetime;
    }
    
    public void setSystemDatetime(Date systemDatetime) {
        this.systemDatetime = systemDatetime;
    }




}


