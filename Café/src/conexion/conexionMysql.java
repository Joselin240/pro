package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionMysql {

	Connection cn;
	
	
	public Connection conectar(){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/coffe", "root", "2567");
		System.out.println ("Conectado");
		} catch (Exception e) {
		System.out.println("Error de conexión bd" +e);
		}
		return cn;
	}
	
}
