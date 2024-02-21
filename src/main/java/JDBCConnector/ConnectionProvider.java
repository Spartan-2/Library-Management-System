/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBCConnector;

import static java.lang.constant.ConstantDescs.NULL;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author karti
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lsm","root","sqlpass11");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
       
    }
    
}
