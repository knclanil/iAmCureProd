package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class UserDAO {
	
private static Log log=LogFactory.getLog(UserDAO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserBO user = new UserBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserBO> getAllUsers()
	{
		String query = "from UserBO";
		List<UserBO> userList=null;
		userList = (List<UserBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserBO getuser(int userId)
	{
		UserBO user=null;
		try
		{
			user=(UserBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserBO());
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
