package DAL;

import javax.persistence.*;
@Entity
@Table(name="ga_alumnos",schema="dlk_gestionAlumnos")
public class alumnos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_alumno", unique= true, nullable=true)
	private int id_alumno;
	
	@Column(name="nombre", unique=false, nullable=false)
	private String nombre;
	
	@Column(name="telefono", unique=false, nullable=false)
	private String telefono;
	
	@OneToOne
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
	
	
}
