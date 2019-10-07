import java.sql.*;

public class Update_Record {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/cinema?serverTimezone=EST5EDT";
    private static final String user = "root";
    private static final String password = "rootuser";
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static PreparedStatement stmt;

    public static void main(String args[]) {
        String query = "update movies set movie_type=? "
                     + " where movie_name=?";
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            // getting Statement object to execute query
            stmt = con.prepareStatement(query);
            // setting the arguments
            stmt.setString(1,"Drama");
            stmt.setString(2,"Titanic");

            // executing insert query
            int status = stmt.executeUpdate();

            if (status == 1){
                System.out.println("Record updated Successfully");
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


