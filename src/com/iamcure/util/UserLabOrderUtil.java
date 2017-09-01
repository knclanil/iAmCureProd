package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.UserLabOrderBO;
import com.iamcure.dao.UserLabOrderDAO;

public class UserLabOrderUtil {

	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, UserLabOrderBO>  userMap=new HashMap<Integer, UserLabOrderBO>();
	
	public static UserUtil userUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public UserLabOrderUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<UserLabOrderBO> usersList=UserLabOrderDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(UserLabOrderBO user:usersList)
			{
				//put the user record in the map
				userMap.put(Integer.valueOf(user.getU_ID()), user);
			}
		
	}
	
	/**
	 * Singletone method to get teh single tone object
	 * @return
	 */
	public synchronized static UserUtil getInstance()
	{
		//if the self reference object is null create the object
		if(userUtil==null)
			userUtil=new UserUtil();
		return userUtil;
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
			UserLabOrderBO user=userMap.get(userId);
			return user.getUser_ID();// instead of fullName Called User_ID
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(UserLabOrderBO user)
	{
		userMap.put(user.getU_ID(),user);
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
	public List<UserLabOrderBO> getAllUsers()
	{
		List<UserLabOrderBO> userList=new ArrayList<UserLabOrderBO>();
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
	public UserLabOrderBO getUser(int userId)
	{
		if(userMap!=null && userMap.containsKey(Integer.valueOf(userId)))
			return userMap.get(Integer.valueOf(userId));
		else return null;
	}
	
	public List<UserLabOrderBO> getUsers(String empName)
	{
		List<UserLabOrderBO> userList=new ArrayList<UserLabOrderBO>();
		Set<Integer> ids=userMap.keySet();
		for(Integer id:ids)
		{
			UserLabOrderBO user=userMap.get(id);
			String userName=user.getUser_ID();// instead of fullName Called User_ID
			if(userName!=null && userName.contains(empName))
				userList.add(user);
		}

		return userList;
	}
	

	
}
