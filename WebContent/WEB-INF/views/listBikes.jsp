<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<table border="1">
		<tr>
			<td>Bike ID</td>
			<td>Bike Registration No</td>
			<td>Model Name</td>
			<td>Image</td>
		</tr>
	  <c:forEach var="bike" items="${bikes}">
		<tr>
			<td>${bike.id}</td>
			<td>${bike.registrationNo}</td>
			<td>${bike.modelName}</td>
			<!--  <td><img alt="${bike.modelName}.jpeg" src="D:/eclipse-workspace/Spring MVC/ZoomScooter/WebContent/WEB-INF/image/${bike.modelName}.jpeg" width="30" height="30">-->
		    <td><a href="#">Add to Cart</a>
		</tr>
	  </c:forEach>
	
	</table>
</center>
</body>
</html>