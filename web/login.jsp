<%-- 
    Document   : login
    Created on : 02-Jun-2022, 15:43:01
    Author     : minhh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
        <link rel="stylesheet" href="mycss.css" type="text/css" />
    </head>
    <body>
        <header>
            <%@include file="header.jsp" %>

        </header>
        <section>
            <form action="mainController" method="post" class="formlogin">
                <table>
                    <td>email</td><td><input type="text" name="txtemail"></td></tr>
                    <tr><td>password</td><td><input type="password" name="txtpassword"></td></tr>
                    <tr><td colspan="2"><input type="submit" value="login" name="action"></td></tr>

                </table>
                   
            </form>
        </section>
            <footer>
                <%@include file="footer.jsp" %>
            </footer>

    </body>
</html>
