import java.sql.*;

public class DbHandler {
	Connection conn;
	Statement st;
	ResultSet res;

	public DbHandler() {

	}

	public void connect() {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "demo";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "mypassword";
		try {
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url + dbName,
					userName, password);
			// Statement st = conn.createStatement();
			// ResultSet res = st.executeQuery("SELECT * FROM  event");
			// while (res.next()) {
			// int id = res.getInt("id");
			// String msg = res.getString("msg");
			// System.out.println(id + "\t" + msg);
			// }
			// int val = st.executeUpdate("INSERT into event VALUES(" + 1 + ","
			// + "'Easy'" + ")");
			// if (val == 1)
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void disconnect() {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
