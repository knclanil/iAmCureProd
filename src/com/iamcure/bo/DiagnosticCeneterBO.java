package com.iamcure.bo;

import java.util.Calendar;

public class DiagnosticCeneterBO {

	private int U_ID;
	private String DiagnosticCenter;
	private String Country;
	private String StateName;
	private String City;
	private int PinCode;
	private String StreetName;
	private String PhoneNumber;
	private String DiagnosticCenterPhoto;
	private String Descripition;
	private String StoreTimings;
	private String StoreRating;
	private String StoreReview;
	private String MedicalPrescription;
	private String Report;
	private Calendar CreatedDate;
	private Calendar LastModifiedDate;
	public int getU_ID() {
		return U_ID;
	}
	

	public String getDiagnosticCenter() {
		return DiagnosticCenter;
	}
	public void setDiagnosticCenter(String diagnosticCenter) {
		DiagnosticCenter = diagnosticCenter;
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
	public String getDiagnosticCenterPhoto() {
		return DiagnosticCenterPhoto;
	}
	public void setDiagnosticCenterPhoto(String diagnosticCenterPhoto) {
		DiagnosticCenterPhoto = diagnosticCenterPhoto;
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
	public String getReport() {
		return Report;
	}
	public void setReport(String report) {
		Report = report;
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
	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}
}