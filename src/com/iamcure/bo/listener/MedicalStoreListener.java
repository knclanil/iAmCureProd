package com.iamcure.bo.listener;

import java.util.Calendar;
import com.iamcure.bo.MedicalStoreBO;
import com.iamcure.dao.MedicalStoreDAO;
import com.iamcure.util.DateUtil;
import com.iamcure.util.MedicalStoreUtil;


public class MedicalStoreListener {
	
	public static boolean createOrUpdateMedicalStore(String u_ID,
			String medicalstoreName, String country, String stateName,
			String city, String pinCode, String streetName, String phoneNumber,
			String medicalStorePhoto, String descripition, String storeTimings,
			String storeRating, String storeReview, String medicalPrescription,
			String createdDate, String lastModifiedDate, String createdBy, String lastModifiedBy , String operation) {


		MedicalStoreBO MedicalStore = new MedicalStoreBO();
		MedicalStore.setU_ID(u_ID);
		MedicalStore.setMedicalstoreName(medicalstoreName);
		MedicalStore.setCountry(country);
		MedicalStore.setStateName(stateName);
		MedicalStore.setCity(city);
		MedicalStore.setPinCode(pinCode);
		MedicalStore.setStreetName(streetName);
		MedicalStore.setPhoneNumber(phoneNumber);
		MedicalStore.setMedicalStorePhoto(medicalStorePhoto);
		MedicalStore.setDescripition(descripition);
		MedicalStore.setStoreTimings(storeTimings);
		MedicalStore.setStoreRating(storeRating);
		MedicalStore.setStoreReview(storeReview);
		MedicalStore.setMedicalPrescription(medicalPrescription);
		MedicalStore.setCreatedBy(createdDate);
		Calendar 	lastModDate = DateUtil.getCalFromDbFormatString(lastModifiedDate);
		MedicalStore.setLastModifiedDate(lastModDate);
		MedicalStore.setCreatedBy(createdBy);
		MedicalStore.setLastmodifiedBy(lastModifiedBy);

		if (operation.equals("create")) {
			
			MedicalStore.setCreatedBy(createdBy);
			MedicalStore.setCreatedDate(Calendar.getInstance());

			if (MedicalStoreDAO.createuser(MedicalStore)) {
				MedicalStoreUtil.getInstance().constructMap();
				return true;
			}

		} else if (operation.equals("update")) {
			MedicalStore.setLastmodifiedBy(lastModifiedBy);
			MedicalStore.setLastModifiedDate(Calendar.getInstance());
			if (MedicalStoreDAO.updateuser(MedicalStore)) {
				MedicalStoreUtil.getInstance().constructMap();
				return true;
			}

		}

		return false;
	
		// TODO Auto-generated method stub
		
	}
	

		
}
