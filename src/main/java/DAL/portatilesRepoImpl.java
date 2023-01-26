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

	public List<portatiles> listarPortatilconAlumno(int port) {
		String jpql = "SELECT pt FROM portatilesRepo pt WHERE pt.id > ?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, port);
		return query.getResultList();
	}

}
