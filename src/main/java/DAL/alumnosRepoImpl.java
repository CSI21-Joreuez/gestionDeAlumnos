package DAL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;



/**
 * @author JOD
 * Implementación de la interfaz alumnosRepo 
 */
@Repository
public class alumnosRepoImpl implements alumnosRepo {

	@PersistenceContext
	private EntityManager em;
	
	public List<alumnos> listadoAlumnos() {
		return em.createQuery("SELECT alumnos FROM alumnos alumnos").getResultList();
	}

	public void darBajaAlumno(alumnos alumn) {
		em.remove(em.contains(alumn)? alumn: em.merge(alumn));

	}

	public void darAltaAlumno(alumnos alumn) {
		em.persist(alumn);
	}

	public List<alumnos> listarAlumnoConPortatil(int alumn) {
		String jpql = "SELECT pt FROM alumnos pt WHERE pt.num_port > ?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, alumn);
		return query.getResultList();
	}

}
