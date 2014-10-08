package com.beans;
// Generated 7 Oct, 2014 9:57:08 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Tblproduct generated by hbm2java
 */
public class Tblproduct  implements java.io.Serializable {


     private Integer id;
     private String name;
     private int enable;
     private String producttype;
     private Set tbldonationdetails = new HashSet(0);
     private Set tblproductdetails = new HashSet(0);

    public Tblproduct() {
    }

	
    public Tblproduct(String name, int enable, String producttype) {
        this.name = name;
        this.enable = enable;
        this.producttype = producttype;
    }
    public Tblproduct(String name, int enable, String producttype, Set tbldonationdetails, Set tblproductdetails) {
       this.name = name;
       this.enable = enable;
       this.producttype = producttype;
       this.tbldonationdetails = tbldonationdetails;
       this.tblproductdetails = tblproductdetails;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getEnable() {
        return this.enable;
    }
    
    public void setEnable(int enable) {
        this.enable = enable;
    }
    public String getProducttype() {
        return this.producttype;
    }
    
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
    public Set getTbldonationdetails() {
        return this.tbldonationdetails;
    }
    
    public void setTbldonationdetails(Set tbldonationdetails) {
        this.tbldonationdetails = tbldonationdetails;
    }
    public Set getTblproductdetails() {
        return this.tblproductdetails;
    }
    
    public void setTblproductdetails(Set tblproductdetails) {
        this.tblproductdetails = tblproductdetails;
    }




}

