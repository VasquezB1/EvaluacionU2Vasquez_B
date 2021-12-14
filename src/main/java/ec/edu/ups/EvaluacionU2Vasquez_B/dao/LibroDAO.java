package ec.edu.ups.EvaluacionU2Vasquez_B.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionU2Vasquez_B.model.Libro;



@Stateless
public class LibroDAO {
	
	@PersistenceContext
	private EntityManager em;
	
public void insert(Libro op) {
		
		em.persist(op);

	}

	public void upgrade(Libro op) {

		em.merge(op);

	}

	public Libro read(int id) {

		Libro op = em.find(Libro.class, id);
		return op;

	}

	public void delete(int id) {

		Libro op = em.find(Libro.class, id);
		em.remove(op);

	}
	
	public List<Libro> getList(){
		
		List<Libro> listado = new ArrayList<Libro>();
		
		//No se hace consulta a la base sino a la entidad.
		String jpql = "SELECT op FROM Libro op";
		Query query = em.createQuery(jpql,Libro.class);
		listado = query.getResultList();
		
		//JPQL
		//Alternativa para SQL
		
		
		return listado;
	}
	
}
