package senior.databaseInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
private final String url = "jdbc:mysql://localhost:3306/school";
private final String user = "root";
private final String password = "sun715004";

//建立連線
public Connection getConnection() throws SQLException{
    return DriverManager.getConnection(url, user, password);
}





}
