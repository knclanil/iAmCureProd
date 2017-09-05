package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.BusinessBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class BusinessDAO {
	
private static Log log=LogFactory.getLog(BusinessDAO.class);
	
	/**
	 * This method to create the Business
	 * @param Business
	 * @return
	 */
	public static boolean createBusiness(BusinessBO Business) {
		return CommonDAO.createRecord(Business);
	}

	/**
	 * This method is to update the Business
	 * @param Business
	 * @return
	 */
	public static boolean updateBusiness(BusinessBO Business) {
		return CommonDAO.updateRecord(Business);
	}
	
	/**
	 * This method to to delete the Business
	 * @param BusinessId
	 * @return
	 */
	public static boolean deleteBusiness(int BusinessId)
	{
		BusinessBO Business = new BusinessBO();
		return CommonDAO.deleteRecord(BusinessId,Business);
	}
	
	/**
	 * This method is to get the list of all Businesss
	 * @return
	 */
	public static List<BusinessBO> getAllBusinesss()
	{
		String query = "from BusinessBO";
		List<BusinessBO> BusinessList=null;
		BusinessList = (List<BusinessBO>)CommonDAO.executeHibernateQuery(query);
		return BusinessList;	
	}
	
	/**
	 * This method to get the Business datails
	 * @param BusinessId
	 * @return
	 */
	public static BusinessBO getBusiness(int BusinessId)
	{
		BusinessBO Business=null;
		try
		{
			Business=(BusinessBO) CommonDAO.getRecordBasedOnPrimaryKey(BusinessId, new BusinessBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return Business;
	}
	public static void main(String asd[])
	{
		
	}

	public static boolean createuser(BusinessBO user) {
		// TODO Auto-generated method stub
		return false;
	}

}
