package backend.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDC {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            String endpoint = "moviedb.cmonbq7su2dq.us-east-1.rds.amazonaws.com";
            String url = "jdbc:postgresql://" + endpoint + "/postgres";
            String username = "adedeji";
            String password = "tayquan21";

            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection conn1 = getConnection();
        System.out.println(conn1);
    }

}
