<%-- 
    Document   : login
    Created on : 17 Jan 2020, 8:13:17 AM
    Author     : gerry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="ServletController" method="post">
                Ingresar usuario: <input type="text" name="uname"> <br>
                Ingresar Contrasena: <input type="password" name="upassword"><br>
                <input type="submit" value="ingresar">
            </form>

        </div>
    </body>
</html>
