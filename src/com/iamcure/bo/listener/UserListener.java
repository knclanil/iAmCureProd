package com.iamcure.bo.listener;

import java.util.Calendar;

import com.iamcure.bo.UserBO;
import com.iamcure.dao.UserDAO;
import com.iamcure.util.UserUtil;

public class UserListener {

	public static boolean createUser(String phoneNumber,String email,String fullName,String password, String Type){
		UserBO user=new UserBO();
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);
		user.setFullName(fullName);
		user.setPassword(password);
		Calendar createdDate=Calendar.getInstance();
		user.setCreatedDate(createdDate);
		user.setType(Type);
		boolean result=UserDAO.createuser(user);
		
		if(result){
			UserUtil.getInstance().constructMap();
		}
		
		return result;
	}

}
