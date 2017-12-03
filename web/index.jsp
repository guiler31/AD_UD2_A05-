<%-- 
    Document   : index
    Created on : 22-nov-2017, 10:19:16
    Author     : guille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
 <title>Inicio</title>
 </head>
 <body>
 <h1>Albumes. Obtiene todos los Albumes con EJB </h1>
 <form action="NewServlet" method="POST">Presiona el
botón para obtener los datos.

 <input type="submit" name="slect" value="Select"/>
 </form>
 
 <form action="Insert" method="POST">Presiona el
botón para hacer un insert en grupos.
 <input type="text" name="insert"/>
 <input type="submit" value="Insert">
 </form>
 
 <form action="Delete" method="POST">Presiona el
botón para hacer un delete en grupos.
<input type="submit" value="Delete">
 </form>
 
  <form action="Update" method="POST">Presiona el
botón para hacer un udate en grupos.
<input type="submit" value="Update">
 </form>
 
 </body>
</html>
