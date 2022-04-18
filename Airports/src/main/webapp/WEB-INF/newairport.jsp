<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create new airport</title>
<jsp:include page="bootstrap.jsp" />
</head>

<jsp:include page="navbar.jsp"/>

<div class="container">
	<div class="row">
		<div class="col-1"></div>
		<div class="col-4">
			<br>
			<h1>Create a new airport</h1>
		</div>
		<div class="col"></div>
	</div>
</div>

<main class="container-fluid">

	<div class="container">
		<div class="row">
			<div class="col">
				<form action="newAirport.do" method="GET">
					<div class="mb-3">
						<label for="formControlInput1" class="form-label">Airport
							Name</label> <input type="text" name="name" class="form-control"
							id="exampleFormControlInput1"
							placeholder="ex. Denver International Airport">
					</div>

					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">City</label>
						<input type="text" name="city" class="form-control"
							id="exampleFormControlInput1" placeholder="ex. Denver">
					</div>

					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">State</label>
						<input type="text" name="state" class="form-control"
							id="exampleFormControlInput1" placeholder="ex. Colorado">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
			<div class="col"></div>
		</div>
	</div>

	${name} ${city} ${state} ${success}

</main>
</body>
</html>