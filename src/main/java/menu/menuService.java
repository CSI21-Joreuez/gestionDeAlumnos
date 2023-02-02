package menu;

import java.util.List;
import java.util.Scanner;

import DAL.alumnos;
import DAL.portatiles;


/**
 * @author JOD
 * menuService: Interfaz que define las acciones del menú.
 */
 
public interface menuService {

	/**
	 * mostrarMenu: método que muestra en consola las acciones posibles y recoge la opción
	 * seleccionada por el usuario.
	 * @return opción elegida por el usuario
	 */
	
	public int mostrarMenu(Scanner entradaOpcion);
	
	
	/**
	 * darAltaAlumno: método que da de alta al alumno
	 * 
	 * @return true o false
	 */
	
	public boolean darAltaAlumno(ConsultasService consultas);
	
	/**
	 * darAltaPortatil: método que da de alta a un portatil
	 * 
	 * @return true o false
	 */
	
	public boolean darAltaPortatil(ConsultasService consultas);
	
	/**
	 * darBajaAlumno: método que da de baja a un alumno
	 * 
	 * @return true o false
	 */
	
	public boolean darBajaAlumno(ConsultasService consultas);
	
	
	/**
	 * listarPortatilconAlumno: lista de los portatiles con alumnos especifico
	 * @param int portatil id
	 * @return lista de portatiles con un alumno especifico
	 */
	public List<portatiles> listarPortatilconAlumno(ConsultasService consultas);
	
	/**
	 * listadoAlumnos: lista de alumnos
	 * @return lista de alumnos
	 */
	public List<alumnos> listadoAlumnos(ConsultasService consultas);
	/*
	 * listarAlumnoConPortatil: lista de los alumnos con portatiles especifico
	 * @param int alumno id
	 * @return lista de alumnos con un portatil
	 */
	public List<alumnos> listarAlumnoConPortatil(ConsultasService consultas);
	
}
