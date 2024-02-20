package nguyenductung.conn;

import java.sql.Connection;
import java.sql.SQLException;


public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		System.out.println("Get connection ...");
		
		// Lay doi tuong ket noi database
		
		Connection conn = ConnectionUtils.getMSSQLConnection();
		System.out.println("Get connection " + conn);
		System.out.println("Done!");
	}


}
