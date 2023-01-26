package DAL.DTO;

import org.springframework.stereotype.Component;

import DAL.portatiles;

@Component
public class alumnos_portatilesDTO {

	private int id_alumno;
	
	private String nombre;

	private String telefono;

	private portatiles num_port;

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public portatiles getNum_port() {
		return num_port;
	}

	public void setNum_port(portatiles num_port) {
		this.num_port = num_port;
	}

	public alumnos_portatilesDTO(String nombre, String telefono, portatiles num_port) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.num_port = num_port;
	}
	
	

}
