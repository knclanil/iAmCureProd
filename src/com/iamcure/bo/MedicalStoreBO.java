package com.iamcure.bo;

import java.util.Calendar;

public class MedicalStoreBO {

	private int U_ID;
	private String MedicalstoreName;
	private String Country;
	private String StateName;
	private String City;
	private int PinCode;
	private String StreetName;
	private String PhoneNumber;
	private String MedicalStorePhoto;
	private String Descripition;
	private String StoreTimings;
	private String StoreRating;
	private String StoreReview;
	private String MedicalPrescription;
	private Calendar CreatedDate;
	private Calendar LastModifiedDate;
	public int getU_ID() {
		return U_ID;
	}
	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}
	public String getMedicalstoreName() {
		return MedicalstoreName;
	}
	public void setMedicalstoreName(String medicalstoreName) {
		MedicalstoreName = medicalstoreName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPinCode() {
		return PinCode;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getMedicalStorePhoto() {
		return MedicalStorePhoto;
	}
	public void setMedicalStorePhoto(String medicalStorePhoto) {
		MedicalStorePhoto = medicalStorePhoto;
	}
	public String getDescripition() {
		return Descripition;
	}
	public void setDescripition(String descripition) {
		Descripition = descripition;
	}
	public String getStoreTimings() {
		return StoreTimings;
	}
	public void setStoreTimings(String storeTimings) {
		StoreTimings = storeTimings;
	}
	public String getStoreRating() {
		return StoreRating;
	}
	public void setStoreRating(String storeRating) {
		StoreRating = storeRating;
	}
	public String getStoreReview() {
		return StoreReview;
	}
	public void setStoreReview(String storeReview) {
		StoreReview = storeReview;
	}
	public String getMedicalPrescription() {
		return MedicalPrescription;
	}
	public void setMedicalPrescription(String medicalPrescription) {
		MedicalPrescription = medicalPrescription;
	}
	public Calendar getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Calendar createdDate) {
		CreatedDate = createdDate;
	}
	public Calendar getLastModifiedDate() {
		return LastModifiedDate;
	}
	public void setLastModifiedDate(Calendar lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
	}
}
