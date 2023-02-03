package menu;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAL.alumnos;
import DAL.alumnosRepoImpl;
import DAL.portatiles;
import DAL.DTO.aDAOService;
import DAL.DTO.aDAOServiceImpl;
import DAL.DTO.aDTOServicio;
import DAL.DTO.aDTOServicioImpl;
import DAL.DTO.alumnos_portatilesDTO;

/**
 * @author JOD
 * Implementa la interfaz MenuService
 */

@Service
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
			
		Boolean resultadoInsert = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("[INFO] - Matriculacion Alumno");
		System.out.println();
		System.out.println("¿Nombre del Alumno?");
		String nombre = scan.next();
		System.out.println("¿Numero de telefono del Alumno?");
		String telefono = scan.next();
		System.out.println("[INFO] - Alta Portatil");
		System.out.println();
		System.out.println("¿Modelo?");
		String modelo = scan.next();
		System.out.println("¿Marca?");
		String marca = scan.next();
		System.out.println("¿id de Alumno?");
		int id_alumn = scan.nextInt();


		
		//Si tuvieramos que trabajar con los datos que se han introducido, se pasaría a DTO
		
		alumnos_portatilesDTO alumn = aDto.alumnoADTO(nombre, telefono, new portatiles(marca,modelo,id_alumn));
		

		//Una vez tenemos en el DTO los datos modificados y correctamente formateados se pasaría a DAO
		alumnos alm =  aDao.alumnoDTOaDAO(alumn);
		//Inserción del DAO en base de datos
		resultadoInsert = consultas.darAltaAlumno(alm);
		return resultadoInsert;
	}

	//Dar de Alta a un portatil
	public boolean darAltaPortatil(ConsultasService consultas) {
		
			
		Boolean resultadoAlta = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("[INFO] - Alta Portatil");
		System.out.println();
		System.out.println("¿Modelo?");
		String modelo = scan.next();
		System.out.println("¿Marca?");
		String marca = scan.next();
		System.out.println("[INFO] - Datos de Alumno");
		System.out.println();
		System.out.println("¿ID del Alumno?");
		int id_alumn = scan.nextInt();
		
		//Si tuvieramos que trabajar con los datos que se han introducido, se pasaría a DTO
		alumnos_portatilesDTO port = aDto.portatilADTO(marca, modelo ,id_alumn);
		
		//Una vez tenemos en el DTO los datos modificados y correctamente formateados se pasaría a DAO
				portatiles pt =  aDao.portatilDTOaDAO(port);
				//Inserción del DAO en base de datos
				resultadoAlta = consultas.darAltaPortatil(pt);
				return resultadoAlta;
	}

	public boolean darBajaAlumno(ConsultasService consultas) {
		try {
			Boolean resultadoborrado = false;
			System.out.println("[INFO] - Baja Alumno");
			Scanner scan = new Scanner(System.in);
			List<alumnos> listado = consultas.listadoAlumnos();
			for (alumnos al : listado) {
				System.out.println(al.getId_alumno()+") " +al.getNombre()+" "+al.getTelefono());
			}
			System.out.println("¿Numero del Alumno a Borrar?");
			int id = scan.nextInt();
			for (alumnos alumnos : listado) {
				if(id == alumnos.getId_alumno())
					 resultadoborrado = consultas.darBajaAlumno(alumnos);
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR] - Error al borrar el alumno: " + e);
		}
		return false;
	}

	public List<portatiles> listarPortatilconAlumno(ConsultasService consultas) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[INFO] - Lista Portatiles");
		System.out.println("Numero de Alumno a Buscar");
		Integer nump = scan.nextInt();
		List<portatiles>listap = consultas.listarPortatilconAlumno(nump);
		for (portatiles pt : listap) {
			System.out.println(pt.getId_portatil()+") "+pt.getMarca()+" "+ pt.getModelo()+" "+pt.getAlumno_id());
			
			}
		return listap;
	}
	public List<alumnos> listadoAlumnos(ConsultasService consultas) {

		List<alumnos> listado = consultas.listadoAlumnos();
		for (alumnos al : listado) {
			System.out.println(al.getId_alumno()+") " +al.getNombre()+" "+al.getTelefono()+" "+al.getNum_port().getId_portatil());
			
			}
		return listado;
	}

	public List<alumnos> listarAlumnoConPortatil(ConsultasService consultas) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[INFO] - Lista Alumnos");
		System.out.println("Numero de Portatil a Buscar");
		Integer nump = scan.nextInt();
		List<alumnos> listado = consultas.listarAlumnoConPortatil(nump);		
		for (alumnos alm : listado) {
			System.out.println(alm.getId_alumno()+") "+alm.getNombre()+" "+alm.getTelefono()+" "+alm.getNum_port().getId_portatil());
		}
		return null;
	}

}
