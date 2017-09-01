package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Hibernate;

import com.iamcure.bo.UserDocAppointmentBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class UserDocAppointmentDAO {
	
private static Log log=LogFactory.getLog(UserDocAppointmentBO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserDocAppointmentBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserDocAppointmentBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserDocAppointmentBO user = new UserDocAppointmentBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserDocAppointmentBO> getAllUsers()
	{
		String query = "from UserDocAppointmentBO";
		List<UserDocAppointmentBO> userList=null;
		userList = (List<UserDocAppointmentBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserDocAppointmentBO getuser(int userId)
	{
		UserDocAppointmentBO user=null;
		try
		{
			user=(UserDocAppointmentBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserDocAppointmentBO());
		}
		catch (Exception e) {
			//Logger.error(e);
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
