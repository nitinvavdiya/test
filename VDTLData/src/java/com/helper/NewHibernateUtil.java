/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author nitin
 */
public class NewHibernateUtil {

    private static final SessionFactory oldsessionFactory;
    private static final SessionFactory newsessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            oldsessionFactory = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            newsessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();

        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getOldSessionFactory() {
        return oldsessionFactory;
    }
    public static SessionFactory getNewSessionFactory() {
        return newsessionFactory;
    }
}
