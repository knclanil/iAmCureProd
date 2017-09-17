function submitToPatient(){
	
		var firstname=document.getElementById("firstname").value;
		var lastname=document.getElementById("lastname").value;
		var releationship=document.getElementById("releationship").value;
		var dob=document.getElementById("dob").value;
		var adharCardnumber=document.getElementById("adharCardnumber").value;
		var country=document.getElementById("country").value;
		var state=document.getElementById("state").value;
		var pincode=document.getElementById("pincode").value;
		var city=document.getElementById("city").value;
		var houseNumber=document.getElementById("houseNumber").value;
		var streetname=document.getElementById("streetname").value;
		var phoneNumber=document.getElementById("phoneNumber").value;
		var email=document.getElementById("email").value;
		var emergencContact=document.getElementById("emergencContact").value;
		//var Emergenc_Contact_2=document.getElementById("Emergenc_Contact_2").value;
		
	
	if(validateform())
	{
           addUserProfile( firstname,lastname,releationship,dob,adharCardnumber,country,state,pincode,city,houseNumber,streetname,phoneNumber,email, emergencContact);
	}else 
		return false;
	
}

function addUserProfile( firstname,lastname,releationship,dob,adharCardnumber,country,state,pincode,city,houseNumber,streetname,phoneNumber,email, emergencContact, CreateDate, CreatedBy, LastModifiedBy, LastModified_Date){
	document.location.href = "UserProfileServlet?action=Submint&&firstname="+firstname+"&lastname="+lastname+"&releationship="+releationship+"&dob="+dob+"&adharCardnumber="+adharCardnumber+"&country="+country+"&state="+state+"&pincode="+pincode+"&city="+city+"&houseNumber="+houseNumber+"&streetname="+streetname+"&phoneNumber="+phoneNumber+"&email="+email+"&emergencContact="+emergencContact;
}


function validateform()
{
	var 	valid= true;
	var firstname=document.getElementById("firstname");
	var lastname=document.getElementById("lastname");
	var releationship=document.getElementById("releationship");
	var dob=document.getElementById("dob");
	var adharCardnumber=document.getElementById("adharCardnumber");
	var country=document.getElementById("country");
	var state=document.getElementById("state");
	var pincode=document.getElementById("pincode");
	var city=document.getElementById("city");
	var houseNumber=document.getElementById("houseNumber");
	var streetname=document.getElementById("streetname");
	var phoneNumber=document.getElementById("phoneNumber");
	var email=document.getElementById("email");
	var emergencContact=document.getElementById("emergencContact");
	
	
	if (firstname.value=='')
	{
		alert("please enter firstname!");
		firstname.focus();
		return false;
	}
	else if (lastname.value=='')
	{
		alert("please enter lastname!");
		lastname.focus();
		return false;
	}
	else if (releationship.value=='')
	{
		alert("please enter releationship!");
		releationship.focus();
		return false;
	}
	else if (dob.value=='')
	{
		alert("please enter dob!");
		dob.focus();
		return false;
	}
	else if (adharCardnumber.value=='')
	{
		alert("please enter adharCardnumber!");
		adharCardnumber.focus();
		return false;
	}
	else if (country.value=='')
	{
		alert("please enter country!");
		country.focus();
		return false;
	}
	else if (state.value=='')
	{
		alert("please enter state!");
		state.focus();
		return false;
	}
	else if (pincode.value=='')
	{
		alert("please enter pincode!");
		pincode.focus();
		return false;
	}
	else if (city.value=='')
	{
		alert("please enter city!");
		city.focus();
		return false;
	}
		else if (houseNumber.value=='')
	{
		alert("please enter houseNumber!");
		houseNumber.focus();
		return false;
	}
		else if (streetname.value=='')
	{
		alert("please enter streetname!");
		streetname.focus();
		return false;
	}
	else if (phoneNumber.value=='')
	{
		alert("please enter phoneNumber!");
		phoneNumber.focus();
		return false;
	}
	else if (email.value=='')
	{
		alert("please enter email!");
		email.focus();
		return false;
	}
	else if (emergencContact.value=='')
	{
		alert("please enter emergencContact!");
		emergencContact.focus();
		return false;
	}
	
	return valid;
}


