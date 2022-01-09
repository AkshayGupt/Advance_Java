import java.sql.*;
import java.util.*;

public class SelectingData {
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            //1. Load the driver ( Optional )
            // Class.forName("com.mysql.jdbc.Driver");

            //2. Creating a connection
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/akshaydb";
            username = "root";
            password = "admin";

            Connection con = DriverManager.getConnection(url, username, password);

            //Creating a query
            String sql = "select * from score";

            //Creating a statement
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(sql);

            //Printing table
            while(set.next()){
                int subjectId = set.getInt(1);
                String subject = set.getString(2);
                int marks = set.getInt(3);

                System.out.println(subjectId+" | "+subject+"   |  "+marks);
            }
            

            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
