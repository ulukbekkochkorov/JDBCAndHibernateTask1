package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String username = "postgres";
    private static final String password = "2406";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    public static Connection connection () throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
