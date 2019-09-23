
import java.sql.*;

public class operations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
      //step2 create  the connection object  
        Connection conn=null;
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "*****", "******");
        
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO VEHICLE_INFO values ('aa002','Bus','a','b','offline')");
        conn.close();
	}

}
