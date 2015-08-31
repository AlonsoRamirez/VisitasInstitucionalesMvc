<%-- 
    Document   : login
    Created on : 08-18-2015, 06:24:54 PM
    Author     : L.Michelle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name ="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="SistemaVisitasInstitucionales/Web/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="SistemaVisitasInstitucionales/Web/css/login.css">
        <title>~~~Welcome~~~</title>
		<style type="text/css">
             
                 body {
			background-image: url("fondoudb.jpg");
             } 
		</style>
    </head>
    <body>
    <div class="jumbotron loginbox">
    <h4>Sistema de Visitas Institucionales UDB</h4> 
    <form action="/login" method="post" > 
              <label>  Usuario: </label> 
              <input title="introduzca su usuario" type="text" class="form-control" name="usuario" required/><br><br>
              <label>  Password: </label> 
              <input title="introduzca su password" type="password" class="form-control" name="password" required/><br><br>
              <input type="submit" class="btn btn-success" value="Entrar"><br><br>
              <img src="udb.png" height="150" width="150" hspace="90">
                 
    </form>	
    </div>  
	 <body>
                				
</html>

