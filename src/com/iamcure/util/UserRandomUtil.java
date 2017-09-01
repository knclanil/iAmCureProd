package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.UserRandomBO;
import com.iamcure.dao.UserRandomDAO;

public class UserRandomUtil {

	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, UserRandomBO>  userMap=new HashMap<Integer, UserRandomBO>();
	
	public static UserLoginHistoryUtil UserLoginHistoryUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public UserRandomUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<UserRandomBO> usersList=UserRandomDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(UserRandomBO user:usersList)
			{
				//put the user record in the map
				userMap.put(Integer.valueOf(user.getU_ID()), user);//changed to U_ID
			}
		
	}
	
	/**
	 * Singletone method to get teh single tone object
	 * @return
	 */
	public synchronized static UserLoginHistoryUtil getInstance()
	{
		//if the self reference object is null create the object
		if(UserLoginHistoryUtil==null)
			UserLoginHistoryUtil=new UserLoginHistoryUtil();
		return UserLoginHistoryUtil;
	}
	
	/**
	 * This method is to get the employee name
	 * if the employee is not exists then returns empty
	 * @param userId
	 * @return
	 */
	public String getuserName(int userId)
	{
		if(userMap.containsKey(userId))
		{
			UserRandomBO user=userMap.get(userId);
			return user.getUser_Name();//changed to User_Id
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(UserRandomBO user)
	{
		userMap.put(user.getU_ID(),user);//changed to U_ID
	}
	
	/**
	 * This method is to delete the employee from the cache
	 * @param userId
	 */
	public void deleteUserFromMap(int userId)
	{
		//if the map contains the user then
		if(userMap.containsKey(userId))
			userMap.remove(userId);//delete the employee from the map
	}
	/**
	 * This method is to get list of all users
	 * @return
	 */
	public List<UserRandomBO> getAllUsers()
	{
		List<UserRandomBO> userList=new ArrayList<UserRandomBO>();
		Set<Integer> ids=userMap.keySet();
		for(Integer id:ids)
		{
			userList.add(userMap.get(id));
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
	public UserRandomBO getUser(int userId)
	{
		if(userMap!=null && userMap.containsKey(Integer.valueOf(userId)))
			return userMap.get(Integer.valueOf(userId));
		else return null;
	}
	
	public List<UserRandomBO> getUsers(String empName)
	{
		List<UserRandomBO> userList=new ArrayList<UserRandomBO>();
		Set<Integer> ids=userMap.keySet();
		for(Integer id:ids)
		{
			UserRandomBO user=userMap.get(id);
			String userName=user.getUser_Name();//changed to user_Name
			if(userName!=null && userName.contains(empName))
				userList.add(user);
		}

		return userList;
	}
	

}
