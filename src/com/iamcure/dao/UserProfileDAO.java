package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserProfileBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;

public class UserProfileDAO {

	
private static Log log=LogFactory.getLog(UserProfileDAO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserProfileBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserProfileBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserProfileBO user = new UserProfileBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserProfileBO> getAllUsers()
	{
		String query = "from UserProfileBO";
		List<UserProfileBO> userList=null;
		userList = (List<UserProfileBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserProfileBO getuser(int userId)
	{
		UserProfileBO user=null;
		try
		{
			user=(UserProfileBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserProfileBO());
		}
		catch (Exception e) {
			log.error(e);
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
