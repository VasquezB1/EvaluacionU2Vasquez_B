package ec.edu.ups.EvaluacionU2Vasquez_B.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.EvaluacionU2Vasquez_B.business.LibrosON;
import ec.edu.ups.EvaluacionU2Vasquez_B.model.Libro;

@Named
@RequestScoped
public class LibroBean {

	private Libro lib = new Libro();
	
	private List<Libro> libros;
	
	@Inject
	private LibrosON librosON;
	
	
	@PostConstruct
	public void init() {
		libros = librosON.getLibros();
	}


	public Libro getLib() {
		return lib;
	}


	public void setLib(Libro lib) {
		this.lib = lib;
	}


	public List<Libro> getLibros() {
		return libros;
	}


	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public String cargarLibro() {
		
		int codigo = lib.getCodigo();
		Libro l = librosON.getLibro(codigo);
		//lib.s
		return null;
		
	}
	
	public String guardarLibro() {
		try {
			librosON.insertar(lib);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "lista-libro?faces-redirect=true";
	}
}