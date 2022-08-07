import java.util.Scanner;
import java.sql.*;
public class retrieveData{
    public static void main(String[] args) throws Exception
    {
		Scanner in= new Scanner(System.in);
		System.out.println("To Retrieve Data Using parameters Enter - 1 \nTo Retrive Data Without Using Parameters Enter - any integer");
		int inputvalue=in.nextInt();
    	try
		{
	    	Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mulesoft", "root", "");
			Statement st = con.createStatement();
			if(inputvalue==1)
			{
				System.out.print("Enter Parameter Name (name,actor,actress,director,year of release) : ");
				String parametername=in.next();
				System.out.println("Enter Parameter Value :");
				String parametervalue=in.next();
				ResultSet rs = st.executeQuery("select *from movies where "+parametername+" = '"+parametervalue+"'");
				ResultSetMetaData rsmd = rs.getMetaData ();
				int cols = rsmd.getColumnCount ();
				for(int i = 1; i <= cols; i++)
				{
					System.out.print(rsmd.getColumnName(i)+"\t\t");
				}
				System.out.println();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
				}
			}
			else
			{
				ResultSet rs = st.executeQuery("select *from movies");
				ResultSetMetaData rsmd = rs.getMetaData ();
				int cols = rsmd.getColumnCount ();
				for(int i = 1; i <= cols; i++)
				{
					System.out.print(rsmd.getColumnName(i)+"\t\t");
				}
				System.out.println();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
				}
			}
			con.close();
        }
    	catch(SQLException e)
        {
        System.out.println(e);
        }
    }
}