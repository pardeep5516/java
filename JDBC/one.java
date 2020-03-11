import java.sql.*;
public class student{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql//localhost/db", "root", "pass");
            Statement stm = conn.createStatement();
            String sql = "CREATE TABLE STUDENT(rollno INT, name CHAR(20), class char(20) contact int)";
            stmt.executeUpdate(sql);
            System.out.println('success');
        }catch (Exception e){

        }
        conn.close();
    }
}