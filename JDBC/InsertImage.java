import java.util.*;
import java.sql.*;
import java.io.*;
public class InsertImage {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       try{
            
        String url, username, password;
        url = "jdbc:mysql://localhost:3306/akshaydb";
        username = "root";
        password = "admin";

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "insert into images(picture) values(?)";

        PreparedStatement pstmt = con.prepareStatement(sql);

      
        String path="";
        System.out.println("Enter the full path of the image:");
        path=sc.nextLine();

        FileInputStream fis = new FileInputStream(path);


        pstmt.setBinaryStream(1, fis, fis.available());
        pstmt.executeUpdate();
        System.out.println("Image inserted!");
        con.close();
       }
       catch(Exception e){
           System.out.println("Error : "+e);
       }
   } 
}
