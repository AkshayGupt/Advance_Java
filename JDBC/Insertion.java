import java.sql.*;
import java.util.*;

public class Insertion {
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
            String sql = "insert into score(subject, marks) values(?,?)";

            //Creating a statement
            PreparedStatement pstmt = con.prepareStatement(sql);

            //Taking user input
            String subject, marks;
            System.out.println("Enter subject name");
            subject = sc.next();
            System.out.println("Enter the score");
            marks = sc.next();

            //Executing query
            pstmt.setString(1, subject);
            pstmt.setString(2, marks);

            pstmt.executeUpdate();

            System.out.println("Inserted successfully..");

            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
