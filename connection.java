import java.sql.*;
public class connection{
    public static void main(String[] args) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
            System.out.println("Connection Successful!!!");
            con.close();
        }
        catch(SQLException e)
        {
        System.out.println(e);
        }
    }
}