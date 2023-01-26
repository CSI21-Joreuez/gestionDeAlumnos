package DAL;

import java.util.List;

public interface portatilesRepo {

	/**
	 * darAltaPortatil: dar de alta a un portatil 
	 */
	public void darAltaPortatil(portatiles port);
	/**
	 * listarPortatilconAlumno: listar los portatiles con cada alumno 
	 * @return listar  portatiles de todos los alumnos 
	 */
	public List<portatiles> listarPortatilconAlumno(int port);
}
