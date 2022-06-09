<%-- 
    Document   : header_loginedUser
    Created on : 02-Jun-2022, 16:18:24
    Author     : minhh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="mycss.css" type="text/css" />
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="">change profile</a></li>
                <li><a href="">completed order</a></li>
                <li><a href="">canceled orders</a></li>
                <li><a href="">processing orders</a></li>
                <li>from<input type="date" name="from">to <input type="date" name="to">
                    <input type="submit" value="search">
                </li>                
            </ul>
        </nav>
    </body>
</html>
