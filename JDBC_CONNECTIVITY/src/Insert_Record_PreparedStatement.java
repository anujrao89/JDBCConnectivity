import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Insert_Record_PreparedStatement {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/cinema?serverTimezone=EST5EDT";
    private static final String user = "root";
    private static final String password = "rootuser";
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static PreparedStatement stmt;

    public static void main(String args[]) {
        String query = "INSERT INTO movies (movie_id, movie_name,movie_rating ) "
                     + " VALUES (7, ?, ?)";
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            // getting Statement object to execute query
            stmt = con.prepareStatement(query);
            // setting the arguments
            stmt.setString(1,"BATMAN");
            stmt.setInt(2,9);

            // executing insert query
            int status = stmt.executeUpdate();

            if (status == 1){
                System.out.println("Record inserted Successfully");
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
            }
            try {
                stmt.close();
            } catch (SQLException se) {
            }
        }
    }
}


