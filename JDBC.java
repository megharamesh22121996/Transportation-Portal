
import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=null;
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Megha@ga2");
        if(conn!=null)
        {
        	System.out.println("Connected");
        }
        else
        {
        	System.out.println("Not Connected");
        }
        conn.close();
        
	}

}
