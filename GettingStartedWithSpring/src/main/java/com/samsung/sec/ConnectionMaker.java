/**
 * Created by style95 on 4/14/14.
 */
package com.samsung.sec;

import java.sql.Connection;
import java.sql.SQLException;


public interface ConnectionMaker {
    public Connection makeNewConneciton() throws ClassNotFoundException, SQLException;
}
