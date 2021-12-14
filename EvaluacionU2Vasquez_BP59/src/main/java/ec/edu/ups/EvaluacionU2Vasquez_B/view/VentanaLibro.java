package ec.edu.ups.EvaluacionU2Vasquez_B.view;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.EvaluacionU2Vasquez_B.business.LibrosONRemote;

public class VentanaLibro {

	private LibrosONRemote libRemote;
	
	
	public void conectar() throws Exception{
		try {
			final Hashtable<String, Comparable> jndiProperties = new Hashtable<String, Comparable>();
			jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.wildfly.naming.client.WildFlyInitialContextFactory");
			jndiProperties.put("jboss.naming.client.ejb.context", true);

			jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			jndiProperties.put(Context.SECURITY_PRINCIPAL, "demop59");
			jndiProperties.put(Context.SECURITY_CREDENTIALS, "demop59");

			final Context context = new InitialContext(jndiProperties);

			final String lookupName = "ejb:/DemoApp/CalculadoraON!ec.edu.ups.pw59.DemoApp.business.CalculadoraONRemote";


		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
	
	
	public static void main(String[] args) {
		VentanaLibro vtnLib = new VentanaLibro();
		try {
			vtnLib.conectar();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
