package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0



/**
 * UserTempleRelation generated by hbm2java
 */
public class UserTempleRelation  implements java.io.Serializable {


     private Integer userTempleRelationId;
     private int userMasterId;
     private int templeMasterId;

    public UserTempleRelation() {
    }

    public UserTempleRelation(int userMasterId, int templeMasterId) {
       this.userMasterId = userMasterId;
       this.templeMasterId = templeMasterId;
    }
   
    public Integer getUserTempleRelationId() {
        return this.userTempleRelationId;
    }
    
    public void setUserTempleRelationId(Integer userTempleRelationId) {
        this.userTempleRelationId = userTempleRelationId;
    }
    public int getUserMasterId() {
        return this.userMasterId;
    }
    
    public void setUserMasterId(int userMasterId) {
        this.userMasterId = userMasterId;
    }
    public int getTempleMasterId() {
        return this.templeMasterId;
    }
    
    public void setTempleMasterId(int templeMasterId) {
        this.templeMasterId = templeMasterId;
    }




}


