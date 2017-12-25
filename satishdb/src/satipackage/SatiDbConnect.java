package satipackage;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class SatiDbConnect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/satish", "satti", "satish");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from customers");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "	" + rs.getInt(2) + "	" + rs.getInt(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
