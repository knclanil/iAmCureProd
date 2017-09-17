<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Bootstrap 3 Contact form with Validation</title>
  <script src="https://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>


<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css" />

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>


  
</head>
  <body>
    <div class="container">
      <form class="well form-horizontal" action=" " method="post"  id="Personal Profile">
        <!-- Form Name -->
        <h1 class="display-4">Diagnostic Center Profile</h1>
        <!-- Diagnostic Center  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Diagnostic Center Name</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
              <input name="diagnosticCenterName" id="diagnosticCenterName" placeholder="Diagnostic Center " class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- Country  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Country</label>
          <div class="col-md-4 selectContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
              <select name="country" id="country"  class="form-control selectpicker" >
                <option value=" " >Please select your country</option>
                <option>India</option>
                <option>United States</option>
              </select>
            </div>
          </div>
        </div>
        <!-- StateName  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">State</label>
          <div class="col-md-4 selectContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
              <select name="state" id="state" class="form-control selectpicker" >
                <option value=" " >Please select your state</option>
                <option>Andaman and Nicobar Islands</option>
                <option>Andhra Pradesh</option>
                <option>Arunachal Pradesh</option>
                <option>Assam</option>
                <option>Bihar</option>
                <option>Chandigarh</option>
                <option>Chhattisgarh</option>
                <option>Dadra and Nagar Haveli</option>
                <option>Daman and Diu</option>
                <option>Delhi</option>
                <option>Goa</option>
                <option>Gujarat</option>
                <option>Haryana</option>
                <option>Himachal Pradesh</option>
                <option>Jammu and Kashmir</option>
                <option>Jharkhand</option>
                <option>Karnataka</option>
                <option>Kerala</option>
                <option>Lakshadweep</option>
                <option>Madhya Pradesh</option>
                <option>Maharashtra</option>
                <option>Manipur</option>
                <option>Meghalaya</option>
                <option>Mizoram</option>
                <option>Nagaland</option>
                <option>Odisha</option>
                <option>Puducherry</option>
                <option>Punjab</option>
                <option>Rajasthan</option>
                <option>Sikkim</option>
                <option>Tamil Nadu</option>
                <option>Telangana</option>>
                <option>Tripura</option>
                <option>Uttar Pradesh</option>
                <option>Uttarakhand</option>
                <option>West Bengal</option>
              </select>
            </div>
          </div>
        </div>
        <!-- City  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">City</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="city" id="city" placeholder="City" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- PinCode  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Pincode</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="pincode" id="password" placeholder="Pincode" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- Stree name input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Street Number & Name</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
              <input name="streetName" id="streetName" placeholder="StreetName&Number" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- PhoneNumber  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">PhoneNumber</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="phoneNumber" id="phoneNumber" placeholder="+91 1234567890" class="form-control" type="text">
            </div>
          </div>
        </div>
        <!-- MedicalStorePicture  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Diagnostic Center Picture</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <input type="file" id="file" class="form-control-file" id="Diagnostic Center Picture">
            </div>
          </div>
        </div>
        <!-- Descripition  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">About Diagnostic Center</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="descripition" id="descripition"  placeholder="Descripition" class="form-control" type="text">
            </div>
          </div>
        </div>
        <!-- ContactPerson  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Diagnostic Center Manager</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="contactPerson" id="contactPerson" placeholder="Name" class="form-control" type="text">
            </div>
          </div>
        </div>
        <!-- IsVerified  input-->
        <!-- Samples Pickup input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Samples Pickup Available </label>
          <label class="custom-control custom-radio">
            <input id="radio1" name="radio" type="radio" class="custom-control-input">
            <span class="custom-control-indicator"></span>
            <span class="custom-control-description">Yes</span>
          </label>
          <label class="custom-control custom-radio">
            <input id="radio2" name="radio" type="radio" class="custom-control-input">
            <span class="custom-control-indicator"></span>
            <span class="custom-control-description">No</span>
          </label>
        </div>
        <!-- Diagnostic Center LicenseNumber  input-->
        <div class="form-group">
          <label class="col-md-4 control-label">Diagnostic Center LicenseNumber</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="diagnosticsCenterLicenseNumber" id="diagnosticsCenterLicenseNumber" placeholder="Diagnostic Center LicenseNumber" class="form-control" type="text">
            </div>
          </div>
        </div>
        <!-- Diagnostic Center License Document-->
        <div class="form-group">
          <label class="col-md-4 control-label"> Diagnostic Center License Document </label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <input type="file1" id="file1" class="form-control-file" id="Diagnostic Center License Document">
            </div>
            <!-- Success message -->
            <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Profile Updated </div>
            <!-- Button -->
            <div class="form-group">
              <label class="col-md-4 control-label"></label>
              <div class="col-md-4">
              <button type="submit" class="btn btn-warning" onclick="submitToParent()">Submit</span></button>
            </div>
          </div>
          <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
          <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>
          <script src="js/index.js"></script>
        </html>