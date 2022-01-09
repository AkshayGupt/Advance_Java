
import java.sql.*;
import java.util.*;

class CreateTable {
    public static void main(String args[]){
        try{

            //1. Load the driver ( Optional )
            // Class.forName("com.mysql.jdbc.Driver");

            //2. Creating a connection
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/akshaydb";
            username = "root";
            password = "admin";

            Connection con = DriverManager.getConnection(url, username, password);

            //Creating a query
            String sql = "Create table score (subjectId int(20) primary key auto_increment, subject varchar(100) not null, marks int(30))";

            //Creating a statement
            Statement stmt = con.createStatement();

            //Executing query
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully..");

            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
