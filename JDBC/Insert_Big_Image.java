
import java.util.*;
import java.sql.*;
import java.io.*;
import javax.swing.*;

public class Insert_Big_Image {
    public static void main(String[] args) {
        try {
            
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/akshaydb";
            username = "root";
            password = "admin";

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "insert into images(picture) values(?)";

            PreparedStatement pstmt = con.prepareStatement(sql);

            JFileChooser jfc = new JFileChooser();
            
            jfc.showOpenDialog(null);

            File file= jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Image added successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }  
}
