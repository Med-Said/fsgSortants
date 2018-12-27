<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sortants du FSG</title>


<!-- bootstrap file -->
	<!-- css -->
<link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
 <!-- js -->
<script src="../bootstrap/js/bootstrap.js"></script>
<script src="'../bootstrap/js/bootstrap.min.js"></script>


<!--  java script files -->
<script type="text/javascript" src=""></script>

<!-- style css -->


</head>
<body>
<header>
	<jsp:include page="../pages/partials/header.jsp"/>
</header> 
<nav>
	<jsp:include page="../pages/partials/nav.jsp"/>
</nav>
	<!-- form information du sortant-->
	<h2>Information du sortant</h2>
	<form>
		<div class="form-group row">
			<label for="name" class="col-sm-2 col-form-label">Nom</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" placeholder="Nom complet">
			</div>
		</div>
		
		<div class="form-group row">
			<label for="specialite" class="col-sm-2 col-form-label">Specialite</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="specialite" placeholder="specialite">
			</div>
		</div>
		

		<div class="form-group row">
			<label for="pays" class="col-sm-2 col-form-label">Pays</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="pays" placeholder="Tunisie">
			</div>
		</div>



		<div class="form-group row">
			<label for="birth" class="col-sm-2 col-form-label">Dade de naissance</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="birth" placeholder="21/08/1995">
			</div>
		</div>



		<div class="form-group row">
			<label for="promotion" class="col-sm-2 col-form-label">Promotion</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="promotion" placeholder="ex : 2020">
			</div>
		</div>


		<div class="form-group row">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="inputEmail3" placeholder="Email">
			</div>
		</div>

		<div class="form-group row">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3" placeholder="Password">
			</div>
		</div>

		<div class="form-group row">
			<label for="creation_date" class="col-sm-2 col-form-label"></label>
			<div class="col-sm-10">
				<input type="hidden" class="form-control" id="creation_date" placeholder="Password">
			</div>
		</div>
	</form>



<!-- form profile information -->
	<h2>Votre profil</h2>
	<form>
		<div class="form-group row">
			<label for="tel" class="col-sm-2 col-form-label">Tel</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="tel" placeholder="ex : 53 50 70 76">
			</div>
		</div>
		
		<div class="form-group row">
			<label for="level" class="col-sm-2 col-form-label">Niveau</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="level" placeholder="ex: master">
			</div>
		</div>
		

		<div class="form-group row">
			<label for="picture" class="col-sm-2 col-form-label">Photo</label>
			<div class="col-sm-10">
				<input type="file" class="form-control" id="picture" placeholder="">
			</div>
		</div>

		<div class="form-group row">
			<label for="cv" class="col-sm-2 col-form-label">CV</label>
			<div class="col-sm-10">
				<input type="file" class="form-control" id="cv" placeholder="">
			</div>
		</div>

		<div class="form-group row">
			<label for="word" class="col-sm-2 col-form-label">mots</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="word" placeholder="">
			</div>
		</div>
	</form>
</body>
</html>