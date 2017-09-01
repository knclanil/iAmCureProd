package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserLabOrderBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class UserLabOrderDAO {
private static Log log=LogFactory.getLog(UserDAO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserLabOrderBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserLabOrderBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserLabOrderBO user = new UserLabOrderBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserLabOrderBO> getAllUsers()
	{
		String query = "from UserLabOrderBO";
		List<UserLabOrderBO> userList=null;
		userList = (List<UserLabOrderBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserLabOrderBO getuser(int userId)
	{
		UserLabOrderBO user=null;
		try
		{
			user=(UserLabOrderBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserLabOrderBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return user;
	}


}
