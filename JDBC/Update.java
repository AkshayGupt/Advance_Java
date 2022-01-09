import java.sql.*;
import java.util.*;

public class Update {
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
            String sql = "update score set subject=? , marks =? where subjectId = ?";



            //Creating a statement
            PreparedStatement pstmt = con.prepareStatement(sql);

            //Taking user input
            int id;
            System.out.println("Enter the id of the subject:");
            id=sc.nextInt();
            String subject;
            int marks;
            System.out.println("Enter the new subject name");
            subject = sc.next();
            System.out.println("Enter the new score");
            marks = sc.nextInt();

            //Executing query
            pstmt.setString(1, subject);
            pstmt.setInt(2, marks);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();

            System.out.println("Updated successfully..");

            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
