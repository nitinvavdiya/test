package com.beans;
// Generated 7 Oct, 2014 9:57:08 PM by Hibernate Tools 3.6.0



/**
 * Tblaccountuser generated by hbm2java
 */
public class Tblaccountuser  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String password;
     private String mobile;
     private String email;

    public Tblaccountuser() {
    }

    public Tblaccountuser(String name, String password, String mobile, String email) {
       this.name = name;
       this.password = password;
       this.mobile = mobile;
       this.email = email;
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
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


