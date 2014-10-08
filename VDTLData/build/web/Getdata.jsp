<%-- 
    Document   : Getdata
    Created on : 7 Oct, 2014, 10:06:18 PM
    Author     : nitin
--%>

<%@page import="java.util.List"%>
<%@page import="com.helper.NewHibernateUtil"%>
<%@page import="com.beans.Tbldonor"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session Hibsession = sessionFactory.openSession();
        List<Tbldonor> donorList = Hibsession.createQuery("from Tbldonor").list();
        System.out.println("----donor list size--->"+donorList.size());
        
        %>
    </body>
</html>
