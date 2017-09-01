package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserLoginHistoryBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class UserLoginHistoryDAO {

private static Log log=LogFactory.getLog(UserLoginHistoryDAO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserLoginHistoryBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserLoginHistoryBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserLoginHistoryBO user = new UserLoginHistoryBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserLoginHistoryBO> getAllUsers()
	{
		String query = "from UserLoginHistoryBO";
		List<UserLoginHistoryBO> userList=null;
		userList = (List<UserLoginHistoryBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserLoginHistoryBO getuser(int userId)
	{
		UserLoginHistoryBO user=null;
		try
		{
			user=(UserLoginHistoryBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserLoginHistoryBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return user;
	}
	


	
}
