/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sample.dto.Order;
import sample.dto.OrderDetail;
import sample.utils.DBUtils;

/**
 *
 * @author minhh
 */
public class OrderDAO {

    public static ArrayList<Order> getOrders(String email) {
        ArrayList<Order> list = new ArrayList<>();
        Connection cn = null;
        Order order = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "SELECT OrderID,OrdDate,shipdate,dbo.Orders.status,dbo.Orders.AccID\n"
                        + "from dbo.Orders join dbo.Accounts on dbo.Orders.AccID = dbo.Accounts.accID\n"
                        + "where dbo.Accounts.email=? COLLATE Latin1_General_CS_AS";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, email);
                ResultSet rs = pst.executeQuery();
                while (rs != null && rs.next()) {
                    int OrderID = rs.getInt("OrderID");
                    String OrderDate = rs.getString("OrdDate");
                    String ShipDate = rs.getString("shipdate");
                    int status = rs.getInt("status");
                    int AccID = rs.getInt("AccID");
                    order = new Order(OrderID, OrderDate, ShipDate, status, AccID);
                    list.add(order);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public static ArrayList<OrderDetail> getOrderDetail(int orderID) {
         ArrayList<OrderDetail> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "SELECT DetailId, OrderID,PID,PName,price,imgPath,quantity\n"
                        + "from dbo.OrderDetails join Plants on OrderDetails.FID = Plants.PID\n"
                        + "where OrderID=? ";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, orderID);
                ResultSet rs = pst.executeQuery();
                while(rs !=null && rs.next()){
                    int detailID = rs.getInt("DetailId");
                    int PlantID = rs.getInt("PID");
                    String PlantName = rs.getString("PName");
                    int price = rs.getInt("price");
                    String imgPath = rs.getString("imgPath");
                    int quantity = rs.getInt("quantity");
                    OrderDetail orderdetail = new OrderDetail(detailID, orderID, PlantID, PlantName, price, imgPath, quantity);
                    list.add(orderdetail);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn!=null){
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}

