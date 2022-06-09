/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sample.dto.Account;
import sample.utils.DBUtils;

/**
 *
 * @author minhh
 */
public class AccountDAO {
    public static Account getAccount(String email, String password){
    Connection cn = null;
    Account acc = null;
    try{
        cn = DBUtils.makeConnection();
        if(cn !=null){
            String sql ="select accID, email, password,fullname,phone,status,role\n"
                    +"from dbo.Accounts\n"
                    +"where status=1 and email=? and password=? COLLATE Latin1_General_CS_AS";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs= pst.executeQuery();
            if(rs !=null && rs.next()){
                int AccID = rs.getInt("accID");
                String Email = rs.getString("email");
                 String Password = rs.getString("password");
                  String Fullname = rs.getString("fullname");
                   String Phone = rs.getString("phone");
                   int Status = rs.getInt("status");
                     int Role = rs.getInt("role");
                     acc = new Account(AccID, Email,Password,Fullname, Status, Phone,Role);
                     
            }
            
        }
    } catch (Exception e){
        e.printStackTrace();
    } finally {
        if(cn!=null){
            try {
                cn.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    return acc;
    }

    public static boolean insertAccount(String email, String password,String fullname, String phone,int status,int role){
                 boolean result=false;
                 try{
                 Connection cn = DBUtils.makeConnection();
                 if(cn!=null){
                 String sql="insert dbo.Accounts(email,password,fullname,phone,status,role)\n" +
                   "values(?,?,?,?,?,?)";
                 PreparedStatement pst = cn.prepareStatement(sql);
                 pst.setString(1,email);
                 pst.setString(2,password);
                 pst.setString(3,fullname);
                 pst.setString(4,phone);
                 pst.setInt(5,status);
                 pst.setInt(6,role);
                 result= pst.executeUpdate() >0;
         
}
    }catch (Exception e){
                e.printStackTrace();
            }
       
         

         return result;
    }
}
