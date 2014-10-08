package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * RoleMaster generated by hbm2java
 */
public class RoleMaster  implements java.io.Serializable {


     private Integer roleId;
     private String roleName;
     private String roleDescription;
     private int templeMasterId;
     private byte isDeleted;
     private int makerId;
     private Date DRecordStartdate;
     private Date DRecordEnddate;

    public RoleMaster() {
    }

    public RoleMaster(String roleName, String roleDescription, int templeMasterId, byte isDeleted, int makerId, Date DRecordStartdate, Date DRecordEnddate) {
       this.roleName = roleName;
       this.roleDescription = roleDescription;
       this.templeMasterId = templeMasterId;
       this.isDeleted = isDeleted;
       this.makerId = makerId;
       this.DRecordStartdate = DRecordStartdate;
       this.DRecordEnddate = DRecordEnddate;
    }
   
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleDescription() {
        return this.roleDescription;
    }
    
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
    public int getTempleMasterId() {
        return this.templeMasterId;
    }
    
    public void setTempleMasterId(int templeMasterId) {
        this.templeMasterId = templeMasterId;
    }
    public byte getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }
    public int getMakerId() {
        return this.makerId;
    }
    
    public void setMakerId(int makerId) {
        this.makerId = makerId;
    }
    public Date getDRecordStartdate() {
        return this.DRecordStartdate;
    }
    
    public void setDRecordStartdate(Date DRecordStartdate) {
        this.DRecordStartdate = DRecordStartdate;
    }
    public Date getDRecordEnddate() {
        return this.DRecordEnddate;
    }
    
    public void setDRecordEnddate(Date DRecordEnddate) {
        this.DRecordEnddate = DRecordEnddate;
    }




}


