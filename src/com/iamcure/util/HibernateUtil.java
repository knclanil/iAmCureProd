package com.iamcure.util;

import org.hibernate.CacheMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * This class is to get the hibernate sessions
 * @author berlin.brown
 *
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            ex.printStackTrace();
        	System.err.println("Initial SessionFactory creation failed.");
            throw new ExceptionInInitializerError(ex);
        } // end of the try - catch block
    } // end of static block

    public static final ThreadLocal session = new ThreadLocal();

    public static Session currentSession() throws HibernateException {

        Session s = (Session) session.get();

        // Open a new Session, if this Thread has none yet
        if (s == null) {
            s = sessionFactory.openSession();
            //s.clear();
            s.setCacheMode(CacheMode.IGNORE);
            session.set(s);
        }
        return s;
    }

    public static void closeSession() throws HibernateException {
        Session s = (Session) session.get();
        session.set(null);
        if (s != null && s.isOpen())
        {
            s.clear();
           	s.close();
        }
    } // end of the method
} // end of the class
