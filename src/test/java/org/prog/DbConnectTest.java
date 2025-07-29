
package org.prog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DbConnectTest {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/db";
            String username = "user";
            String password = "password";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connect");
            } catch (SQLException e) {
                System.err.println("No connect");
                e.printStackTrace();
            }
        }
    }


