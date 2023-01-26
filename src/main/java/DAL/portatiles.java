package DAL;

import javax.persistence.*;


@Entity
@Table(name="ga_alumnos",schema="dlk_gestionPortatil")
public class portatiles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique= true, nullable=true)
	private int id;
	
	@Column(name="marca", unique=false, nullable=false)
	private String marca;
	
	@Column(name="modelo", unique=false, nullable=false)
	private String modelo;
	
	@Column(name="alumno_id", unique=false, nullable=true)
	@OneToOne(mappedBy="id")
	private alumnos alumno_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public alumnos getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(alumnos alumno_id) {
		this.alumno_id = alumno_id;
	}
	
	
	
}
