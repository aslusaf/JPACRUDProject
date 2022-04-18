<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<nav id="navBar" class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="http://3.136.215.243:8080/Airports"> <img
			src="https://www.riversideca.gov/sites/default/files/img/Airport/Airport-01.png"
			alt="" width="32" height="32" class="d-inline-block align-text-top">
			&nbsp;<strong>Home</strong>
		</a>
		<form action="search.do" method="GET" class="d-flex">
			<input class="form-control me-2" type="search" name="query"
				placeholder="Search Database" aria-label="Search">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>
	</div>
</nav>
</html>