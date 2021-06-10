import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnectionFactory {
	private static final String DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://database-poo.covu9ynlyi3h.us-east-1.rds.amazonaws.com:3306/poo_database?useTimezone=true&serverTimezone=UTC"; 
	private static final String USER = "admin"; 
	private static final String SENHA = "admin123"; 
	public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
            		URL, USER, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
	}

	public static void closeConnection(Connection con) {
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt)
	{
		closeConnection(con);
		
		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}