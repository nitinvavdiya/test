package com.vdtltest;
// Generated 8 Oct, 2014 11:47:29 AM by Hibernate Tools 3.6.0



/**
 * GuestUserMaster generated by hbm2java
 */
public class GuestUserMaster  implements java.io.Serializable {


     private Integer guestUserId;
     private String firstName;
     private String lastName;
     private int countryId;
     private int stateId;
     private int cityId;
     private String address;
     private int mobileno;
     private int roomBookingId;

    public GuestUserMaster() {
    }

    public GuestUserMaster(String firstName, String lastName, int countryId, int stateId, int cityId, String address, int mobileno, int roomBookingId) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.countryId = countryId;
       this.stateId = stateId;
       this.cityId = cityId;
       this.address = address;
       this.mobileno = mobileno;
       this.roomBookingId = roomBookingId;
    }
   
    public Integer getGuestUserId() {
        return this.guestUserId;
    }
    
    public void setGuestUserId(Integer guestUserId) {
        this.guestUserId = guestUserId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
    public int getStateId() {
        return this.stateId;
    }
    
    public void setStateId(int stateId) {
        this.stateId = stateId;
    }
    public int getCityId() {
        return this.cityId;
    }
    
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public int getMobileno() {
        return this.mobileno;
    }
    
    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }
    public int getRoomBookingId() {
        return this.roomBookingId;
    }
    
    public void setRoomBookingId(int roomBookingId) {
        this.roomBookingId = roomBookingId;
    }




}

