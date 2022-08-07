import java.sql.*;
public class createTable
{
    public static void main(String[] args) throws Exception
    {
	try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mulesoft", "root", "");
            Statement st = con.createStatement();
            String sqlquery="CREATE TABLE movies (id int,name varchar(25) not null,actor varchar(25) ,actress varchar(25) ,director varchar(25) not null,year_of_release int(4) not null,PRIMARY KEY (id))";
            st.executeUpdate(sqlquery);
            System.out.println("Table Created Successfully!!");
            con.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
