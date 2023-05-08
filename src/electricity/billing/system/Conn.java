package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:330/ebs", "root", "Raj@9009");
            s = c.createStatement();
            
        } catch (Exception e) {
           // System.out.println("raj kumar patidar");
            e.printStackTrace();
        }
    }
}
