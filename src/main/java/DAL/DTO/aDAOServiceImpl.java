package DAL.DTO;

import DAL.alumnos;
import DAL.portatiles;

/**
 * @author JOD
 * Implementación de la interfaz aDAOService
 */
public class aDAOServiceImpl implements aDAOService {

	public alumnos alumnoDTOaDAO(alumnos_portatilesDTO alumnDTO) {
		
		alumnos alumn = new alumnos();
		if(alumnDTO != null)
		{
			alumn.setNombre(alumnDTO.getNombre());
			alumn.setTelefono(alumnDTO.getTelefono());
			alumn.setNum_port(alumnDTO.getNum_port());

		}
		return alumn;
	}

	public portatiles portatilDTOaDAO(alumnos_portatilesDTO portatilDTO) {
		portatiles port = new portatiles();
		if(portatilDTO != null)
		{
			port.setMarca(portatilDTO.getMarca());
			port.setModelo(portatilDTO.getModelo());
			port.setAlumno_id(portatilDTO.getAlumno_id());

		}
		return port;
	}

}
