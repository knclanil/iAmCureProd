package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.UserMedOrderBO;
import com.iamcure.dao.UserMedOrderDAO;

public class UserMedOrderUtil {

	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, UserMedOrderBO>  userMap=new HashMap<Integer, UserMedOrderBO>();
	
	public static UserLoginHistoryUtil UserLoginHistoryUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public UserMedOrderUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<UserMedOrderBO> usersList=UserMedOrderDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(UserMedOrderBO user:usersList)
			{
				//put the user record in the map
				userMap.put(Integer.valueOf(user.getUser_ID()), user);//Changed TO user_ID
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
			UserMedOrderBO user=userMap.get(userId);
			return user.getStore_Name();//to StoreName
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(UserMedOrderBO user)
	{
		userMap.put(user.getUser_ID(),user);
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
	public List<UserMedOrderBO> getAllUsers()
	{
		List<UserMedOrderBO> userList=new ArrayList<UserMedOrderBO>();
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
	public UserMedOrderBO getUser(int userId)
	{
		if(userMap!=null && userMap.containsKey(Integer.valueOf(userId)))
			return userMap.get(Integer.valueOf(userId));
		else return null;
	}
	
	public List<UserMedOrderBO> getUsers(String empName)
	{
		List<UserMedOrderBO> userList=new ArrayList<UserMedOrderBO>();
		Set<Integer> ids=userMap.keySet();
		for(Integer id:ids)
		{
			UserMedOrderBO user=userMap.get(id);
			String userName=user.getStore_Name();
			if(userName!=null && userName.contains(empName))
				userList.add(user);
		}

		return userList;
	}
	

}
