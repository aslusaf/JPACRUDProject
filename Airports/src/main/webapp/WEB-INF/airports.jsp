<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Airports</title>
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

<main class="container-fluid">

	<table id="airportTable"
		class="table table-striped table-hover table-bordered">
		<thead>

			<tr class="table-primary">
				<th colspan="6">Results for: ${searchedState}</th>
			</tr>
		</thead>
		<tbody>

			<tr class="table-primary">
				<th>State</th>
				<th>Name</th>
				<th>ICAO Code</th>
				<th>Type</th>
				<th>City</th>
				<th>Country</th>
			</tr>

			<c:forEach var="a" items="${airportsByState}">
				<tr>
					<td>${a.stateName} (${a.stateAbbreviation})</td>
					<c:choose>
						<c:when test="${empty a.airportLink || a.airportLink == 'NULL'}">
							<td>${a.airportName}</td>
						</c:when>
						<c:otherwise>
							<td><a href="${a.airportLink}" target="_blank">${a.airportName}</a></td>
						</c:otherwise>
					</c:choose>
					<td>${a.icaoCode}</td>
					<td>${a.airportType}</td>
					<td>${a.cityName}</td>
					<td>${a.countryAbbreviation}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</main>
</body>
</html>