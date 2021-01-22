package ec.ups.edu.g2.appdis.ExamenWSCuji.negocio;

import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.ups.edu.g2.appdis.ExamenWSCuji.dao.ProductoDAO;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Producto;

@Stateless
public class GestionProductoON {

	@Inject
	private ProductoDAO daoProducto;
	
	public Producto buscarProducto(String codigo) throws Exception {
		Producto p = new Producto();
		try {
			p = daoProducto.readJPA(codigo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al buscar producto");
		}
		return p;
	}
}
