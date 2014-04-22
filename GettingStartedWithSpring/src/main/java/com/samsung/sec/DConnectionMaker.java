package com.samsung.sec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by style95 on 4/14/14.
 */
public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeNewConneciton() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/spring", "root", "qwe123");

        return c;
    }
}
