package com.beans;
// Generated 7 Oct, 2014 9:57:08 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Tblaccountuserlogintdetail generated by hbm2java
 */
public class Tblaccountuserlogintdetail  implements java.io.Serializable {


     private Integer id;
     private Date time;
     private String ip;

    public Tblaccountuserlogintdetail() {
    }

	
    public Tblaccountuserlogintdetail(Date time) {
        this.time = time;
    }
    public Tblaccountuserlogintdetail(Date time, String ip) {
       this.time = time;
       this.ip = ip;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }




}

