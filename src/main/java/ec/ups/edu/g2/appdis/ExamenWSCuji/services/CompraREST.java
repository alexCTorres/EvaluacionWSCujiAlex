package ec.ups.edu.g2.appdis.ExamenWSCuji.services;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Cliente;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Compra;
import ec.ups.edu.g2.appdis.ExamenWSCuji.modelo.Producto;
import ec.ups.edu.g2.appdis.ExamenWSCuji.negocio.GestionClienteON;
import ec.ups.edu.g2.appdis.ExamenWSCuji.negocio.GestionCompraON;
import ec.ups.edu.g2.appdis.ExamenWSCuji.negocio.GestionProductoON;

@Path("/compra")
public class CompraREST {
	
	@Inject
	private GestionClienteON clienteON;
	@Inject
	private GestionProductoON productoON;
	@Inject
	private GestionCompraON compraON;
	
	/*
	 * put -> crear recurso
	 * get -> consultar recurso
	 * post -> actualizar un recurso / llamar a una transaccion o procedimiento
	 * delete -> borrar un recurso
	 * 
	 * */
	

	@GET
	@Path("buscarProducto")
	@Produces("application/json")
	public Producto buscarProducto(@QueryParam("codigo") String codigo) throws Exception {
		Producto p = new Producto();
		try {
			p = productoON.buscarProducto(codigo);
			System.out.println("producto encontrada");
			return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al buscar producto ");
			return null;
		}

	}
	
	@POST
	@Path("/guardarCliente")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta guardarCliente(Cliente cliente) {
		Respuesta res = new Respuesta();
		try {
			clienteON.registrarCliente(cliente);
			res.setCodigo(1);
			res.setMensaje("CLiente registrado");
		} catch (Exception e) {
			res.setCodigo(-1);
			res.setMensaje("Error al registrar cliente");
		}
		return res;
	}
	
	@POST
	@Path("/guardarCompra")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta guardarCompra(Compra compra) {
		Respuesta res = new Respuesta();
		try {
			compraON.registrarCompra(compra);
			res.setCodigo(1);
			res.setMensaje("compra registrado");
		} catch (Exception e) {
			res.setCodigo(-1);
			res.setMensaje("Error al registrar compra");
		}
		return res;
	}

}
