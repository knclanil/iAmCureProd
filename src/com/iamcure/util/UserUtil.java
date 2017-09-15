package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.UserBO;
import com.iamcure.dao.UserDAO;

public class UserUtil	 {
	
	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, UserBO>  userMap=new HashMap<Integer, UserBO>();
	
	public static UserUtil UserLoginHistoryUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public UserUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<UserBO> usersList=UserDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(UserBO user:usersList)
			{
				//put the user record in the map
				userMap.put(Integer.valueOf(user.getId()), user);
			}
		
	}
	
	/**
	 * Singletone method to get teh single tone object
	 * @return
	 */
	public synchronized static UserUtil getInstance()
	{
		//if the self reference object is null create the object
		if(UserLoginHistoryUtil==null)
			UserLoginHistoryUtil=new UserUtil();
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
			UserBO user=userMap.get(userId);
			return user.getFullName();
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(UserBO user)
	{
		userMap.put(user.getId(),user);
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
	public List<UserBO> getAllUsers()
	{
		List<UserBO> userList=new ArrayList<UserBO>();
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
	public UserBO getUser(int userId)
	{
		if(userMap!=null && userMap.containsKey(Integer.valueOf(userId)))
			return userMap.get(Integer.valueOf(userId));
		else return null;
	}
	
    public UserBO getUserByUserName(String userName){
		UserBO userNameUserBO = null;
		Set<Integer> ids = userMap.keySet();
		for (Integer id : ids) {
			UserBO user = userMap.get(id);

			if (user != null&& (user.getPhoneNumber() != null || user.getEmail() != null)) {

				if (user.getPhoneNumber().equals(userName)|| user.getEmail().equals(userName)) {

					return user;
				}
			}

		}

		return userNameUserBO;
    }
	

}
