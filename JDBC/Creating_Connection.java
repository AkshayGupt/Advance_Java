import java.util.*;
import java.sql.*;
class Creating_Connection{

    public static void main(String args[])
    {
        try{

            //1. Load the driver ( Optional )
            // Class.forName("com.mysql.jdbc.Driver");

            //2. Creating a connection
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/akshaydb";
            username = "root";
            password = "admin";

            Connection con = DriverManager.getConnection(url, username, password);

            //3. Check if the connection was successfully built
            if(con.isClosed()){
                System.out.println("ERROR: Connection failed!");
            }
            else{
                System.out.println("DB connected successfully...");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}