<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<jsp:include page="../pages/partials/header.jsp"></jsp:include>
</header>
<nav>
	<jsp:include page="../pages/partials/nav.jsp"></jsp:include>
</nav>
	<h2>Merci d'avoir nous contacter</h2>
	<form action="http://localhost:8080/fsgSortants/ContactAction" method="post">
		<div class="form-group row">
			<label for="name" class="col-sm-2 col-form-label">Nom</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="nom" placeholder="Nom complet">
			</div>
		</div>

		<div class="form-group row">
			<label for="tel" class="col-sm-2 col-form-label">Tel</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="tel" id="tel" placeholder="ex : 53 50 70 76">
			</div>
		</div>

		<div class="form-group row">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="inputEmail3" name="mail" placeholder="Email">
			</div>
		</div>

		<div class="form-group row">
			<label for="message" class="col-sm-2 col-form-label">message</label>
			<div class="col-sm-10">
				<input type="textarea" class="form-control" id="message" name="message" placeholder="">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>