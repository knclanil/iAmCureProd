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
    <h2>Payment Information</h2>
    
    <div class="form-group">
      <label class="form-control-label" for="formGroupExampleInput">Name On Card</label>
      <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Name On Card">
    </div>
    <div class="form-group">
      <label class="form-control-label" for="formGroupNumber">Card Number</label>
      <input type="text" class="form-control" placeholder="16 Digit Number" maxlength="16">
    </div>
    
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="inputZip" class="col-form-label">Expire Month and Year</label>
        <input type="Month" class="form-control" id="inputMonth">
      </div>
      <div class="form-group col-md-6">
        <label class="form-control-label" for="formGroupNumber">CVC</label>
        <input type="text" class="form-control" id="formGroupNumber" maxlength="3" placeholder="3 Digit Number">
      </div>
      <div class="col-auto">
        <div class="form-check mb-2 mb-sm-0">
          <label class="form-check-label">
            <input class="form-check-input" type="checkbox"> Remember me
          </label>
        </div>
      </div>
      <div class="form-group row">
        <div class="col-sm-10">
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
      </div>
      <!-- Success messa ge -->
      <div class="alert alert-success" role="alert" id="success_message">Process initiated <i class="glyphicon glyphicon-thumbs-up"></i> We will get back to you shortly.</div>
      <!-- Button -->
    </div>
    </div><!-- /.container -->
    
    <script type="text/javascript">
    $(function () {
    $('#datetimepicker1').datetimepicker();
    });
    </script>
  </body>
</html>