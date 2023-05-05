package servei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Contacto;
import repositori.Connexio;
import repositori.Crud;

public class Servei implements Crud{

	Connection con = null;
	
	ArrayList<Contacto> contactes = new ArrayList<>();
		
	@Override
	public void altaContacte(Contacto altacontacto) {
	
		try {
			con =	Connexio.getConexio(); 
				
			// Creamos el objeto para enviar sentencias
			PreparedStatement prst =  con.prepareStatement("insert into General values "
					+ "(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			prst.setString(1, altacontacto.getNom());
			prst.setString(2, altacontacto.getCognom1());
			prst.setString(3, altacontacto.getCognom2());
			prst.setInt(4, altacontacto.getTelf());
			prst.setString(5, altacontacto.getCategoria());
			prst.setString(6, altacontacto.getDescripcio());
			prst.setString(7, altacontacto.getEmail());
			prst.setString(8, altacontacto.getWeb());
			prst.setString(9, altacontacto.getLinkedin());
			prst.setString(10, altacontacto.getTwitter());
			prst.setString(11, altacontacto.getLocalitat());
			prst.setString(12, altacontacto.getProvincia());					
			prst.executeUpdate();
			
			prst.close();

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (con != null)
				try {
					con.close();
					System.out.println("Conexió tancada");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	@Override
	public void editarContacte() {	
	}
	
	@Override
	public void eliminarContacte(int id) {
		try {
			con =	Connexio.getConexio(); 
				
			// Creamos el objeto para enviar sentencias
			Statement st = con.createStatement();

			// Enviem una sent�ncia
			st.executeUpdate("delete from General where Telefon = "+id);
			
			System.out.println("Métode llençat");
			
			// tanquem ResultSet i Statement
			//rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if (con != null)
				try {
					con.close();
					System.out.println("Conexió tancada");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	@Override
	public void consultarContactes() {
		//metodeDao("SELECT * FROM General");
		//System.out.println(contacto.toString());		
	}

	@Override
	public void consultarUnContacte(String columna, String dada) {
		
			try {
				con =	Connexio.getConexio(); 
					
				// Creamos el objeto para enviar sentencias
				Statement st = con.createStatement();

				// Enviem una sent�ncia
				ResultSet rs = st.executeQuery("SELECT * FROM General WHERE "+columna+" = "+"'"+dada+"'");
				System.out.println("Resultat de la consulta: ");
				
				Contacto aux= new Contacto();
				
				while (rs.next()) {
						
				aux.setNom(rs.getString(1));
				aux.setCognom1(rs.getString(2));
				aux.setCognom2(rs.getString(3));
				aux.setTelf(rs.getInt(4));
				aux.setCategoria(rs.getString(5));
				aux.setDescripcio(rs.getString(6));;
				aux.setEmail(rs.getString(7));
				aux.setWeb(rs.getString(8));
				aux.setLinkedin(rs.getString(9));
				aux.setTwitter(rs.getString(10));
				aux.setLocalitat(rs.getString(11));
				aux.setProvincia(rs.getString(12));
				
				contactes.add(aux);
				}
				
				
				System.out.println("Métode llençat");
				
				// tanquem ResultSet i Statement
				rs.close();
				st.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} finally {
				if (con != null)
					try {
						con.close();
						System.out.println("Conexió tancada");
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
			contactes.forEach(System.out::println);
		}	
	}

