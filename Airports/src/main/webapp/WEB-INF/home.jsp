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

<nav id="navBar" class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="/"> <img
			src="https://www.riversideca.gov/sites/default/files/img/Airport/Airport-01.png"
			alt="" width="30" height="24" class="d-inline-block align-text-top">
			Home
		</a>
		<form action="search.do" method="GET" class="d-flex">
			<input class="form-control me-2" type="search" name="query"
				placeholder="Search Database" aria-label="Search">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>
	</div>
</nav>

<h1>Welcome to Airports!</h1>
<br>
<p>This website allows you to search and obtain information pertaining to virtually every airport across the entire Unites States. Select a search option below to get started.</p>

<main class="container-fluid">

	<form action="getAirportsByState.do" method="GET">
		State: <input type="text" name="state" /> <input type="submit"
			value="Search" />
	</form>

	<label for="exampleDataList" class="form-label">Datalist
		example</label> <input class="form-control" list="datalistOptions"
		id="exampleDataList" placeholder="Type to search...">
	<datalist id="datalistOptions">
		<option value="San Francisco">
		<option value="New York">
		<option value="Seattle">
		<option value="Los Angeles">
		<option value="Chicago">
	</datalist>
	
		<form action="newAirport.do" method="GET">
		
	<input class="btn btn-primary" type="submit" value="Submit">
	</form>

</main>
</body>
</html>