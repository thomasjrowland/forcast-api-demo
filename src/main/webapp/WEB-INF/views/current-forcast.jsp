<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current forcast</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />
</head>
<body>



	<table>
		<tr>
			<th></th>
		</tr>
		
		<c:forEach items="${ forcast }" var="day">
			<tr>
				<td>${ day.startPeriodName }</td>
				<td>${ day.tempLabel }</td>
				<td>${ day.temperature }</td>
				<td>${ day.weather }</td>
				<td><img alt="icon" src="${ day.iconLink }"></td>
				<td>${ day.text }</td>
			</tr>	
		</c:forEach>			
		
	</table>



</body>
</html>