package ec.ups.edu.g2.appdis.ExamenWSCuji.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Producto;

@Stateless
public class ProductoDAO {

	@Inject
	private EntityManager em;
	
	public Producto readJPA(String codigo) throws SQLException {
		Producto p = em.find(Producto.class, codigo);
		return p;
	}
}
