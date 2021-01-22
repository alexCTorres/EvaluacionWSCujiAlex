package ec.ups.edu.g2.appdis.ExamenWSCuji.dao;

import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Compra;


@Stateless
public class CompraDAO {


	@Inject
	private EntityManager em;
	
	public boolean insertJPA(Compra compra) throws SQLException {
		em.persist(compra);
		return true;
	}
}
