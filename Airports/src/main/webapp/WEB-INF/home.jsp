<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<jsp:include page="bootstrap.jsp" />
</head>

<jsp:include page="navbar.jsp" />
<div class="row">
	<jsp:include page="alerts.jsp" />
</div>

<div class="row">
	<div class="col-3"></div>
	<div class="col">
		<br>
		<h1>Welcome to Airports!</h1>
	</div>
	<div class="col-3"></div>
</div>

<br>

<div class="row">
	<div class="col-1"></div>
	<div class="col">
		<h5>This website allows you to search and obtain information
			pertaining to virtually every airport across the entire United
			States.</h5>
		<h5>
			Select a search option below to get started&nbsp;&nbsp;
			<svg xmlns="http://www.w3.org/2000/svg" width="22" height="22"
				fill="currentColor" class="bi bi-arrow-down-square"
				viewBox="0 0 16 16">
  <path fill-rule="evenodd"
					d="M15 2a1 1 0 0 0-1-1H2a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V2zM0 2a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V2zm8.5 2.5a.5.5 0 0 0-1 0v5.793L5.354 8.146a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l3-3a.5.5 0 0 0-.708-.708L8.5 10.293V4.5z" />
</svg>
		</h5>
		<br>
	</div>
	<div class="col-1"></div>

</div>

<main class="container-fluid">

	<div class="container-fluid">
		<div class="row">
			<div class="col-1"></div>
			<div class="col">
				<form action="getAirportsByState.do" method="GET">
					<label for="stateDataList" id="abc">Search By State:</label><br>
					<input class="form-control form-control-lg" type="text"
						name="state" list="datalistOptions" id="stateDataList"
						placeholder="Type to search..." type="submit">
					<datalist id="datalistOptions">
						<option value="Alabama">
						<option value="Alaska">
						<option value="Arizona">
						<option value="Arkansas">
						<option value="California">
						<option value="Colorado">
						<option value="Connecticut">
						<option value="Delaware">
						<option value="Florida">
						<option value="Georgia">
						<option value="Hawaii">
						<option value="Idaho">
						<option value="Illinois">
						<option value="Indiana">
						<option value="Iowa">
						<option value="Kansas">
						<option value="Kentucky">
						<option value="Louisiana">
						<option value="Maine">
						<option value="Maryland">
						<option value="Massachusetts">
						<option value="Michigan">
						<option value="Minnesota">
						<option value="Mississippi">
						<option value="Missouri">
						<option value="Montana">
						<option value="Nebraska">
						<option value="Nevada">
						<option value="New Hampshire">
						<option value="New Jersey">
						<option value="New Mexico">
						<option value="New York">
						<option value="North Carolina">
						<option value="North Dakota">
						<option value="Ohio">
						<option value="Oklahoma">
						<option value="Oregon">
						<option value="Pennsylvania">
						<option value="Rhode Island">
						<option value="South Carolina">
						<option value="South Dakota">
						<option value="Tennessee">
						<option value="Texas">
						<option value="Utah">
						<option value="Vermont">
						<option value="Virginia">
						<option value="Washington">
						<option value="West Virginia">
						<option value="Wisconsin">
						<option value="Wyoming">
					</datalist>
				</form>
			</div>
			<div class="col-1"></div>
		</div>
	</div>
	<br>

	<div class="container-fluid">
		<div class="row">
			<div class="col-1"></div>
			<div class="col">
				<form action="getAirportsByName.do" method="GET">
					<label for="stateDataList" id="abc">Search By Name:</label><br>
					<input class="form-control form-control-lg" type="text"
						name="airportName" id="airportName"
						placeholder="Type to search..." type="submit">
				</form>
			</div>
			<div class="col-1"></div>
		</div>
	</div>
	<br>

	<div class="row">
		<div class="col-1"></div>
		<div class="col">
			<form action="newairportpage.do" method="GET">
				<div class="d-grid gap-2">
					<button class="btn btn-primary" type="submit" id="createButton">Create
						a new airport</button>
				</div>
			</form>
		</div>
		<div class="col-1"></div>
	</div>


</main>
</body>
</html>