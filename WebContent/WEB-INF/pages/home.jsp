<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<table class="table">
	  <thead class="thead-light">
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Nom</th>
	      <th scope="col">Specialite</th>
	      <th scope="col">Promotion</th>
	      <th scope="col">Naissance</th>
	      <th scope="col">Profil</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach items="${requestScope['sortants'] }" var="sortant">
	  	<tr>
	      <th scope="row"> <c:out value="${sortant.id}"/></th>
	      <td>${sortant.nom}</td>
	      <td>${sortant.specialite }</td>
	      <td>${sortant.promotion }</td>
	      <td>${sortant.dateNaissance }</td>
	      <td><a href="#"><img alt="profil" src="imgs/profil.png"></a></td>
	    </tr>
	  </c:forEach>
	  </tbody>
	</table>