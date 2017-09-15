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
	
	<div class="container">
		<form class="well form-horizontal" action=" " method="post"  id="Personal Profile">
		<h1 class="display-4"> Patient Medical History</h1>
			<div class="form-group">
				<label class="col-md-4 control-label">Weight</label>
				<div class="col-md-4 selectContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-number"></i></span>
						<input placeholder = "In Kg's" class="form-control" type ="text">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Hight</label>
				<div class="col-md-4 selectContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-number"></i></span>
						<input placeholder = "In Ft.inch ex:5.10" class="form-control" type ="text">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Blood Group</label>
				<div class="col-md-4 selectContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
						<select name="illness" class="form-control selectpicker" >
							<option value="select">select</option>
							<option value="A+">A+</option>
							<option value="A-">A-</option>
							<option value="B+">B+</option>
							<option value="B-">B-</option>
							<option value="AB+">AB+</option>
							<option value="AB-">AB-</option>
							<option value="O+">O+</option>
							<option value="O-">O-</option>
						</select>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">InsuranceCompany</label>
				<div class="col-md-4 inputGroupContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<input name="InsuranceCompany" placeholder="InsuranceCompany " class="form-control"  type="text">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Insurance Policy Number</label>
				<div class="col-md-4 inputGroupContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<input name="InsuranceCompany" placeholder="Policy Number " class="form-control"  type="text">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Expaire date of Policy</label>
				<div class="col-md-4 inputGroupContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<input name="InsuranceCompany" placeholder="Expaire Date" class="form-control"  type="Date">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Are you currently taking any medication? </label>
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
			<div class="form-group">
				<label class="col-md-4 control-label">Do you have any medication allergies? </label>
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
				<label class="custom-control custom-radio">
					<input id="radio2" name="radio" type="radio" class="custom-control-input">
					<span class="custom-control-indicator"></span>
					<span class="custom-control-description">Not Sure</span>
				</label>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">have treated for any of these problem before ?</label>
				<div class="col-md-4 selectContainer">
					<div class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
						<select name="illness" class="form-control selectpicker" >
							<option>select</option>
							<option>Bleeding Tendency</option>
							<option>Blood Clots</option>
							<option>Cancer</option>
							<option>Cardiac</option>
							<option>Diabetes</option>
							<option>Environmental Allergies</option>
							<option>High Cholesterol</option>
							<option>Kidney</option>
							<option>Lung</option>
							<option>Neuro</option>
							<option>Psychiatry</option>
							<option>Thyroid Disorder</option>
						</select>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">Are you Oragan Donor? </label>
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
			<div class="form-group">
				<label class="col-md-4 control-label">Are you Blood Donor? </label>
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
			<!-- Success message -->
			<div class="alert alert-success" role="alert" id="success_message">Profile Updated <i class="glyphicon glyphicon-thumbs-up"></i> </div>
			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label"></label>
				<div class="col-md-4">
					<button type="submit" class="btn btn-warning" onclick="submitToParent()" >Submit</button>
				</div>
			</div>			</div>
		</div>
		<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
		<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>
		<script src="js/index.js"></script>
		
	</html>