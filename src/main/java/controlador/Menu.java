package controlador;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import menu.ConsultasService;
import menu.menuService;
import menu.menuServiceImpl;

/**
 * @author JOD
 * Menu: Controlador de interacción con la aplicación.
 */

@Controller
public class Menu {

	
	public static void main(String[] args) {

		//Contexto
				ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); 
				ConsultasService consulta = (ConsultasService) context.getBean(ConsultasService.class);
				
		//Inicializamos las Variables
		menuService menu = new menuServiceImpl();
		Scanner opcion = new Scanner(System.in);
		Boolean cerrarMenu = false;
		int opcion2;
		while(!cerrarMenu) {			
			
			//Mostramos el menú
			System.out.println();
			opcion2 = menu.mostrarMenu(opcion);			
			switch (opcion2) {			
				case 0:
					cerrarMenu = true;
					System.out.println("[INFO] - Menu cerrada" + opcion);
					break;
				case 1:
					menu.darAltaAlumno(consulta);
					break;
				case 2:
					menu.darBajaAlumno(consulta);
					break;
				case 3:
					menu.darAltaPortatil(consulta);

					break;
				case 4:
					menu.listarPortatilconAlumno(consulta);
					break;
				case 5:
					menu.listarAlumnoConPortatil(consulta);
					break;
				case 6:
					menu.listadoAlumnos(consulta);
					break;
				default:
					opcion2 = menu.mostrarMenu(opcion);	
			}

		}
	}

}
