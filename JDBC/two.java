import java.sql.*;
import java.util.Scanner;

public class two{
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        try{
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter Password");
            String password = sc.next();
            System.out.println("Enter Email: ");
            String email = sc.next();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:2700/db", "root", "pass");
            PreparedStatement pst = conn.preparedStatement(
                "insert into register(?, ?, ?)"
            );
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, email);
            int i = pst.executeUpdate();
            if(i != 0){
                //success
            }else{
                // failed
            }
        }catch (Exception e){
            //error
        }conn.close();
    }
}