package ec.ups.edu.g2.appdis.ExamenWSCuji.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigoProducto")
	private String codigo;
	@Column(name = "nombreProducto")
	private String nombre;
	@Column(name = "existenciasProducto")
	private double existencias;
	@Column(name = "precioProducto")
	private double precio;
	

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getExistencias() {
		return existencias;
	}
	public void setExistencias(double existencias) {
		this.existencias = existencias;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
