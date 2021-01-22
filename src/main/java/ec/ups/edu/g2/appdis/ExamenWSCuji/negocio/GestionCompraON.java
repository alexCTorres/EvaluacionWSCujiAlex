package ec.ups.edu.g2.appdis.ExamenWSCuji.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.ups.edu.g2.appdis.ExamenWSCuji.dao.CompraDAO;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Compra;

@Stateless
public class GestionCompraON {

	@Inject
	private CompraDAO daoCompra;
	
	public boolean registrarCompra(Compra compra) throws Exception {
		try {
			daoCompra.insertJPA(compra);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar compra");
		}
		return true;
	}
}
