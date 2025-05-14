package boletin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost/InstitutoDB";
		String usuario = "root";
		String contraseña = "alba123";
		
		try (Connection con = DriverManager.getConnection(conexion, usuario, contraseña)) {

			Statement st = con.createStatement();
			
			st.executeUpdate("UPDATE Estudiantes SET nombre='Lola' WHERE nombre='Pepa'");
			
			st.executeUpdate("UPDATE Profesores SET especialidad='Físico' WHERE nombre='Javier' AND apellido='López'");
			
			st.executeUpdate("UPDATE Cursos SET año_escolar=2024 WHERE nombre='Matemáticas 1º'");
			
			System.out.println("Funcinaaaaaaaaaaa");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
