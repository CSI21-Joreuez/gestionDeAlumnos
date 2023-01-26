package controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author JOD
 * Menu: Controlador de interacción con la aplicación.
 */

@Controller
public class Menu {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Contexto
				ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
				ConsultasService consulta = (ConsultasService) context.getBean(ConsultasService.class);
	}

}
