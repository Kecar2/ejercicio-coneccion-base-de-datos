package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String myUrl = "jdbc:mysql://localhost:3306/prueba";
		Connection conn = DriverManager.getConnection(myUrl, "root", "");
		//String query = "SELECT * FROM EMPLOYEES";
		String query = "SELECT * FROM DEPARTMENTS";
		// create the java statement
		Statement st = conn.createStatement();
		// execute the query, and get a java resultset
		ResultSet rs = st.executeQuery(query);
		// iterate through the java resultset
		while (rs.next())
			//System.out.println("id: " + rs.getInt("EMPLOYEE_ID") + "\t" + "nombre: " + rs.getString("FIRST_NAME")  + "\t" + "apellido: " + rs.getString("LAST_NAME"));
	/*____________________________________________________________________________________________________________________________________________________ */
		System.out.println("id: " + rs.getInt("DEPARTMENT_ID") + "\t" + "ciudad: " + rs.getString("CIUDAD")  + "\t" + "region: " + rs.getString("REGION")  + "\t" + "direccion: " + rs.getInt("DIR")  + "\t" + "objetivo: " + rs.getInt("OBJETIVO")  + "\t" + "venta: " + rs.getInt("VENTA"));
	}
}
