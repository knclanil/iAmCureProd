function submitToParent(){

	var MedicalstoreName=document.getElementById("MedicalstoreName").value;
	var Country=document.getElementById("Country").value;
	var StateName=document.getElementById("StateName").value;
	var City=document.getElementById("City").value;
	var PinCode=document.getElementById("PinCode").value;
	var StreetName=document.getElementById("StreetName").value;
	var PhoneNumber=document.getElementById("PhoneNumber").value;
	var MedicalStorePicture=document.getElementById("MedicalStorePicture").value;
	var Descripition=document.getElementById("Descripition").value;
	var DrugLicenseNumber=document.getElementById("DrugLicenseNumber").value;
	var ContactPerson=document.getElementById("ContactPerson").value;
	var IsVerified =document.getElementById("IsVerified ").value;
	var DrugDelivery =document.getElementById("DrugDelivery ").value;
	var DrugLicenseDocument=document.getElementById("DrugLicenseDocument").value;
		
	if(validateform())
	{
		addmedicalstoreprofile(MedicalstoreName, Country, StateName, City, PinCode, StreetName, PhoneNumber, 
		MedicalStorePicture, Descripition, DrugLicenseNumber, ContactPerson, IsVerified , DrugDelivery , DrugLicenseDocument);
			
	}else 
		return false;
	
}
		function addmedicalstoreprofile(MedicalstoreName, Country, StateName, City, PinCode, StreetName, PhoneNumber, 
		MedicalStorePicture, Descripition, DrugLicenseNumber, ContactPerson, IsVerified , DrugDelivery , DrugLicenseDocument);
		{
			document.location.href = "MedicalStoreServlet?action=Submint&MedicalstoreName="+MedicalstoreName+" &Country="+Country+" &StateName="+StateName+" &City="+City+" &PinCode="+PinCode+" &StreetName="+StreetName+" &PhoneNumber="+PhoneNumber+" &MedicalStorePicture="+MedicalStorePicture+" &Descripition="+Descripition+" &DrugLicenseNumber="+DrugLicenseNumber+" &ContactPerson="+ContactPerson+" &IsVerified="+IsVerified +" &DrugDelivery ="+DrugDelivery +" &DrugLicenseDocument="+DrugLicenseDocument;
		}
function validateform()
{
	var MedicalstoreName=document.getElementById("MedicalstoreName");
	var Country=document.getElementById("Country");
	var StateName=document.getElementById("StateName");
	var City=document.getElementById("City");
	var PinCode=document.getElementById("PinCode");
	var StreetName=document.getElementById("StreetName");
	var PhoneNumber=document.getElementById("PhoneNumber");
	var MedicalStorePicture=document.getElementById("MedicalStorePicture");
	var Descripition=document.getElementById("Descripition");
	var DrugLicenseNumber=document.getElementById("DrugLicenseNumber");
	var ContactPerson=document.getElementById("ContactPerson");
	var IsVerified =document.getElementById("IsVerified ");
	var DrugDelivery =document.getElementById("DrugDelivery ");
	var DrugLicenseDocument=document.getElementById("DrugLicenseDocument");
		
		if(MedicalstoreName.value=='' )
	{
		alert("please enter MedicalstoreName!");
		MedicalstoreName.focus();
		return false;
	}
	else if (Country.value=='')
	{
		alert("please enter Country!");
		Country.focus();
		return false;
	}
	else if (StateName.value=='')
	{
		alert("please enter StateName!");
		StateName.focus();
		return false;
	}
		else if (City.value=='')
	{
		alert("please enter City!");
		City.focus();
		return false;
	}
		else if (PinCode.value=='')
	{
		alert("please enter PinCode!");
		PinCode.focus();
		return false;
	}
		else if (StreetName.value=='')
	{
		alert("please enter StreetName!");
		StreetName.focus();
		return false;
	}
		else if (PhoneNumber.value=='')
	{
		alert("please enter PhoneNumber!");
		PhoneNumber.focus();
		return false;
	}
		else if (MedicalStorePicture.value=='')
	{
		alert("please enter MedicalStorePicture!");
		MedicalStorePicture.focus();
		return false;
	}
		else if (Descripition.value=='')
	{
		alert("please enter Descripition!");
		Descripition.focus();
		return false;
	}
		else if (DrugLicenseNumber.value=='')
	{
		alert("please enter DrugLicenseNumber!");
		DrugLicenseNumber.focus();
		return false;
	}
		else if (ContactPerson.value=='')
	{
		alert("please enter ContactPerson!");
		ContactPerson.focus();
		return false;
	}
		else if (IsVerified.value=='')
	{
		alert("please enter IsVerified!");
		IsVerified.focus();
		return false;
	}
		else if (DrugDelivery.value=='')
	{
		alert("please enter DrugDelivery!");
		DrugDelivery.focus();
		return false;
	}
		else if (DrugLicenseDocument.value=='')
	{
		alert("please enter DrugLicenseDocument!");
		DrugLicenseDocument.focus();
		return false;
	}
}