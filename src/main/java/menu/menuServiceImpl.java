package menu;

import java.util.List;
import java.util.Scanner;

import DAL.alumnos;
import DAL.portatiles;
import DAL.DTO.aDAOService;
import DAL.DTO.aDAOServiceImpl;
import DAL.DTO.aDTOServicio;
import DAL.DTO.aDTOServicioImpl;
import DAL.DTO.alumnos_portatilesDTO;

public class menuServiceImpl implements menuService {

	aDTOServicio aDto = new aDTOServicioImpl();
	aDAOService aDao = new aDAOServiceImpl()
			;
	public int mostrarMenu(Scanner entradaOpcion) {
		int opcion;
		System.out.println("#################");
		System.out.println("##### MENU ######");
		System.out.println("#################");
		System.out.println("1. Matrícula de alumno. ");
		System.out.println("2. Baja de un alumno.");
		System.out.println("3. Alta de portátil.");
		System.out.println("4. Consulta portátil asignado a un alumno");
		System.out.println("5. Consulta alumno asignado a un portátil");
		System.out.println("6. Ver todos los alumnos con su asignación de portátil.");
		System.out.println("0. Salir menu.");
		System.out.println("[INFO] - Escriba el numero de la opcion deseada: ");
        opcion = entradaOpcion.nextInt();
		return opcion;
	}

	public boolean darAltaAlumno(ConsultasService consultas) {
		try {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[INFO] - Matriculacion Alumno");
		System.out.println();
		System.out.println("¿Nombre del Alumno?");
		String nombre = scan.next();
		System.out.println("¿Numero de telefono del Alumno?");
		String telefono = scan.next();
		System.out.println("¿Numero del portatil asignado?");
		int numPort = scan.nextInt();
		
		//Si tuvieramos que trabajar con los datos que se han introducido, se pasaría a DTO
		alumnos_portatilesDTO alumn = aDto.alumnoADTO(nombre, telefono, numPort);
		

		//Una vez tenemos en el DTO los datos modificados y correctamente formateados se pasaría a DAO
		alumnos alumDAO = aDao.alumnoDTOaDAO(alumn);
		return true;
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al insertar nuevo alumno: " + e);
		}
		return false;
	}

	public boolean darAltaPortatil(ConsultasService consultas) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean darBajaAlumno(ConsultasService consultas) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<portatiles> listarPortatilconAlumno(int port) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<alumnos> listadoAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<alumnos> listarAlumnoConPortatil(int alumn) {
		// TODO Auto-generated method stub
		return null;
	}

}
