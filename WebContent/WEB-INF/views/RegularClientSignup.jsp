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
	<form action="Sellerhome" method="post">
		<table border="1" >
		
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="fname"/></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname"/></td>
			</tr>
			<tr>
				<td>Adhaar Card Number</td>
				<td><input type="number" name="adhaar"/>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"/></td>
			</tr>
			<tr>
				<td>Contact No:</td>
				<td><input type="tel" name="phone"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"/></td>
			</tr>	
				<h3>Address</h3>
			<tr>
				<td>Address : </td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td>Zipcode :</td>
				<td><input type="number" name="zipcode"/></td>
			</tr>
			
			<tr>
				<td>City :</td>
				<td><select name="city">
						<option value="indore">Indore</option>
						<option value="mumbai">Mumbai</option>
						<option value="pune">Pune</option>
						<option value="bhopal">Bhopal</option>
						<option value="nagpur">Nagpur</option>
						<option value="ahemdabad">Ahemdabad</option>
						<option value="jaipur">Jaipur</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>State :</td>
				<td><select name="state">
						<option value="Madhya Pradesh">Madhya Pradesh</option>
						<option value="Maharashtra">Maharashtra</option>
						<option value="Chhatisgarh">Chhatisgarh</option>
						<option value="Rajasthan">Rajasthan</option>
						<option value="Gujrat">Gujrat</option>
						<option value="indore">Ahemdabad</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Country :</td>
				<td><input type="text" name="country" value="India"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="submit"/></td>
			</tr>
		
		</table>
	</form>
<p>	${msge}</p>
</center>
</body>
</html>