<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="addBike" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>Registration No:</td>
				<td><input type="text" name="registrationNo"/></td>
			</tr>
			<tr>
				<td>Engine No:</td>
				<td><input type="text" name="engineNo"/></td>
			</tr>
			<tr>
				<td>Model Name:</td>
				<td><input type="text" name="modelName"/></td>
			</tr>
			<tr>
				<td>Year Of Manufacturing :</td>
				<td><input type="date" name="yearOfManufacturing"/></td>
			</tr>
			<tr>
				<td>Image to upload:</td>
				<td><input type="file" name="image"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="submit"/></td>
			</tr>
		</table>
		
	</form>
</center>
</body>
</html>