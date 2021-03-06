package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.UserLoginHistoryBO;
import com.iamcure.dao.UserLoginHistoryDAO;

public class UserLoginHistoryUtil {
	
	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, UserLoginHistoryBO>  userprofileMap=new HashMap<Integer, UserLoginHistoryBO>();
	
	public static UserLoginHistoryUtil UserLogiHistoryUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public UserLoginHistoryUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<UserLoginHistoryBO> usersList=UserLoginHistoryDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(UserLoginHistoryBO userprofile:usersList)
			{
				//put the user record in the map
				userprofileMap.put(Integer.valueOf(userprofile.getU_ID()), userprofile);//changed to ID to U_ID
			}
		
	}
	
	/**
	 * Singletone method to get teh single tone object
	 * @return
	 */
	public synchronized static UserLoginHistoryUtil getInstance()
	{
		//if the self reference object is null create the object
		if(UserLogiHistoryUtil==null)
			UserLogiHistoryUtil=new UserLoginHistoryUtil();
		return UserLogiHistoryUtil;
	}
	
	/**
	 * This method is to get the employee name
	 * if the employee is not exists then returns empty
	 * @param userId
	 * @return
	 */
	public String getuserName(int userId)
	{
		if(userprofileMap.containsKey(userId))
		{
			UserLoginHistoryBO user=userprofileMap.get(userId);
			return user.getLoging_ID();// instead of fullName Called Loging_Id
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(UserLoginHistoryBO user)
	{
		userprofileMap.put(user.getU_ID(),user);
	}
	
	/**
	 * This method is to delete the employee from the cache
	 * @param userId
	 */
	public void deleteUserFromMap(int userId)
	{
		//if the map contains the user then
		if(userprofileMap.containsKey(userId))
			userprofileMap.remove(userId);//delete the employee from the map
	}
	/**
	 * This method is to get list of all users
	 * @return
	 */
	public List<UserLoginHistoryBO> getAllUsers()
	{
		List<UserLoginHistoryBO> userList=new ArrayList<UserLoginHistoryBO>();
		Set<Integer> ids=userprofileMap.keySet();
		for(Integer id:ids)
		{
			userList.add(userprofileMap.get(id));
		}
		return userList;	
	}
	
	/**
	 * This method is to get the user details
	 * 
	 * @param userId
	 * @return user when exists
	 * returns null when the user details not exists
	 */
	public UserLoginHistoryBO getUser(int userId)
	{
		if(userprofileMap!=null && userprofileMap.containsKey(Integer.valueOf(userId)))
			return userprofileMap.get(Integer.valueOf(userId));
		else return null;
	}
	
	public List<UserLoginHistoryBO> getUsers(String empName)
	{
		List<UserLoginHistoryBO> userList=new ArrayList<UserLoginHistoryBO>();
		Set<Integer> ids=userprofileMap.keySet();
		for(Integer id:ids)
		{
			UserLoginHistoryBO user=userprofileMap.get(id);
			String userName=user.getLoging_ID();// instead of fullName Called Login_Id
			if(userName!=null && userName.contains(empName))
				userList.add(user);
		}

		return userList;
	}
	

}
