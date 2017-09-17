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


function autenticateUser(username,password){
	window.event.returnValue = false;
	alert("hi");
	//document.location.href="UserServlet?action=Register&phoneNumber=12345&email=nav&fullName=masava&password=sac";
	document.location.href="UserServlet?action=Authentication&username=9705755597&userpassword=krishna5799";
}

function addUser(phoneNumber,email,fullName,password,confirmPassword){
	window.event.returnValue = false;
	document.location.href="UserServlet?action=Register&phoneNumber="+phoneNumber+"&email="+email+"&fullName="+fullName+"&password="+password;
	
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
	
	 var username=document.getElementById("userUserName").value;
	 var password=document.getElementById("userPassword").value;
	 
	 if(validateLoginFields()){
		 autenticateUser(username,password); 
	 }else
	return false;
	 
}

function validateLoginFields()
{
	var 	valid= true;
	var		username= document.getElementById("userUserName");
	var	 	password= document.getElementById("userPassword");
	
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