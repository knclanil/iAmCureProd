function submitToParent(){
	
	var phoneNumber=document.getElementById("phoneNumber").value;
	var email=document.getElementById("email").value;
    var fullName=document.getElementById("fullName").value;
	var password=document.getElementById("upassword").value;
	
	var confirmPassword=document.getElementById("confirmPassword").value;
	
	if(validateform())
	{
           addUser(phoneNumber,email,fullName,password,confirmPassword);
	}else 
		return false;
	
}

function addUser(phoneNumber,email,fullName,password,confirmPassword){
	
	document.location.href ="UserServlet?action=Register&phoneNumber="+phoneNumber+"&email="+email+"&fullName="+fullName+"&password="+password;
	
}

function autenticateUser(username,password){
	
	document.location.href ="UserServlet?action=Authentication&username="+username+"&password="+password;
	alert("action is authentication::");
	
}

function validateform()
{
	var 	valid= true;
	var		phoneNumber= document.getElementById("phoneNumber");
	var		email= document.getElementById("email");
	var	    fullName= document.getElementById("fullName");
	var	 	password= document.getElementById("upassword");
	var		confirmPassword= document.getElementById("confirmPassword");
	
	if(phoneNumber.value=='' )
	{
		alert("please enter PhoneNumber!");
		phoneNumber.focus();
		return false;
	}
	else if (email.value=='')
	{
		alert("please enter Email!");
		email.focus();
		return false;
	}else if (fullName.value=='')
	{
		alert("please enter Full Name!");
		fullName.focus();
		return false;
	}else if (password.value=='')
	{
		alert("please enter Password!");
		password.focus();
		return false;
	}else if(confirmPassword.value==''){
		alert("please enter Confirm Password!");
		confirmPassword.focus();
		return false;
	}
	
	
	/*if(password!=cofirmPassword){
		alert("Password and Confirm Password not Match!");
		password.focus();
		confirmPassword.focus();
		return false;
	}*/
	
	return valid;
}


function submitToLogin(){
	
	 var username=document.getElementById("username").value;
	 var password=document.getElementById("password").value;
	 
	 if(validateLoginFields()){
		 autenticateUser(username,password); 
	 }else{
		 return false;
	 }
}

function validateLoginFields()
{
	var 	valid= true;
	var		username= document.getElementById("username");
	var	 	password= document.getElementById("password");
	
	if(username.value=='' )
	{
		alert("please enter UserName!");
		username.focus();
		return false;
	}
	else if (password.value=='')
	{
		alert("please enter Password!");
		password.focus();
		return false;
	}
	
	return valid;
}