<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<jsp:include page="bootstrap.jsp" />
</head>

<jsp:include page="navbar.jsp" />

<div class="container">
	<jsp:include page="alerts.jsp" />
	<div class="row">
		<div class="col-3"></div>
		<div class="col">
			<br>
			<h1>Update an existing airport</h1>
			<br>
		</div>
		<div class="col-3"></div>
	</div>
</div>

<main class="container-fluid">

	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col">
				<form action="updateAirport.do" method="GET">

					<input type="hidden" name="airportId" value="${airport.id}">

					<div class="mb-3">
						<label for="formControlInput1" class="form-label">Airport
							Name</label> <input type="text" name="name" class="form-control"
							id="exampleFormControlInput1" value="${airport.airportName}">
					</div>

					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">City</label>
						<input type="text" name="city" class="form-control"
							id="exampleFormControlInput1" value="${airport.cityName}">
					</div>

					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">State</label>
						<input type="text" name="state" class="form-control"
							id="exampleFormControlInput1" value="${airport.stateName}">
					</div>
					<button type="submit" class="btn btn-primary">Update</button>
				</form>
			</div>
			<div class="col-2"></div>
		</div>
	</div>


</main>
</body>
</html>