package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iamcure.util.HibernateUtil;


/**
 * This class is to execute the common methods that are user to perform database operations
 * @author kumar
 *
 */
public class CommonDAO {

	private static Log log=LogFactory.getLog(CommonDAO.class);
	/**
	 * this method is to execute the hibernate queries
	 * @param query
	 * @return
	 */
	public static Object executeHibernateQuery(String query)
	{
		Object objList=null;
		try
		{
			Session session = HibernateUtil.currentSession();
			objList=session.createQuery(query).list();
		}
		catch (HibernateException e) {
			log.error(e);
			log.error("Exception in execute query "+query);
			e.printStackTrace();
		}
		finally{
			HibernateUtil.closeSession();
		}
		return objList;
	}
	
	/**
	 * this method is to execute the hibernate queries
	 * @param query
	 * @return
	 */
	public static Object executeHibernateQuery(String query,int maxLimit)
	{
		Object objList=null;
		try
		{
			Session session = HibernateUtil.currentSession();
			objList=session.createQuery(query).setMaxResults(maxLimit).list();
		}
		catch (HibernateException e) {
			log.error(e);
			log.error("Exception in execute query "+query);
			e.printStackTrace();
		}
		finally{
			HibernateUtil.closeSession();
		}
		return objList;
	}
	
	/**
	 * This method is to insert the record into the database
	 * @param obj
	 * @return
	 */
	public static boolean createRecord(Object obj) {
		boolean bResult = true;
		Transaction tx =null;
		try {
			//get the hibernate session
			Session session = HibernateUtil.currentSession();
			//begin the transaction
			tx = session.beginTransaction();
			//save the object
			session.save(obj);
			//commit the transaction
			tx.commit();
		} catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
			log.error(e);
			log.error("Exception in create record "+obj.getClass().getName());
			e.printStackTrace();
			bResult = false;
		} finally {
			//close the hibernate session
			HibernateUtil.closeSession();
		}
		return bResult;
	}
	public static boolean updateRecord(Object obj) {
		boolean bResult = true;
		Transaction tx =null;
		try {
			//get the hibernate session
			Session session = HibernateUtil.currentSession();
			//begin the transaction
			tx = session.beginTransaction();
			//save the object
			session.update(obj);
			//commit the transaction
			tx.commit();
		} catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
			log.error(e);
			log.error("Exception in update record "+obj.getClass().getName());
			e.printStackTrace();
			bResult = false;
		} finally {
			//close the hibernate session
			HibernateUtil.closeSession();
		}
		return bResult;
	}
	
	
	public static boolean deleteRecord(Object obj)
	{
		boolean bResult=true;
		Transaction  tx=null;
		try
		{
			//get the hibernate session 
			Session session = HibernateUtil.currentSession();
			//begin the transaction
			tx = session.beginTransaction();
			//delete the object from the session
			session.delete(obj);
			//commit the transaction
			tx.commit();
		}
		catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
			log.error(e);
			log.error("Exception in delete record "+obj.getClass().getName());
			bResult=false;
		}
		finally{
			//finally close the transaction
			HibernateUtil.closeSession();
		}
		return bResult;
	}
	
	public static Object getRecordBasedOnPrimaryKey(int id,Object obj)
	{
		Object resultObj=null;
		try
		{
			//get the hibernate session
			Session session = HibernateUtil.currentSession();
			//get the activity object fron the session based on the primary key
			resultObj=(Object) session.get(obj.getClass(), id);
		}
		catch (HibernateException e) {
			log.error(e);
			log.error("Exception in get record by primary key record "+obj.getClass().getName()+" id:"+id);
		}
		finally{
			//finally close the session
			HibernateUtil.closeSession();
		}
		return resultObj;
	}
	public static boolean deleteRecord(int id,Object obj)
	{
		Object resultObj=null;
		try
		{
			resultObj=getRecordBasedOnPrimaryKey(id, obj);
			if(resultObj==null)
				return false;
			return deleteRecord(resultObj);
		}
		catch (HibernateException e) {
			log.error(e);
			log.error("Exception in delete  record "+obj.getClass().getName()+" id:"+id);
		}
		finally{
			//finally close the session
			HibernateUtil.closeSession();
		}
		return false;
	}
	public static Object executeCriteria(Criteria criteria)
	{
		Object resultObj=null;
		try
		{
			resultObj=criteria.list();
		}
		catch (HibernateException e) {
			log.error(e);
			log.error("Exception in criteira execution "+criteria.getAlias());
		}
		return resultObj;
	}
	public static Object executeSQLQuery(String query,String entityAlias,Object obj)
	{
		Object resultObj=null;
		try
		{
			Session session=HibernateUtil.currentSession();
			resultObj=session.createSQLQuery(query).addEntity(entityAlias, obj.getClass()).list();
		}
		catch (HibernateException e) {
			log.error(e);
			log.error("Exception in SQLQuery execution "+obj.getClass().getName());
		}
		finally{
			HibernateUtil.closeSession();
		}
		return resultObj;
	}
	
	
	
	public static void main(String as[])
	{
		
	}
	
}
