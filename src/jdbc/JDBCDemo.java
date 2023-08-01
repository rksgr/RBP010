package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        knowAboutStudent();
    }
    public static void knowAboutStudent(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//  translator
        }catch (ClassNotFoundException e){
            System.out.println("Oh! class has not been found");
            System.out.println(e);
        }

//        String url = "jdbc:mysql://localhost:3306/rbp010?useSSL=true";
//        String userName = "root";
//        String pwd = "priya@1987";
//        Connection con = DriverManager.getConnection(url, userName, pwd);// path
//        Statement stmt = con.createStatement();// vehicle
//
//        String query = "INSERT INTO student VALUES(3, 'Seema')";
//        int rows = stmt.executeUpdate(query);// container
//        System.out.println(rows);
//
//        con.close();
    }
}
