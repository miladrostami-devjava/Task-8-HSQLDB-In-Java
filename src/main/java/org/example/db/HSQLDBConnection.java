package org.example.db;

import java.sql.*;

public class HSQLDBConnection {
private static final String URL  =
        "jdbc:hsqldb:hsql://localhost/MILAD";
private static final  String username = "SA";
private static final String password = "123";

public static void  hsqldbRun() {
    try {
Class.forName("org.hsqldb.jdbc.JDBCDriver");
connectionDB();
    }catch (Exception e){
e.printStackTrace();
    }

}

    private static void connectionDB() throws SQLException {
        Connection conn = DriverManager.getConnection(URL,username,password);

String insertQuery = "INSERT INTO MILAD VALUES (1,'MILADR','1234')";
        Statement statement = conn.createStatement();
        statement.execute(insertQuery);
        ResultSet set = statement.executeQuery("SELECT * FROM MILAD");
        while (set.next()){
            System.out.println("ID " + set.getString("text") + "\n");
        }
      statement.close();
        conn.close();
    }


}
