import java.util.Scanner;
import java.sql.*;
public class createDatabase{
    public static void main(String[] args) throws Exception
    {
	    Scanner in= new Scanner(System.in);
        System.out.println("Enter Database Name : ");
        String db=in.nextLine();
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
            Statement st = con.createStatement();
            String sqlquery="create database "+db;
            int m=st.executeUpdate(sqlquery);
            System.out.println("Database Created");
            con.close();
        }
        catch(SQLException e)
        {
        System.out.println(e);
        }
    }
}