package DAL.DTO;
import DAL.*;
/**
 * @author JOD
 * aDTOServicio: Interfaz con los metodos que pasan de DAO a DTO.
 */
public interface aDTOServicio {

	
	/**
	 * Convierte la información insertada en alomnos_portilesDTO
	 * @param nombre de Alumno
	 * @param telefono del Alumno
	 * @param objeto portatil
	 * @return
	 */
	public alumnos_portatilesDTO  alumnoADTO(String nombre, String telefono, int num_port);
	
	
	/**
	 * Convierte la información insertada en alomnos_portilesDTO
	 * @param marca del portatil
	 * @param modelo del portatil
	 * @param objeto alumno
	 * @return
	 */
	public alumnos_portatilesDTO  portatilADTO(String marca, String modelo, int alumno_id);
	
}
