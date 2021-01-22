package ec.ups.edu.g2.appdis.ExamenWSCuji.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idCliente")
	private String cedula;
	@Column(name = "nombresCliente")
	private String nombres;
	@Column(name = "apellidosCliente")
	private String apellidos;
	@Column(name = "correoCliente")
	private String correo;

	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
