package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0



/**
 * StateMaster generated by hbm2java
 */
public class StateMaster  implements java.io.Serializable {


     private Integer stateId;
     private String stateName;
     private int countryId;

    public StateMaster() {
    }

    public StateMaster(String stateName, int countryId) {
       this.stateName = stateName;
       this.countryId = countryId;
    }
   
    public Integer getStateId() {
        return this.stateId;
    }
    
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }
    public String getStateName() {
        return this.stateName;
    }
    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public int getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }




}


