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
        <div class="staff-div">
        	<div class="pro-image">
        		<img class="prof-img" src="Images/prof.jpg">
        	</div>
       		<div class="log-in">
       			<div class="welcome-div">
       				<p class="welcome-para">Welcome to <span style="color:black; font-weight:bold;">Dr.N.G.P IT </span>Staff Portal </p>
       			</div>
       			<div class="form-div">
       				<form method="post" action="login.jsp" class="form">
       					<input type="text" name="userName" placeholder="Staff-Name" class="user-input"><br>
       					<input type="password" name="passWord" placeholder="Pass-Word" class="pass-input"><br>
       					<input type="submit" value="Log in" class="submit-input">
       				</form>
       				<p class="new-staff">Are You a New Staff !? <a class="sign-in">sign In</a></p>
       			</div>
       			
       		</div>		
        </div>
	</body>
</html>