package az.atlacademy.chapter_11_jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public void test(){
        var url = "jdbc:derby:pandas";
        var sql = "SELECT name FROM pandas WHERE location = 'DC'";
        try (var conn = DriverManager.getConnection(url); // s1
             var stmt = conn.prepareStatement(sql); // s2
             var rs = stmt.executeQuery()) {
            if (rs.next())
                System.out.println(rs.getString("name"));
            else
                System.out.println("No match");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void test10(){
        var url = "jdbc:derby:birds";
        var sql = "SELECT name FROM peacocks WHERE name = ?";
        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.prepareStatement(sql)) { // s1
            stmt.setString(1, "Feathers");
            stmt.setString(2, "Nice");
            boolean result = stmt.execute(); // s2
            System.out.println(result);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {

        test10();
    }
}
