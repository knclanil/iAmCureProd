package com.iamcure.bo.listener;

import java.util.Calendar;

import com.iamcure.bo.BusinessBO;
import com.iamcure.dao.BusinessDAO;
import com.iamcure.util.UserUtil;

public class BusinessListener {

	public static boolean createUser(String phoneNumber,String email,String fullName,String password, String Type){
		BusinessBO user=new BusinessBO();
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);
		user.setFullName(fullName);
		user.setPassword(password);
		Calendar createdDate=Calendar.getInstance();
		user.setCreatedDate(createdDate);
		user.setType(Type);
		boolean result=BusinessDAO.createuser(user);
		
		if(result){
			UserUtil.getInstance().constructMap();
		}
		
		return result;
	}

}
