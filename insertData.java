import java.sql.*;
public class insertData{

    public static void main(String[] args) throws Exception
    {
        try 
        {
		    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft", "root", "");
            Statement st = con.createStatement();
		    st.addBatch("insert into movies values(1,'Baahubali','Prabhas','Anushka', 'S.S.Rajamouli',2015)");
            st.addBatch("insert into movies values(2,'Venom','Tom Hardy','Michelle Williams','Ruben Fleischer',2018)");
            st.addBatch("insert into movies values(3,'Mishan impossible','Jay Chandra','Taapsee Pannu','Swaroop Rsj',2022)");
            st.addBatch("insert into movies values(4,'I Am Legend','Will Smith','Alice Braga','Francis Lawrence',2007)");
            st.addBatch("insert into movies values(5,'Train To Busan','Gong Yoo','Jung Yu-Mi','Yeon Sang-ho',2016)");
            st.addBatch("insert into movies values(6,'Suicide Squard','Will Smith','Margot Robbie','David Ayer',2016)");
            st.addBatch("insert into movies values(7,'The Karate Kid','Jaden Smith','Wenwen Han','John Guilbert Avildsen',2010)");
            st.addBatch("insert into movies values(8,'Radhe Shyam','Prabhas','Pooja Hegde','Radha Krishna Kumar',2022)");
            st.addBatch("insert into movies values(9,'KGF','Yash','Srinidhi Shetty','Prashanth Neel',2018)");
            st.addBatch("insert into movies values(10,'Focus','Will Smith','Margot Robbie','Glenn Ficarra',2015)");
            st.executeBatch();
            System.out.println("Data Inserted Successfully!!");
            con.close();
        }
        catch(SQLException e)
        {
        System.out.println(e);
        }
    }
}