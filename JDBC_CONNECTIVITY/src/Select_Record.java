import java.sql.*;

public class Select_Record {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/cinema?serverTimezone=EST5EDT";
    private static final String user = "root";
    private static final String password = "rootuser";
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static PreparedStatement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String query = "select MOVIE_NAME,MOVIE_TYPE,MOVIE_RATING from movies where movie_rating=?";
        try { // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            // getting Statement object to execute query
            stmt = con.prepareStatement(query);

            stmt.setInt(1,10);
            // executing SELECT query
            rs = stmt.executeQuery();
            while (rs.next()) {
                String l_movie_name = rs.getString("MOVIE_NAME");
                String l_movie_type = rs.getString(2);
                String l_movie_rating = rs.getString("MOVIE_RATING");
                System.out.println("Movie name : " + l_movie_name + "| MOVIE TYPE : " + l_movie_type + "| MOVIE RATING : " + l_movie_rating);
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
            try {
                rs.close();
            } catch (SQLException se) {
            }
        }
    }
}


