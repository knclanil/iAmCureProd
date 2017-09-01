package com.iamcure.bo;

public class UserMedOrderBO {
	private int U_ID;
	private Integer User_ID;
	private String TimeStamp;
	private String Store_ID;
	private String Store_Name;
	private String Ordered_Time;
	private String Payment_Type;
	private String Description;
	public int getU_ID() {
		return U_ID;
	}
	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}
	public Integer getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(Integer user_ID) {
		User_ID = user_ID;
	}
	public String getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getStore_ID() {
		return Store_ID;
	}
	public void setStore_ID(String store_ID) {
		Store_ID = store_ID;
	}
	public String getStore_Name() {
		return Store_Name;
	}
	public void setStore_Name(String store_Name) {
		Store_Name = store_Name;
	}
	public String getOrdered_Time() {
		return Ordered_Time;
	}
	public void setOrdered_Time(String ordered_Time) {
		Ordered_Time = ordered_Time;
	}
	public String getPayment_Type() {
		return Payment_Type;
	}
	public void setPayment_Type(String payment_Type) {
		Payment_Type = payment_Type;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
