package ec.edu.ups.EvaluacionU2Vasquez_B.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionU2Vasquez_B.dao.LibroDAO;
import ec.edu.ups.EvaluacionU2Vasquez_B.model.Libro;

@Stateless
public class LibrosON implements LibrosONRemote {

	@Inject
	private LibroDAO libroDAO;
	public void insertar(Libro p) throws Exception{
		Libro l = libroDAO.read(p.getCodigo());
		if(l == null) {
			libroDAO.insert(p);
		}else {
			libroDAO.upgrade(p);
		}

	}
	
	public List<Libro> getLibros(){
		return libroDAO.getList();
	}
	
	public Libro getLibro(int codigo) {
		Libro l = libroDAO.read(codigo);
		return l;
	}
}
