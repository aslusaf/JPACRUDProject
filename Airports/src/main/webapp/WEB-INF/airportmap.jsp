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

<main class="container-fluid">

	<table>
		<thead>
			<tr>
				<th>State</th>
				<th>ICAO Code</th>
				<th>Airport Type</th>
				<th>City</th>
				<th>Country</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="a" items="${airportsByState}">
				<tr>
					<td>${a}this works</td>
					<td>${a.stateAbbreviation}a</td>
					<td>${a.icaoCode}b</td>
					<td>${a.airportType}c</td>
					<td>${a.countryAbbreviation}d</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</main>
</body>
</html>