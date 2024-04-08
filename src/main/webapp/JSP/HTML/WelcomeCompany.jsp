<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
	<head>
		<title>Dr.N.G.P Institute Of Technology</title>
		<link rel="stylesheet" href="CSS/WelcomeCompany.css"> 
	</head>
	<body class="body-company">
		 <div class="logo">
            <div>
                <img src="Images/logo-ngp.png" class="logo-img">
            </div>
            <div class="ngp-div">
                <p class="ngp-para">NGP
                <span class="tech-span">iTECH</span></p>
            </div>
            <div> 
            	<p class="staff-portal">Staff Portal</p>
            </div>
        </div>
        <div class="c-block-div">
        	<img class="c-block-image" src="Images/c-block-image.jpg">
        </div>
        <div class="proffessor">
        	<div class="professor-image">
        		<img class="prof-img" src="Images/prof.jpg">
        	</div>
       		<div class="log-in">
       			<form method="post" action="login.jsp">
       				<input type="text" name="userName" placeholder="User-Name">
       				<input type="password" name="passWord" placceholder="Pass-word">
       				<input type="submit" value="Log in">
       			</form>
       		</div>		
        </div>
	</body>
</html>