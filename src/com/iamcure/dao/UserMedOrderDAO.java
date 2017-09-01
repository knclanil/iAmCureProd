package com.iamcure.dao;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserMedOrderBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;

public class UserMedOrderDAO {
	
private static Log log=LogFactory.getLog(UserMedOrderBO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserMedOrderBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserMedOrderBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserMedOrderBO user = new UserMedOrderBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserMedOrderBO> getAllUsers()
	{
		String query = "from UserMedOrderBO";
		List<UserMedOrderBO> userList=null;
		userList = (List<UserMedOrderBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserMedOrderBO getuser(int userId)
	{
		UserMedOrderBO user=null;
		try
		{
			user=(UserMedOrderBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserMedOrderBO());
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
