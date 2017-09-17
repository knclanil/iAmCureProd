function submitToParent(){
	
	var DiagnosticCenterName=document.getElementById("diagnosticCenterName").value;
	var Country=document.getElementById("country").value;
	var StateName=document.getElementById("state").value;
	var City=document.getElementById("City").value;
	var PinCode=document.getElementById("pinCode").value;
	var StreetName=document.getElementById("streetName").value;
	var PhoneNumber=document.getElementById("phoneNumber").value;
	var DiagnosticCenterPhoto=document.getElementById("file").value;
	var Descripition=document.getElementById("descripition").value;
	var SamplesPickup=document.getElementById("samplesPickup").value;
	var ContactPerson=document.getElementById("contactPerson").value;
	var DiagnosticsCenterLicenseNumber =document.getElementById("diagnosticsCenterLicenseNumber").value;
	var DiagnosticsCenterLicenseDocument=document.getElementById("file1").value;
	
	
	if(validateform()
	{
		 addDoctorProfile(diagnosticCenterName, country, state, City, pinCode, streetName, phoneNumber, file, descripition, samplesPickup, contactPerson, diagnosticsCenterLicenseNumber, file1);
	}else 
		return false;
	
		
}
function addDoctorProfile(diagnosticCenterName, country, state, City, pinCode, streetName, phoneNumber, file, descripition, samplesPickup, contactPerson, diagnosticsCenterLicenseNumber, file1);
{
	document.location.href="DoctorServlet?action=Submint&diagnosticCenterName="+diagnosticCenterName+"&country="+country+"&state="+state+"&City="+City+"&pinCode="+pinCode+"&streetName="+streetName+"&phoneNumber="+phoneNumber+"&file="+file+"&descripition="+descripition+"&samplesPickup="+samplesPickup+"&contactPerson="+contactPerson+"&diagnosticsCenterLicenseNumber="+diagnosticsCenterLicenseNumber+"&file1="+file1;
}
function validateform()
{
	var DiagnosticCenterName=document.getElementById("diagnosticCenterName");
	var Country=document.getElementById("country");
	var StateName=document.getElementById("state");
	var City=document.getElementById("City");
	var PinCode=document.getElementById("pinCode");
	var StreetName=document.getElementById("streetName");
	var PhoneNumber=document.getElementById("phoneNumber");
	var DiagnosticCenterPhoto=document.getElementById("file");
	var Descripition=document.getElementById("descripition");
	var SamplesPickup=document.getElementById("samplesPickup");
	var ContactPerson=document.getElementById("contactPerson");
	var DiagnosticsCenterLicenseNumber =document.getElementById("diagnosticsCenterLicenseNumber");
	var DiagnosticsCenterLicenseDocument=document.getElementById("file1");
	
	
	if(diagnosticCenterName.value=='' )
	{
		alert("please enter DiagnosticCenterName!");
		diagnosticCenterName.focus();
		return false;
	}
else if (dagnosticCenterName.value=='')
	{
		alert("please enter DiagnosticCenterName!");
		diagnosticCenterName.focus();
		return false;
	}
		else if (country.value=='')
	{
		alert("please enter Country!");
		country.focus();
		return false;
	}
	else if (state.value=='')
	{
		alert("please enter StateName!");
		state.focus();
		return false;
	}
		else if (pinCode.value=='')
	{
		alert("please enter PinCode!");
		pinCode.focus();
		return false;
	}
		else if (streetName.value=='')
	{
		alert("please enter StreetName!");
		streetName.focus();
		return false;
	}
		else if (phoneNumber.value=='')
	{
		alert("please enter PhoneNumber!");
		phoneNumber.focus();
		return false;
	}
		else if (file.value=='')
	{
		alert("please enter DiagnosticCenterPhoto!");
		file.focus();
		return false;
	}
		else if (descripition.value=='')
	{
		alert("please enter Descripition!");
		descripition.focus();
		return false;
	}
		else if (contactPerson.value=='')
	{
		alert("please enter ContactPerson!");
		contactPerson.focus();
		return false;
	}
		else if (samplesPickup.value=='')
	{
		alert("please enter SamplesPickup!");
		samplesPickup.focus();
		return false;
	}
		else if (diagnosticsCenterLicenseNumber.value=='')
	{
		alert("please enter DiagnosticsCenterLicenseNumber!");
		diagnosticsCenterLicenseNumber.focus();
		return false;
	}
		else if (file1.value=='')
	{
		alert("please enter DiagnosticsCenterLicenseDocument!");
		file2.focus();
		return false;
	}

	return valid;
}

