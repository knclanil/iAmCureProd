function submitToMedicalStore(){

	var MedicalstoreName=document.getElementById("medicalstoreName").value;
	var Country=document.getElementById("country").value;
	var StateName=document.getElementById("state").value;
	var City=document.getElementById("city").value;
	var PinCode=document.getElementById("pinCode").value;
	var StreetName=document.getElementById("streetName").value;
	var PhoneNumber=document.getElementById("phoneNumber").value;
	var MedicalStorePicture=document.getElementById("medicalStorePicture").value;
	var Descripition=document.getElementById("descripition").value;
	var DrugLicenseNumber=document.getElementById("drugLicenseNumber").value;
	var ContactPerson=document.getElementById("contactPerson").value;
	var DrugDelivery =document.getElementById("drugDelivery ").value;
	var DrugLicenseDocument=document.getElementById("drugLicenseDocument").value;
		
	if(validateform())
	{
		addmedicalstoreprofile(medicalstoreName,country,stateName,city,pinCode,streetName,phoneNumber,medicalStorePicture,descripition,drugLicenseNumber,contactPerson,drugDelivery,drugLicenseDocument);
			
	}else 
		return false;
	
}
		function addmedicalstoreprofile(medicalstoreName, country, stateName, city, pinCode, streetName, phoneNumber, medicalStorePicture, descripition, drugLicenseNumber, contactPerson, drugDelivery, drugLicenseDocument)
		{
			window.event.returnValue = false;
			alert("Hiiiii");
			document.location.href ="MedicalStoreServlet?action=Submint&medicalstoreName="+medicalstoreName+"&country="+country+"&stateName="+stateName+"&city="+city+"&pinCode="+pinCode+"&streetName="+streetName+"&phoneNumber="+phoneNumber+"&medicalStorePicture="+medicalStorePicture+"&descripition="+descripition+"&drugLicenseNumber="+drugLicenseNumber+"&contactPerson="+contactPerson+"&drugDelivery="+drugDelivery+"&drugLicenseDocument="+drugLicenseDocument;
		}
function validateform()
{
	var valid=true;
	var MedicalstoreName=document.getElementById("medicalstoreName");
	var Country=document.getElementById("country");
	var StateName=document.getElementById("state");
	var City=document.getElementById("city");
	var PinCode=document.getElementById("pinCode");
	var StreetName=document.getElementById("streetName");
	var PhoneNumber=document.getElementById("phoneNumber");
	var MedicalStorePicture=document.getElementById("medicalStorePicture");
	var Descripition=document.getElementById("descripition");
	var DrugLicenseNumber=document.getElementById("drugLicenseNumber");
	var ContactPerson=document.getElementById("contactPerson");
	var DrugDelivery =document.getElementById("drugDelivery ");
	var DrugLicenseDocument=document.getElementById("drugLicenseDocument");
		
		if(medicalstoreName.value=='' )
	{
		alert("please enter MedicalstoreName!");
		medicalstoreName.focus();
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
		else if (city.value=='')
	{
		alert("please enter City!");
		city.focus();
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
		else if (medicalStorePicture.value=='')
	{
		alert("please enter MedicalStorePicture!");
		medicalStorePicture.focus();
		return false;
	}
		else if (descripition.value=='')
	{
		alert("please enter Descripition!");
		descripition.focus();
		return false;
	}
		else if (drugLicenseNumber.value=='')
	{
		alert("please enter DrugLicenseNumber!");
		drugLicenseNumber.focus();
		return false;
	}
		else if (ContactPerson.value=='')
	{
		alert("please enter ContactPerson!");
		ContactPerson.focus();
		return false;
	}
	else if (drugDelivery.value=='')
	{
		alert("please enter DrugDelivery!");
		drugDelivery.focus();
		return false;
	}
		else if (drugLicenseDocument.value=='')
	{
		alert("please enter DrugLicenseDocument!");
		drugLicenseDocument.focus();
		return false;
	}

		return valid;
}