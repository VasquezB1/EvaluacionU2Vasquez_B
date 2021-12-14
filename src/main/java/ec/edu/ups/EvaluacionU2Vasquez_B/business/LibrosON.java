package ec.edu.ups.EvaluacionU2Vasquez_B.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionU2Vasquez_B.dao.LibroDAO;
import ec.edu.ups.EvaluacionU2Vasquez_B.model.Libro;

@Stateless
public class LibrosON {

	@Inject
	private LibroDAO libroDAO;
	public void insertar(Libro p) throws Exception{
		libroDAO.insert(p);

	}
	
	public List<Libro> getLibros(){
		return libroDAO.getList();
	}
	
}
