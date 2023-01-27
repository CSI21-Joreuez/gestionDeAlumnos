package DAL.DTO;


/**
 * @author JOD
 * Implementación de la interfaz aDAOService
 */
public class aDAOServiceImpl implements aDAOService {

	public alumnos_portatilesDTO alumnoDTOaDAO(alumnos_portatilesDTO alumnDTO) {
		
		alumnos_portatilesDTO alumn = new alumnos_portatilesDTO();
		if(alumnDTO != null)
		{
			alumn.setNombre(alumnDTO.getNombre());
			alumn.setTelefono(alumnDTO.getTelefono());
			alumn.setNum_port(alumnDTO.getNum_port());

		}
		return alumn;
	}

	public alumnos_portatilesDTO portatilDTOaDAO(alumnos_portatilesDTO portatilDTO) {
		alumnos_portatilesDTO port = new alumnos_portatilesDTO();
		if(portatilDTO != null)
		{
			port.setMarca(portatilDTO.getMarca());
			port.setModelo(portatilDTO.getModelo());
			port.setAlumno_id(portatilDTO.getAlumno_id());

		}
		return port;
	}

}
