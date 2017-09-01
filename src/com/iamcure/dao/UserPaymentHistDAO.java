package com.iamcure.dao;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserPaymentHistBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class UserPaymentHistDAO {

private static Log log=LogFactory.getLog(UserPaymentHistBO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserPaymentHistBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserPaymentHistBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserPaymentHistBO user = new UserPaymentHistBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserPaymentHistBO> getAllUsers()
	{
		String query = "from UserPaymentHistBO";
		List<UserPaymentHistBO> userList=null;
		userList = (List<UserPaymentHistBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserPaymentHistBO getuser(int userId)
	{
		UserPaymentHistBO user=null;
		try
		{
			user=(UserPaymentHistBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserPaymentHistBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return user;
	}
	public static void main(String asd[])
	{
		
	}




}
