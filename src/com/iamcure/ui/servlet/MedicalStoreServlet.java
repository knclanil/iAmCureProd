package com.iamcure.ui.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamcure.bo.listener.MedicalStoreListener;
import com.iamcure.util.DateUtil;

/**
 * Servlet implementation class MedicalStoreServelet
 */
public class MedicalStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public MedicalStoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String u_ID=request.getParameter("");
		String medicalstoreName=request.getParameter("");
		String country=request.getParameter("");
		String stateName=request.getParameter("");
		String city=request.getParameter("");
		String pinCode=request.getParameter("");
		String streetName=request.getParameter("");
		String phoneNumber=request.getParameter("");
		String medicalStorePhoto=request.getParameter("");
		String descripition=request.getParameter("");
		String storeTimings=request.getParameter("");
		String storeRating=request.getParameter("");
		String storeReview=request.getParameter("");
		String medicalPrescription=request.getParameter("");
		String createdDate=request.getParameter("");
		String lastModifiedDate=request.getParameter("");
		String createdBy=request.getParameter("");
		String lastModifiedBy=request.getParameter("");
		String Operation=request.getParameter("operation");
		if(streetName!=null && streetName.contains("^''''^"))
			streetName=streetName.replace("^''''^", "#");
		if(medicalstoreName!=null && medicalstoreName.contains("^''''^"))
			medicalstoreName=medicalstoreName.replace("^''''^", "#");
		
		DateUtil.getCalFromDbFormatString(createdDate);
		
		MedicalStoreListener.createOrUpdateMedicalStore(u_ID, medicalstoreName, 
		country, stateName, city, pinCode, streetName, phoneNumber, medicalStorePhoto, descripition, 
		storeTimings, storeRating, storeReview, medicalPrescription, createdDate, lastModifiedDate, createdBy,lastModifiedBy , Operation);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
