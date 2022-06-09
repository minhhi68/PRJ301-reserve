<%-- 
    Document   : personalPage
    Created on : 02-Jun-2022, 16:23:26
    Author     : minhh
--%>

<%@page import="sample.dao.OrderDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="sample.dto.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="mycss.css" type="text/css" />
    </head>
    <body>
        <%
            String name = (String) session.getAttribute("name");
            if (name == null) {

        %>

        <p><font color ='red'>You must login to view personal page</font></p>
        <p></p>
        <%} else {
        %>
        <header>
            <%@include file="header_loginedUser.jsp"  %>

        </header>
        <section>
            <h3>Welcome <%= name%> come back </h3>
            <h3><a href="mainController?action=logout">Log out</a></h3>
        </section>
        <section><!--load all orders of the user at here-->
            <%
                ArrayList<Order> list=OrderDAO.getOrders(email);
                String[] status = {"", "processing", "completed", "canceled"};
                if (list != null && !list.isEmpty()) {
                             for (Order ord : list) {%>
            <table class="order">
                <tr><td>Order ID</td><td>Order Date</td><td>Ship Date</td><td>Order's status</td><td>action</td></tr>
                <tr><td><%= ord.getOrderID()%></td>
                    <td><%= ord.getOrderDate()%></td>
                    <td><%= ord.getShipDate()%></td>
                    <td><%= status[ord.getStatus()]%>
                        <br/><% if (ord.getStatus() == 1) %><a href="#">cancel order</a>
                    </td>
                    <td><a href="orderDetail.jsp?orderid=<%= ord.getOrderID() %>">detail</a> </td></tr>
            </table>
            <%    }
              }

            else
      %>
      <p>You do not have any order</p>

                                      
                                  
                     </section>
                    

    </body>
</html>
