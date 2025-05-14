package boletin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost/InstitutoDB";
		String usuario = "root";
		String contraseña = "alba123";
		
		try (Connection con = DriverManager.getConnection(conexion, usuario, contraseña)) {

			Statement st = con.createStatement();
			
			st.executeUpdate("DELETE FROM Estudiantes WHERE apellido='Florentino'");
			
			System.out.println("Illo funciona");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
