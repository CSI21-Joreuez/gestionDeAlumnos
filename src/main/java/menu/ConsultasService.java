package menu;

import java.util.List;

import DAL.alumnos;
import DAL.alumnosRepo;
import DAL.portatiles;

/**
 * @author JOD
 * Consultas: Interfaz que define los métodos específicos de consulta sobre base de datos.
 */
public interface ConsultasService {

	/**
	 * darAltaAlumno: Inserta en base de datos un nuevo Alumno
	 * @param nuevo alumno
	 */
	public boolean darAltaAlumno(alumnos alumn);
	
	/**
	 * listadoAlumnos: lista los alumnos
	 * @return lista los alumnos
	 */
	List<alumnos> listadoAlumnos();
	
	/**
	 * listarAlumnoConPortatil: lista los alumnos
	 * @param int alumno id
	 * @return lista de alumnos con un portatil especifico
	 */
	
	public List<alumnos> listarAlumnoConPortatil(int alumn);
	
	
	/**
	 * darAltaPortatil: dar alta a un portatil
	 * @param nuevo portatil
	 */
	
	public boolean darAltaPortatil(portatiles port);

	/**
	 * listarPortatilconAlumno: lista de los portatiles con alumnos especifico
	 * @param int portatil id
	 * @return lista de portatiles con un alumno especifico
	 */
	
	public List<portatiles> listarPortatilconAlumno(int port);
	/**
	 * darAltaAlumno: Borra alumno de la base de datos
	 * @param alumno
	 */
	
	public boolean darBajaAlumno(alumnos alumn);


}
