package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserMedicalHistBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class UserMedicalHistDAO {

private static Log log=LogFactory.getLog(UserMedicalHistBO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserMedicalHistBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserMedicalHistBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserMedicalHistBO user = new UserMedicalHistBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserMedicalHistBO> getAllUsers()
	{
		String query = "from UserMedicalHistBO";
		List<UserMedicalHistBO> userList=null;
		userList = (List<UserMedicalHistBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserMedicalHistBO getuser(int userId)
	{
		UserMedicalHistBO user=null;
		try
		{
			user=(UserMedicalHistBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserMedicalHistBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return user;
	}
	
	}