
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
        <h1 class="display-4"> Doctor Profile</h1>
        <!-- FULLName Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label">FULL NAME</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="FULL NAME" placeholder="FULL NAME" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- QUALIFICATION input-->
        <div class="form-group">
          <label class="col-md-4 control-label">QUALIFICATION</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="QUALIFICATION" placeholder="QUALIFICATION" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- COLLEGE input-->
        <div class="form-group">
          <label class="col-md-4 control-label">UNIVERSITY NAME</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="COLLEGE" placeholder="COLLEGE" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- COMPLETIONYEAR input-->
        <div class="form-group">
          <label class="col-md-4 control-label">COMPLETION YEAR</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="COMPLETIONYEAR" placeholder="COMPLETIONYEAR" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- SPECILIZATIONS input-->
        <div class="form-group">
          <label class="col-md-4 control-label">SPECILIZATIONS</label>
          <div class="col-md-4 selectContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
              <select name="SPECILIZATIONS" class="form-control selectpicker" >
                <option value=" " >Please select your SPECILIZATIONS</option>
                <option>Anaesthesiology</option>
                <option>Cardiology</option>
                <option>Cardiothoracic Surgery</option>
                <option>Dermatology</option>
                <option>Diagnostic Radiology</option>
                <option>Emergency Medicine</option>
                <option>Endocrinology</option>
                <option>Gastroenterology</option>
                <option>General Surgery</option>
                <option>Geriatric Medicine</option>
                <option>Haematology</option>
                <option>Hand Surgery</option>
                <option>Infectious Diseases</option>
                <option>Internal Medicine</option>
                <option>Medical Oncology</option>
                <option>Neurology</option>
                <option>Neurosurgery</option>
                <option>Nuclear Medicine</option>
                <option>Obstetrics & Gynaecology</option>
                <option>Occupational Medicine</option>
                <option>Ophthalmology</option>
                <option>Orthopaedic Surgery</option>
                <option>Otorhinolaryngology/ENT</option>
                <option>Paediatric Medicine</option>
                <option>Paediatric Surgery</option>
                <option>Pathology</option>
                <option>Plastic Surgery</option>
                <option>Psychiatry</option>
                <option>Public Health</option>
                <option>Radiation Oncology</option>
                <option>Rehabilitation Medicine</option>
                <option>Renal Medicine</option>
                <option>Respiratory Medicine</option>
                <option>Rheumatology</option>
                <option>Urology</option>
                
              </select>
            </div>
          </div>
        </div>
        <!-- COUNCILREGISTRATIONNUMBER input-->
        <div class="form-group">
          <label class="col-md-4 control-label">COUNCIL REGISTRATIO NUMBER</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="COUNCIL REGISTRATIO NNUMBER" placeholder="COUNCIL REGISTRATIO NNUMBER" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- COUNCIL NAME input-->
        <div class="form-group">
          <label class="col-md-4 control-label">COUNCIL NAME</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="COUNCIL NAME" placeholder="COUNCIL NAME" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- COUNCIL YEAR input-->
        <div class="form-group">
          <label class="col-md-4 control-label">COUNCIL YEAR</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="COUNCIL YEAR" placeholder="COUNCIL YEAR" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- MEDICAL REGISTRATION CERTIFICATE input-->
        <div class="form-group">
          <label class="col-md-4 control-label">MEDICAL REGISTRATION CERTIFICATE</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <input type="file" class="form-control-file" id="MEDICAL REGISTRATION CERTIFICATE">
            </div>
          </div>
        </div>
        <!-- IDPROOF input-->
        <div class="form-group">
          <label class="col-md-4 control-label">DOCTOR ID PROOF</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <input type="file" class="form-control-file" id="DOCTOR IDPROOF">
            </div>
          </div>
        </div>
        <!-- DESCRIPTION input-->
        <div class="form-group">
          <label class="col-md-4 control-label">DESCRIPTION</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="DESCRIPTION" placeholder="DESCRIPTION" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- EXPERINCE input-->
        <div class="form-group">
          <label class="col-md-4 control-label">EXPERINCE</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="EXPERINCE" placeholder="EXPERINCE" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- CITY input-->
        <div class="form-group">
          <label class="col-md-4 control-label">CITY</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="CITY" placeholder="CITY" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- DOCTORIMAGE input-->
        <div class="form-group">
          <label class="col-md-4 control-label">DOCTOR PROFILE PICTURE</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <input type="file" class="form-control-file" id="DOCTOR PROFILE PICTURE">
            </div>
          </div>
        </div>
        <!-- EMAIL ID input-->
        <div class="form-group">
          <label class="col-md-4 control-label">EMAIL ID</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="EMAIL ID" placeholder="EMAIL ID" class="form-control"  type="text">
            </div>
          </div>
        </div>
        <!-- PERSONALCONTACT input-->
        <div class="form-group">
          <label class="col-md-4 control-label">PERSONAL CONTACT</label>
          <div class="col-md-4 inputGroupContainer">
            <div class="input-group">
              <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
              <input name="PERSONAL CONTACT" placeholder="PERSONAL CONTACT" class="form-control"  type="text">
            </div>
          </div>
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