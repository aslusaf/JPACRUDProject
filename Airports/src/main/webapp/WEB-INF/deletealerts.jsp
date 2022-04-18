<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<div class="row">
	<c:choose>
		<c:when test="${success == 1}">

			<!-- display success banner -->

			<div class="alert alert-success" role="alert" id="alerts">Success!
				The airport was deleted!</div>

		</c:when>

		<c:when test="${success == -1}">

			<!-- display failed banner -->

			<div class="alert alert-danger" role="alert" id="alerts">Failure!
				Something went wrong and the airport was unable to be deleted.</div>


		</c:when>

		<c:otherwise></c:otherwise>
	</c:choose>

</div>
</html>