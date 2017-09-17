<!DOCTYPE html>
<html >
  <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/userprofile.js"></script>
  </head>
  <body>
    
    <div class="container">
    <h2>Personal Profile</h2>
      <form class="well form-horizontal" action=" " method="post"  id="Personal Profile">
        <fieldset>
          <!-- Form Name -->
          <!-- First_Name Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">First_Name</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input name="firstname" id="firstname" placeholder="" older="First_Name " class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!-- Last_Name Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">Last_Name</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                <input name="lastname" id="lastname" placeholder="Last_Name " class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!-- Releationship Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">Releationship</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input name="releationship" id="releationship" placeholder="Releationship " class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!--Date_Of_Birth  Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">Date Of Birth</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input placeholder="Date_Of_Birth" name="dob" id="dob" class="form-control"  type="Date">
              </div>
            </div>
          </div>
          
          <!-- AdharCard_Number Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">AdharCard_Number</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                <input id="adharCardnumber" name="adharCardnumber" placeholder="AdharCard_Number " class="form-control"  type="text">
              </div>
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-4 control-label">Country</label>
            <div class="col-md-4 selectContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
                <select name="country" id="country" class="form-control selectpicker" >
                  <option value=" " >Please select your country</option>
                  <option>India</option>
                  <option>United States</option>
                  <option>Australia</option>
                </select>
              </div>
            </div>
          </div>
          <!-- STATE Select Basic -->
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
                  <option>Telangana</option>
                  <option>Tripura</option>
                  <option>Uttar Pradesh</option>
                  <option>Uttarakhand</option>
                  <option>West Bengal</option>
                </select>
              </div>
            </div>
          </div>
          <!-- PINCODEText input-->
          <div class="form-group">
            <label class="col-md-4 control-label">Pincode</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                <input name="pincode" id="pincode" placeholder="Pincode" class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!-- City Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">City</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                <input name="city" id="city" placeholder="City" class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!-- House Text input-->
          <div class="form-group">
            <label class="col-md-4 control-label">HouseNumber</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                <input name="houseNumber" id="houseNumber" placeholder="HouseNumber" class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!-- Stree name input-->
          <div class="form-group">
            <label class="col-md-4 control-label">Stret Name</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                <input name="streetname" id="streetname" placeholder="StreetName" class="form-control"  type="text">
              </div>
            </div>
          </div>
          <!--Phone Number Text input-->
          
          <div class="form-group">
            <label class="col-md-4 control-label">PhoneNumber</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                <input name="phoneNumber" id="phoneNumber" placeholder="+91 1234567890" class="form-control" type="text">
              </div>
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-4 control-label">E-Mail ID</label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                <input name="email" id="email" placeholder="+91 1234567890" class="form-control" type="text">
              </div>
            </div>
          </div>
          <!-- Emergenc_Contact Text input-->
          
          <div class="form-group">
            <label class="col-md-4 control-label">Emergenc_Contact </label>
            <div class="col-md-4 inputGroupContainer">
              <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input name="emergencContact" id="emergencContact" placeholder=" Family or Friend" class="form-control" type="text">
              </div>
            </div>
          </div>
          <!-- Success message -->
          <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Profile Updated</div>
          <!-- Button -->
          <div class="form-group">
            <label class="col-md-4 control-label"></label>
            <div class="col-md-4">
              <button type="submit" class="btn btn-warning" onclick="submitToPatient()">Submit</button>
            </div>
          </div>
        </fieldset>
      </form>
    </div><!-- /.container -->
  </body>
</html>