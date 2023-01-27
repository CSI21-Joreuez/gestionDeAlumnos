package DAL;

import javax.persistence.*;


@Entity
@Table(name="ga_portatiles",schema="dlk_gestionPortatil")
public class portatiles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_portatil", unique= true, nullable=true)
	private int id_portatil;
	
	@Column(name="marca", unique=false, nullable=false)
	private String marca;
	
	@Column(name="modelo", unique=false, nullable=false)
	private String modelo;
	
	@OneToOne(mappedBy="num_port")
	private alumnos alumno_id;

	

	public alumnos getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(alumnos alumno_id) {
		this.alumno_id = alumno_id;
	}



	public String getMarca() {
		return marca;
	}

	public int getId_portatil() {
		return id_portatil;
	}

	public void setId_portatil(int id_portatil) {
		this.id_portatil = id_portatil;
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

	
	
	
}
