package boletin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost/InstitutoDB";
		String usuario = "root";
		String contraseña = "alba123";
		
		try (Connection con = DriverManager.getConnection(conexion, usuario, contraseña)) {

			Statement st = con.createStatement();
			
			st.executeUpdate("INSERT INTO Cursos (nombre, descripcion, año_escolar) VALUES ('Historia 1º','Un tochaco de palabras con fechas y nombres muy en concretos', 2025 ) ");
			st.executeUpdate("INSERT INTO Cursos (nombre, descripcion, año_escolar) VALUES ('Biología 1º','Otro tochaco pero cientifico, que al menos es logico', 2025 ) ");
			st.executeUpdate("INSERT INTO Cursos (nombre, descripcion, año_escolar) VALUES ('Educación Física 1º','Una hora pa que las personas haga al menos un poco de deporte', 2025 ) ");
			st.executeUpdate("INSERT INTO Cursos (nombre, descripcion, año_escolar) VALUES ('Música 1º','Una asignatura de relleno que te obliga a tocar la flauta', 2025 ) ");
			st.executeUpdate("INSERT INTO Cursos (nombre, descripcion, año_escolar) VALUES ('Tecnología 1º','Una asignatura maravillosa en las que puedes apreder tanto a cortar madera como a hacer un robot', 2025 ) ");
			
			System.out.println("Funciona ole ole");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
