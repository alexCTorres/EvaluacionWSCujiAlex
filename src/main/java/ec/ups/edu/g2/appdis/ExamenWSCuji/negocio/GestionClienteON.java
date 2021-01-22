package ec.ups.edu.g2.appdis.ExamenWSCuji.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.ups.edu.g2.appdis.ExamenWSCuji.dao.ClienteDAO;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Cliente;

@Stateless
public class GestionClienteON {

	@Inject
	private ClienteDAO daoCliente;
	
	public boolean registrarCliente(Cliente cliente) throws Exception {
		try {
			daoCliente.insertJPA(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar cliente");
		}
		return true;
	}
	
	public Cliente buscarCliente(String cedula) throws Exception {
		Cliente c = new Cliente();
		try {
			c = daoCliente.readJPA(cedula);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al buscar cliente");
		}
		return c;
	}
}
