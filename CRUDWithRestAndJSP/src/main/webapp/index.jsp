<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html lang="tr">
<head>
<style type="text/css">
a:hover{
background-color: #5a2020;
color: #ffffff
}
.divHover:hover{
background-color: #5a2020;
color: #ffffff
}
a{
float: left;
text-decoration:none;
border: 5px solid;
border-color:#000000;
margin-left:5%;
background-color: #000000;
color: #ffffff;
border-radius: 15%;
}

</style>
<title>Create User</title>
</head>
<body>
	<div class="divHover" style="padding-left:50px;font-family:monospace;text-align:center;font-size: 50px;">
			CRUD Operations</div>
			<div class="divHover" style="padding-left:50px;font-family:monospace;font-style:italic;text-align:center;font-size: 35px;">
			Choose operation :</br></br></div>
			<div style="padding-left:50px;font-family:monospace;text-align:left;color:#5a2020;font-size: 25px;">
		<a href="./create.jsp" style="margin-left:15%;">Create User</a>
		<a href="./rest/userInfo"><div style="color:saffron">Get User details</div></a>
		<a href="./update.jsp" ><div style="color:saffron">Update User</div></a>
		<a href="./delete.jsp"><div style="color:saffron">Delete User</div></a>
	</div>
	<div style="font-family:monospace;text-align:center;font-size: 15px;margin-top:30%">2021 | Mehmet Emin KONUK
	</div>
</body>
</html>