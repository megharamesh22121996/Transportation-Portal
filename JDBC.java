
import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
      //step2 create  the connection object  
        Connection conn=null;
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Megha@ga2");
        
        //step3 Checking while connection established or not
        if(conn!=null)
        {
        	System.out.println("Connection Established");
        }
        else
        {
        	System.out.println("Not Connected");
        }
        
      //step5 close the connection object  
        conn.close();
        
	}

}
