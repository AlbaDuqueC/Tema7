package boletin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {

	public static void main(String[] args) {

		String conexion = "jdbc:mysql://localhost/InstitutoDB";
		String usuario = "root";
		String contraseña = "alba123";

		String telefono;
		String email;
		String fechaNacimiento;
		String apellido;
		String nombre;
		String especialidad;
		int id;
		int año;

		try (Connection con = DriverManager.getConnection(conexion, usuario, contraseña)) {

			Statement st = con.createStatement();

			st.executeUpdate(
					"insert into estudiantes (id_estudiante, nombre, apellido, fecha_nacimiento, email, telefono)"
							+ " values ('2002', 'Pepa', 'Florentino', '2002-02-20', 'pepa.florentina@gmail.com', '202020202')");

			ResultSet rs = st.executeQuery("SELECT * FROM Estudiantes");

			while (rs.next()) {
				id = rs.getInt("id_estudiante");
				nombre = rs.getString("nombre");
				apellido = rs.getString("apellido");
				fechaNacimiento = rs.getString("fecha_nacimiento");
				email = rs.getString("email");
				telefono = rs.getString("telefono");

				System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido
						+ ", Fecha Nacimiento: " + fechaNacimiento + ", Email: " + email + ", Teléfono: " + telefono);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
