package com.iamcure.bo;

import java.util.Calendar;
public class UserLoginHistoryBO {
	
	private Integer U_ID;
	
	private String Loging_ID;
	
	private Calendar Loging_date;
	
	private Calendar Logout_Date;
	
	private String Location;

	public Integer getU_ID() {
		return U_ID;
	}

	public void setU_ID(Integer u_ID) {
		U_ID = u_ID;
	}

	public String getLoging_ID() {
		return Loging_ID;
	}

	public void setLoging_ID(String loging_ID) {
		Loging_ID = loging_ID;
	}

	public Calendar getLoging_date() {
		return Loging_date;
	}

	public void setLoging_date(Calendar loging_date) {
		Loging_date = loging_date;
	}

	public Calendar getLogout_Date() {
		return Logout_Date;
	}

	public void setLogout_Date(Calendar logout_Date) {
		Logout_Date = logout_Date;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	}
