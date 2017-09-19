function submitToParent(){
	
		var fullName=document.getElementById("fullName").value;
		//var isDoctor=document.getElementById("isDoctor").value;
		var qualification=document.getElementById("qualification").value;
		var College=document.getElementById("college").value;
		var CompletionYear=document.getElementById("completionYear").value;
		var Specilizations=document.getElementById("specilizations").value;
		//var specialized=document.getElementById("specialized").value;
		var CouncilRegistrationNumber=document.getElementById("councilRegistrationNumber").value;
		var CouncilName=document.getElementById("councilName").value;
		var CouncilYear=document.getElementById("councilYear").value;
		var CertificatePath=document.getElementById("file").value;
		var IDProofPath=document.getElementById("file2").value;
		var Description=document.getElementById("description").value;
		var Experince=document.getElementById("experince").value;
		var City=document.getElementById("city").value;
		var DoctorImagePath=document.getElementById("file3").value;
		var EmailID=document.getElementById("emailID").value;
		var PersonalContact=document.getElementById("personalContact").value;
		var BusinessContact=document.getElementById("businessContact").value;
		
	
	if(validateform())
	{
           addDoctorProfile(fullName, qualification, college, completionYear, specilizations,councilRegistrationNumber, councilName, councilYear, file, file2, description, experince, city, file3, emailID, personalContact, businessContact);
	}else 
		return false;
	
}

function addDoctorProfile(fullName, qualification, college, completionYear, specilizations,councilRegistrationNumber, councilName, councilYear, file, file2, description, experince, city, file3, emailID, personalContact, businessContact)
{
	window.event.returnValue = false;
	alert("Hiiiii");
	document.location.href = "DoctorServlet?action=Submint&fullName="+fullName+"&qualification="+qualification+"&college="+college+"&completionYear="+completionYear+"&specilizations="+specilizations+"&councilRegistrationNumber="+councilRegistrationNumber+"&councilName="+councilName+"&councilYear="+councilYear+"&file="+file+"&file2="+file2+"&description="+description+"&experince="+experince+"&city="+city+"&file3="+file3+"&emailID="+emailID+"&personalContact="+personalContact+"&businessContact="+businessContact;
}


function validateform()
{
	var valid=true;
	var fullName=document.getElementById("fullName");
	//var isDoctor=document.getElementById("isDoctor");
	var qualification=document.getElementById("qualification");
	var College=document.getElementById("college");
	var CompletionYear=document.getElementById("completionYear");
	var Specilizations=document.getElementById("specilizations");
	//var specialized=document.getElementById("specialized");
	var CouncilRegistrationNumber=document.getElementById("councilRegistrationNumber");
	var CouncilName=document.getElementById("councilName");
	var CouncilYear=document.getElementById("councilYear");
	var CertificatePath=document.getElementById("file");
	var IDProofPath=document.getElementById("file2");
	var Description=document.getElementById("description");
	var Experince=document.getElementById("experince");
	var City=document.getElementById("city");
	var DoctorImagePath=document.getElementById("file3");
	alert(DoctorImagePath.value);
	var EmailID=document.getElementById("emailID");
	var PersonalContact=document.getElementById("personalContact");
	var BusinessContact=document.getElementById("businessContact");
	
	
	if(fullName.value=='' )
	{
		alert("please enter fullName!");
		fullName.focus();
		return false;
	}
	else if (qualification.value=='')
	{
		alert("please enter qualification!");
		qualification.focus();
		return false;
	}

	else if (College.value=='')
	{
		alert("please enter College!");
		College.focus();
		return false;
	}
	else if (CompletionYear.value=='')
	{
		alert("please enter CompletionYear!");
		CompletionYear.focus();
		return false;
	}
	else if (Specilizations.value=='')
	{
		alert("please enter Specilizations!");
		Specilizations.focus();
		return false;
	}
	else if (CouncilRegistrationNumber.value=='')
	{
		alert("please enter CouncilRegistrationNumber!");
		CouncilRegistrationNumber.focus();
		return false;
	}
	else if (CouncilName.value=='')
	{
		alert("please enter CouncilName!");
		CouncilName.focus();
		return false;
	}
	else if (CouncilYear.value=='')
	{
		alert("please enter CouncilYear!");
		CouncilYear.focus();
		return false;
	}
	else if (CertificatePath.value=='')
	{
		alert("please enter CertificatePath!");
		CertificatePath.focus();
		return false;
	}
	else if (IDProofPath.value=='')
	{
		alert("please enter IDProofPath!");
		IDProofPath.focus();
		return false;
	}
	else if (Description.value=='')
	{
		alert("please enter Description!");
		Description.focus();
		return false;
	}
	else if (Experince.value=='')
	{
		alert("please enter Experince!");
		Experince.focus();
		return false;
	}
	else if (City.value=='')
	{
		alert("please enter City!");
		City.focus();
		return false;
	}
	else if (DoctorImagePath.value=='')
	{
		alert("please enter DoctorImagePath!");
		DoctorImagePath.focus();
		return false;
	}
	else if (EmailID.value=='')
	{
		alert("please enter EmailID!");
		EmailID.focus();
		return false;
	}
	else if (PersonalContact.value=='')
	{
		alert("please enter PersonalContact!");
		PersonalContact.focus();
		return false;
	}
	else if (BusinessContact.value=='')
	{
		alert("please enter BusinessContact!");
		BusinessContact.focus();
		return false;
	}

	return valid;
}


