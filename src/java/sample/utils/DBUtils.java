/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author minhh
 */
public class DBUtils {

    public static Connection makeConnection() throws Exception {
        Connection cn = null;
        String IP="localhost";
        String instanceName="DESKTOP-7TSLJ6R";
        String port ="1433";
        String uid="sa";
        String pwd ="sa";
        String db ="PlantShop";
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url= "jdbc:sqlserver://" +IP+"\\"+ instanceName+":" +port
                +";databasename="+db+";user="+uid+";password="+pwd;
        Class.forName(driver);
        cn= DriverManager.getConnection(url);
        return cn;
    }
}

