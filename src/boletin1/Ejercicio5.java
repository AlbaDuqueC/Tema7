package boletin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost/InstitutoDB";
		String usuario = "root";
		String contraseña = "alba123";
		
		
		int idC;
		int idE;
		
		String nombreC;
		String nombreE;
		
		
		try (Connection con = DriverManager.getConnection(conexion, usuario, contraseña)) {

			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM Estudiantes");

			while (rs.next()) {
				
				idE=rs.getInt("id_estudiante");
				nombreE= rs.getString("nombre");
				
				System.out.println("El estudiante "+ nombreE + " con el id " + idE);
				
				ResultSet rsC = st.executeQuery("SELECT * FROM Cursos");
				
				while (rsC.next()) {
					
					idE=rs.getInt("id_curso");
					nombreE= rs.getString("nombre");
					
				}
				
			}
			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
