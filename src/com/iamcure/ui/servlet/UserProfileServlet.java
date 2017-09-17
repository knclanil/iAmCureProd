package com.iamcure.ui.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamcure.bo.listener.UserProfileListener;
import com.iamcure.util.DateUtil;

/**
 * Servlet implementation class UserProfileServlet
 */
public class UserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Enter into user servlet");
		String user_Id=request.getParameter("userId");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String image=request.getParameter("image");
		String releation=request.getParameter("releation");
		String dateOfBirth=request.getParameter("dob");
		String adharcardNumber=request.getParameter("adharcardNumber");
		String country=request.getParameter("country");
		String state=request.getParameter("state");
		String pincode=request.getParameter("pincode");
		String city=request.getParameter("city");
		String address1=request.getParameter("houseNumber");
		String address2=request.getParameter("streetname");
		String phoneNumber=request.getParameter("phoneNumber");
		String eMailId=request.getParameter("email");
		String emergencContact=request.getParameter("emergencContact");
		String createdBy=request.getParameter("createdBy");
		String modifiledBy=request.getParameter("modifiledBy");
		String operation=request.getParameter("operation");
		if(address1!=null && address1.contains("^''''^"))
			address1=address1.replace("^''''^", "#");
		if(address2!=null && address2.contains("^''''^"))
			address2=address2.replace("^''''^", "#");
		
		Calendar 	dateOfBirthCal=DateUtil.getCalFromDbFormatString(dateOfBirth);
		
		UserProfileListener.createOrUpdateUserProfile(user_Id, firstName, lastName, image, releation, dateOfBirthCal,
				adharcardNumber, country, state, city, pincode, address1, address2, phoneNumber,eMailId, 
				emergencContact, createdBy, modifiledBy, operation);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
