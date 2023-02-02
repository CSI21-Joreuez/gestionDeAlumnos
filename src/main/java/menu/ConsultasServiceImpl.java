package menu;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAL.*;

/**
 * @author JOD
 * ConsultasServiceImpl: Implementa la interfaz ConsultasService
 */
@Service
public class ConsultasServiceImpl implements ConsultasService {

	
	@Autowired
	private alumnosRepo psi;
	
	@Autowired
	private portatilesRepo psi2;
	
	
	
	@Transactional
	public boolean darAltaAlumno(alumnos alumn) {
		try {
			System.out.println("[ENTRANDO] - Entrando Dar de Alta Alumno");
			psi.darAltaAlumno(alumn);
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al insertar nuevo alumno: " + e);
			return false;
		}
		return true;
	}
	
	@Transactional
	public List<alumnos> listadoAlumnos() {
		try {
			List<alumnos> listaAlumn = psi.listadoAlumnos();
			return listaAlumn;
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al mostrar el listado de alumnos: " + e);
			return null;
		}

	}

	@Transactional
	public List<alumnos> listarAlumnoConPortatil(int alumn) {

		try {
			List<alumnos> listaAlumn = psi.listarAlumnoConPortatil(alumn);
			return listaAlumn;
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al mostrar el listado de alumnos segun el id del portatil: " + e);
			return null;
		}
		
	}

	@Transactional
	public boolean darAltaPortatil(portatiles port) {
		try {
			System.out.println("[ENTRANDO] - Entrando Dar de Alta Portatil");
			psi2.darAltaPortatil(port);

		} catch (Exception e) {
			System.out.println("[ERROR] - Error al añadir el portatil: " + e);
			return false;

		}
		return true;

	}

	@Transactional
	public List<portatiles> listarPortatilconAlumno(int port) {
		try {
			List<portatiles> listaPortatiles = psi2.listarPortatilconAlumno(port);
			return listaPortatiles;
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al mostrar el listado de portatiles segun el id del alumno: " + e);
			return null;

		}
	}

	@Transactional
	public boolean darBajaAlumno(alumnos alumn) {
		try {
			System.out.println("[ENTRANDO] - Entrando Dar de Baja Alumno");
			psi.darBajaAlumno(alumn);
			return true;
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al dar de baja el alumno " + e);
			return false;
		}
	}
	@Transactional
	public List<portatiles> listarPortatiles(){
		try {
			List<portatiles> listport = psi2.listarPortatiles();
			return listport;
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al mostrar el listado de alumnos: " + e);
			return null;
		}
	}

}
