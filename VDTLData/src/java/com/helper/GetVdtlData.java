/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helper;

import com.beans.Tblaccount;
import com.beans.Tblarea;
import com.beans.Tbldonationdetail;
import com.beans.Tbldonor;
import com.vdtltest.AccountManagementMaster;
import com.vdtltest.AreaManagement;
import com.vdtltest.DonationReceiptInfo;
import com.vdtltest.UserAddressInfo;
import com.vdtltest.UserInfo;
import com.vdtltest.UserMaster;
import java.math.BigDecimal;
//import com.vdtltest.UserMaster;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.omg.CORBA.OBJECT_NOT_EXIST;

/**
 *
 * @author nitin
 */
public class GetVdtlData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory oldsessionFactory = NewHibernateUtil.getOldSessionFactory();
        Session session = oldsessionFactory.openSession();
        List<Tbldonor> donorList = session.createQuery("from Tbldonor").list();
        List<Tblarea> areaList = session.createQuery("from Tblarea").list();
        List<Tblaccount> accountList = session.createQuery("from Tblaccount").list();
      try{
            SetDonorData(donorList);
           // setArea(areaList);
          //  setAccount(accountList);
      }catch(Exception e){
          e.printStackTrace();
      }
      session.close();
      oldsessionFactory.close();
    }
    public static void SetDonorData(List<Tbldonor> donorList) throws SQLException{
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        String url = "jdbc:mysql://localhost:3306/templelatest?zeroDateTimeBehavior=convertToNull";
//        Connection connection = DriverManager.getConnection(url, "root", "nitin");
//        System.out.println("templetest connected");
//        Statement statement = connection.createStatement();
//        
        //-------
        SessionFactory newsessionFactory = NewHibernateUtil.getNewSessionFactory();
            Session session = newsessionFactory.openSession();
            
            Transaction newTra = session.beginTransaction();
         SessionFactory oldsessionfactory = NewHibernateUtil.getOldSessionFactory();
         Session oldSession  = oldsessionfactory.openSession();
         Transaction oldtra = oldSession.beginTransaction();
        for(int i=0;i<donorList.size();i++){
            System.out.println("-----------------inside for loop---->"+i);
            Tbldonor donor = donorList.get(i);
            Set<Tbldonationdetail> donationdetails = donor.getTbldonationdetails();
            Iterator<Tbldonationdetail> iterator = donationdetails.iterator();
            int totalamount = 0;
            while(iterator.hasNext()){
                Tbldonationdetail tbldonationdetail = iterator.next();
                totalamount = totalamount+tbldonationdetail.getAmount();
                // tbldonationdetail.ge
            }
            String city = donor.getTblcity().getName();
            String area  = donor.getTblarea().getName();
            String firtname = donor.getFirstname();
            String lastname = donor.getLastname();
            String address = donor.getAddress();
            String email = donor.getEmail();
            int id = donor.getId();
            String mobile = donor.getMobile();
            
            //saving data in othere table
            UserMaster user = new UserMaster();
            user.setFirstName(firtname);
            user.setLastName(lastname);
            user.setEmailid(email);
            user.setUsername(firtname+lastname);
            user.setPassword("111111");
            user.setMobileNo(Double.parseDouble(mobile));
            user.setTempleMasterId(1);
            user.setRoleId(0);
            user.setMakerId(0);
            Date d = new Date();
            user.setSystemDatetime(d);
            user.setDRecordEnddate(d);
            user.setDRecordStartdate(d);
            
            //
            System.out.println("-------saving user");
            session.saveOrUpdate(user);
            System.out.println("------------user saved");
            //address data
            UserAddressInfo userAddressInfo = new UserAddressInfo();
            userAddressInfo.setAddress(address);
            userAddressInfo.setUserMaster(user);
            userAddressInfo.setAreaId(donor.getTblarea().getId());
            userAddressInfo.setCityId(0);
            userAddressInfo.setCountryId(0);
            userAddressInfo.setDRecordEnddate(new Date());
            userAddressInfo.setDRecordStartdate(new Date());
            userAddressInfo.setPincode(0);
            userAddressInfo.setStateId(0);
            userAddressInfo.setSystemDatetime(new Date());
            System.out.println("------------saving userAddressInfo");
            session.saveOrUpdate(userAddressInfo);
            System.out.println("-------------userAddressInfo saved");
            
            //donationReciptmaster
            //select sum(amount),receiptno,donorid,accountid,userid,productid,qty,date from tbldonationdetail where donorid=22 group by receiptno;
           List<Object[]> datalist = oldSession.createSQLQuery("select sum(amount),receiptno,donorid,accountid,userid,productid,qty,date from tbldonationdetail where donorid="+donor.getId()+" group by receiptno").list();
           for(int j=0;j<datalist.size();j++){
               System.out.println("--------------inside inner for loop --->"+j);
               DonationReceiptInfo donationReceiptInfo = new DonationReceiptInfo();
               Object[] data = datalist.get(j);
               donationReceiptInfo.setAccountManagementMaster(new AccountManagementMaster((int)data[5], "", 1, 0, (byte)0, new Date(), ""));
               donationReceiptInfo.setAmount(totalamount);
               donationReceiptInfo.setGuestDonorName("");
               donationReceiptInfo.setPrasadId((Integer)data[5]);
               String receiptid = (String)data[1];
               if(receiptid!=""){
                   donationReceiptInfo.setReceiptId(Integer.parseInt((String)data[1]));
               }else{
                   donationReceiptInfo.setReceiptId(0);
               }
               
               donationReceiptInfo.setTempleId(1);
               System.out.println("------------saving donationReceiptInfo");
//               session.saveOrUpdate(donationReceiptInfo);
               System.out.println("----------------------donationReceiptInfo saved");
           }
           
            //user info data
            UserInfo userinfo = new UserInfo();
            userinfo.setAddress(address);
            userinfo.setUserMaster(user);
            userinfo.setDob("");
            userinfo.setFacebookId("");
            userinfo.setDrivingLicenceNo("");
            userinfo.setImage("");
            userinfo.setIsDeleted(0);
            userinfo.setLandlineNo(0);
            userinfo.setPancardNo("");
            userinfo.setElectionCardNo("");
            userinfo.setAdharCardNo("");
            
            System.out.println("-------------------saving userinfo");
            session.saveOrUpdate(userinfo);
            System.out.println("-------------------userinfo saved");
            
            
        }
        newTra.commit();
            oldtra.commit();       
    }

    private static void setArea(List<Tblarea> areaList) {
        System.out.println("---seting area size---->"+areaList.size());
         SessionFactory newsessionFactory = NewHibernateUtil.getNewSessionFactory();
        Session session = newsessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        for(int i=0;i<areaList.size();i++){
            AreaManagement areaManagement = new AreaManagement();
            Tblarea arae = areaList.get(i);
            System.out.println("area id----->"+arae.getId()+"----name---"+arae.getName());
            areaManagement.setAreaName(arae.getName());
            areaManagement.setDRecordEnddate(new Date());
            areaManagement.setDRecordStartdate(new Date());
            areaManagement.setMakerId(0);
            areaManagement.setSystemDatetime(new Date());
            areaManagement.setIsDeleted((byte)0);
            session.saveOrUpdate(areaManagement);
            System.out.println("---------------------saved");
            
        }
        transaction.commit();
        session.close();
        newsessionFactory.close();
    }

    private static void setAccount(List<Tblaccount> accountList) {
        SessionFactory newsessionFactory = NewHibernateUtil.getNewSessionFactory();
        Session session = newsessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
         for(int i=0;i<accountList.size();i++){
             Tblaccount account = accountList.get(i);
             
         }
    }
    
}
