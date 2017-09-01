package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserPaymentInfoBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;

public class UserPaymentInfoDAO {

private static Log log=LogFactory.getLog(UserPaymentInfoBO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserPaymentInfoBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserPaymentInfoBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserPaymentInfoBO user = new UserPaymentInfoBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserPaymentInfoBO> getAllUsers()
	{
		String query = "from UserPaymentInfoBO";
		List<UserPaymentInfoBO> userList=null;
		userList = (List<UserPaymentInfoBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserPaymentInfoBO getuser(int userId)
	{
		UserPaymentInfoBO user=null;
		try
		{
			user=(UserPaymentInfoBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserPaymentInfoBO());
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
