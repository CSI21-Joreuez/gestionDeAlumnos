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
		//String jpql2 = "SELECT a.id_alumno, a.nombre, a.telefono, pt.id_portatil FROM portatiles pt, alumnos a WHERE pt.id_portatil =?1";
		//Query query2 = em.createQuery(jpql2);
		String jpql = "SELECT pt FROM portatiles pt WHERE pt.id_portatil = ?1";
		Query query = em.createQuery(jpql);
		//query2.setParameter(1, alumn);
		query.setParameter(1, alumn);
		query.getResultList();
		portatiles pt = (portatiles) query.getSingleResult();
		String alm = "SELECT a FROM alumnos a WHERE a.num_port = ?1";
		Query quer = em.createQuery(alm);
		quer.setParameter(1, pt);
		return quer.getResultList();
	}

}
