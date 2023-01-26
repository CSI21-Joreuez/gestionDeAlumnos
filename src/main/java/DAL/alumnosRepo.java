package DAL;

import java.util.List;

public interface alumnosRepo {

	/**
	 * listadoAlumnos: lista los alumnos 
	 * @return lista de todos los alumnos 
	 */
	public List<alumnos> listadoAlumnos(); 
	
	/**
	 * darBajaAlumno: dar de baja a algun alumno concreto 
	 */
	public void darBajaAlumno(alumnos alumn);
	
	/**
	 * darAltaAlumno: dar de alta a un alumnos concreto
	 */
	public void darAltaAlumno (alumnos alumn);
	
	/**
	 * listarAlumnoConPortatil: lista los alumnos con su respectivo portatil
	 * @return lista de alumnos con su portatil
	 */
	public List<alumnos> listarAlumnoConPortatil(int alumn);
}
