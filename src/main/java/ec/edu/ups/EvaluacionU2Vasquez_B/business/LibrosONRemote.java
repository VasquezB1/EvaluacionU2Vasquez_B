package ec.edu.ups.EvaluacionU2Vasquez_B.business;

import java.util.List;

import javax.ejb.Remote;
import ec.edu.ups.EvaluacionU2Vasquez_B.model.Libro;

@Remote
public interface LibrosONRemote {

	public void insertar(Libro p) throws Exception;
	
	
	public List<Libro> getLibros();
}
