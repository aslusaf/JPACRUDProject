<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<c:choose>
	<c:when test="${updateSuccess == 1}">

		<div class="alert alert-success" role="alert" id="alerts">Success!
			The airport was updated!</div>

	</c:when>

	<c:when test="${updateSuccess == -1}">

		<div class="alert alert-danger" role="alert" id="alerts">Failure!
			Something went wrong and the airport was unable to be updated.</div>

	</c:when>

	<c:when test="${deleteSuccess == 1}">

		<div class="alert alert-success" role="alert" id="alerts">Success!
			The airport was deleted!</div>

	</c:when>

	<c:when test="${deleteSuccess == -1}">

		<div class="alert alert-danger" role="alert" id="alerts">Failure!
			Something went wrong and the airport was unable to be deleted.</div>

	</c:when>

	<c:when test="${createSuccess == 1}">

		<div class="alert alert-success" role="alert" id="alerts">Success!
			The airport was created!</div>

	</c:when>

	<c:when test="${createSuccess == -1}">

		<div class="alert alert-danger" role="alert" id="alerts">Failure!
			Something went wrong and the airport was unable to be created.</div>

	</c:when>

	<c:otherwise></c:otherwise>
</c:choose>

</html>