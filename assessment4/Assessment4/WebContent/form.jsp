<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
    <form action="FormServlet" method="post">
    <div class="container">
  <div class="form-row">
    <div class="form-group col-md-4">
      <label >Posting Title</label><br/>
      <input  class="form-control" type="text" name="title">
    </div>
    <div class="form-group col-md-4">
      <label >city or neighborhood</label><br/>
      <input  class="form-control" type="text" name="city">
    </div>
    <div class="form-group col-md-4">
      <label >postal code</label>
      <input type="text" class="form-control" name="pc">
    </div>
  </div>
  </div>

<div class="container">
  <div class="form-row">
    <div class="col-md-12">
  <label >description:</label><br/>
  <textarea  rows="3" name="description"></textarea>
</div>
  </div>
  </div>
  <div class="form-row">
  
  <div class="col-md-4"> 
  
  <fieldset>
   <div class="form-group">
    <label for="formGroupExampleInput">Email</label>
    <input type="text"  placeholder="Example input" name="email">
  </div>
 </fieldset>
  </div>
 <div class="col-md-8">

 <div>
 
 
 
  <div >
    <div class="col">
    <label>Number</label><br/>
      <input type="text" class="form-control" placeholder="phone number" name="phonenumber">
    </div>
    <div class="col">
    <label>Extn</label><br/>
      <input type="text" class="form-control" placeholder="extension" name="extension">
    </div>
    <div class="col">
    <label>Name</label>
      <input type="text" class="form-control" placeholder="contact name"name="contactname">
    </div>
  </div>
  
   <div >
 <div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
  <label class="form-check-label" for="inlineCheckbox1">show number</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
  <label class="form-check-label" for="inlineCheckbox2">phone calls OK</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option3" >
  <label class="form-check-label" for="inlineCheckbox3">Text/sms</label>
</div>
 </div>

 </div>
 
 </div>
  </div>

  
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">ok for others to contact you about services.</label>
  </div>
  
<a href="http://localhost:8080/Assessment4/Ad.jsp"> <button type="submit" class="btn btn-dark">Proceed</a></button> 
    
    </form>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>