<%-- 
    Document   : registration
    Created on : 02-Jun-2022, 15:51:13
    Author     : minhh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registration</title>
         <link rel="stylesheet" href="mycss.css" type="text/css" />
    </head>
    <body>
    <header>
        <%@include file="header.jsp" %>
        
    </header>
        <section>
            <form action=" mainController" method="post" class="formregister">
                <h1>Register</h1>
                <table>
                    <tr><td>Email</td><td><input type="text" name="txtemail" required=""></td></tr>
                      <tr><td>Full name</td><td><input type="text" name="txtfullname" required=""></td></tr>
                        <tr><td>password</td><td><input type="password" name="txtpassword" required=""></td></tr>
                          <tr><td>phone</td><td><input type="text" name="txtphone"></td></tr>
                          <tr><td colspan="2"><input type="submit" value="register" name="action"></td></tr>
                </table>
                
            </form>
        </section>
        <footer>
            <%@include file="footer.jsp" %>
        </footer>
    </body>
</html>
