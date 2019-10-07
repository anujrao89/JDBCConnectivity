import java.sql.*;

public class Test_Connectivity {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/cinema?serverTimezone=EST5EDT";
    private static final String user = "root";
    private static final String password = "rootuser";
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String query = "select count(*) from movies";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");  no longer required
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            // getting Statement object to execute query
            stmt = con.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of movies in the table : " + count);
            }
        } catch (SQLException | ClassNotFoundException sqlEx) {
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
            try {
                rs.close();
            } catch (SQLException se) {
            }
        }
    }
}


