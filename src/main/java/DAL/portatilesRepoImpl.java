package DAL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

/**
 * @author JOD
 * Implementación de la interfaz PortatilesRepo 
 */

@Repository
public class portatilesRepoImpl implements portatilesRepo {

	@PersistenceContext
	private EntityManager em;
	
	public void darAltaPortatil(portatiles port) {
		em.persist(port);
	}

	@Override
	public List<portatiles> listarPortatilconAlumno(int port) {
		String jpql = "SELECT pt FROM portatiles pt WHERE pt.alumno_id > :port";
		Query query = em.createQuery(jpql);
		query.setParameter("port", port);
		return query.getResultList();
	}
	
	@Override
	public List<portatiles> listarPortatiles(){
		return em.createQuery("SELECT portatiles FROM portatiles portatiles").getResultList();
	}

}
