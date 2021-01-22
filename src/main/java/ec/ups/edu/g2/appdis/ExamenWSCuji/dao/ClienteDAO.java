package ec.ups.edu.g2.appdis.ExamenWSCuji.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Cliente;

@Stateless
public class ClienteDAO {

	@Inject
	private EntityManager em;
	
	
	public boolean insertJPA(Cliente cliente) throws SQLException {
		em.persist(cliente);
		return true;
	}
	
	public Cliente readJPA(String cedula) throws SQLException {
		Cliente c = em.find(Cliente.class, cedula);
		return c;
	}
}
