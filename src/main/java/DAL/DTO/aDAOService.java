package DAL.DTO;

import DAL.alumnos;
import DAL.portatiles;

/**
 * @author JOD
 * aDAOService: Interfaz con los metodos que pasan de DTO a DAO.
 */
public interface aDAOService {
	
	
	/**
	 * Paso de DTO alumno a DAO alumnos
	 * @param alumnos_portatilesDTO dto de alumno DTO
	 * @return
	 */
	public alumnos alumnoDTOaDAO(alumnos_portatilesDTO alumnDTO);
	
	
	/**
	 * Paso de DTO portatil a DAO portatiles
	 * @param alumnos_portatilesDTO dto de portatil DTO
	 * @return
	 */
	public portatiles portatilDTOaDAO(alumnos_portatilesDTO portatilDTO);

}
