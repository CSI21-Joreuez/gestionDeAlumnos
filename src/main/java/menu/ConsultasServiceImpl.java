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
			// TODO: handle exception
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

	public void darAltaPortatil(portatiles port) {
		// TODO Auto-generated method stub

	}

	public List<portatiles> listarPortatilconAlumno(int port) {
		// TODO Auto-generated method stub
		return null;
	}

	public void darBajaAlumno(alumnos alumn) {
		// TODO Auto-generated method stub

	}

}
