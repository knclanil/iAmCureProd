package com.iamcure.ui.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamcure.bo.UserBO;
import com.iamcure.bo.listener.UserListener;
import com.iamcure.util.UserUtil;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		String phoneNumber = request.getParameter("phoneNumber");
		String email=request.getParameter("email");
		String fullName=request.getParameter("fullName");
		String password=request.getParameter("password");
		String type=request.getParameter("Type");
		
		if(action.equalsIgnoreCase("Register")){
		
		    boolean result=UserListener.createUser(phoneNumber, email, fullName, password,type);
		
			if(result)
				sendResponse(response,"user.jsp?Response="+URLEncoder.encode(fullName+"-created successfully!"));
			else
				sendResponse(response,"user.jsp?Response="+URLEncoder.encode("User not created"));
		
		
		}else if(action.equalsIgnoreCase("Authentication")){
		String username=request.getParameter("username");
		System.out.println("userName::"+username+"--->Password::"+password);
		
		if(username!=null&&username.length()>0){
			
			UserBO user=UserUtil.getInstance().getUserByUserName(username);
			
			if(user==null)
				sendResponse(response,"user.jsp?Response="+URLEncoder.encode("UserName is Not found!!"));
			
			if(user.getPassword().equals(password)){
				sendResponse(response,"user.jsp?Response="+URLEncoder.encode("Success Fully login"));
			}else{
				sendResponse(response,"user.jsp?Response="+URLEncoder.encode("Password is Incorect!!"));
			}
			
		}
			
		}else if(action.equalsIgnoreCase("Reset")){
		request.getParameter("confirmPassword");
			
		}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	}

	private void sendResponse(HttpServletResponse response,String page)
	{
		try {
			response.sendRedirect(page);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
