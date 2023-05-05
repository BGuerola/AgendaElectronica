package repositori;

import model.Contacto;

public interface Crud {
		
	public void altaContacte(Contacto altacontacto);
	public void editarContacte();
	public void eliminarContacte(int id);
	public void consultarContactes();
	public void consultarUnContacte(String columna, String dada);
}
