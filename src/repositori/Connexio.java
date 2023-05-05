package repositori;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connexio {

	private static final String ruta = "lib\\database.db";
	private static Connection con = null;

	public Connexio() {
	};

	public static Connection getConexio() {

		try {
			if (con == null) {
				con = DriverManager.getConnection("jdbc:sqlite:" + ruta);
			} else {
				con.close();
				con = DriverManager.getConnection("jdbc:sqlite:" + ruta);
			}

			if (con != null) {// que salga mensaje en un dialogpanel
				System.out.println("Conexió exitosa");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.out.println("Error en la connexió");
		}

//		//cerrar la conexión se trasladará al metodo crud correspondiente
//		try {
//			con.close();
//			System.out.println("Conexió tancada");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		return con;
	}
	
	public ResultSet CONSULTAR(String str) {
		System.out.println("consultar: "+str);
		return null;
		
	}
}
