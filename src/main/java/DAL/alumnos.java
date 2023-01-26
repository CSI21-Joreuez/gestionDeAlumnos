package DAL;

import javax.persistence.*;
@Entity
@Table(name="ga_alumnos",schema="dlk_gestionAlumnos")
public class alumnos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique= true, nullable=true)
	private int id;
	
	@Column(name="nombre", unique=false, nullable=false)
	private String nombre;
	
	@Column(name="telefono", unique=false, nullable=false)
	private String telefono;
	
	@OneToOne
	@Column(name="num_port", unique=false, nullable=true)
	private portatiles num_port;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
