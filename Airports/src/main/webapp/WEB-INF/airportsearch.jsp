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

<jsp:include page="navbar.jsp" />

<main class="container-fluid">

	<table id="airportTable"
		class="table table-striped table-hover table-bordered">
		<thead>

			<tr class="table-primary">
				<th colspan="7">Results for: ${query}</th>
			</tr>
		</thead>
		<tbody>

			<tr class="table-primary" id="headers">
				<th>Edit Record</th>
				<th>Name</th>
				<th>ICAO Code</th>
				<th>Type</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
			</tr>

			<c:forEach var="a" items="${airports}">

				<tr>
					<td width=150px>
						<div class="d-flex flex-row mx-auto" id="editButtons">
							<form action="deleteAirport.do" method="GET">
								<button type="submit" class="btn btn-sm btn-danger"
									value="${a.id}" name="airportId">Delete</button>
							</form>
							&nbsp;&nbsp;&nbsp;
							<form action="goToUpdateAirport.do" method="GET">
								<button type="submit" class="btn btn-sm btn-primary"
									value="${a.id}" name="airportId">Update</button>
							</form>
						</div>

					</td>
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
					<td>${a.stateName}(${a.stateAbbreviation})</td>
					<td>${a.countryAbbreviation}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</main>
</body>
</html>