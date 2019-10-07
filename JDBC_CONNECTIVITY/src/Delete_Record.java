import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Record {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/cinema?serverTimezone=EST5EDT";
    private static final String user = "root";
    private static final String password = "rootuser";
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;

    public static void main(String args[]) {
        String query = "delete from movies where movie_name='BATMAN'";
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            // getting Statement object to execute query
            stmt = con.createStatement();
            // executing delete query
            int status = stmt.executeUpdate(query);

            if (status == 1){
                System.out.println("Record deleted Successfully");
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt
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


