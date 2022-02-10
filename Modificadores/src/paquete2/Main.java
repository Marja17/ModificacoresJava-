package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

public class Main extends ClaseProtected {
public static void main (String [] args) {
	ClaseDefault prueba = new ClaseDefault ();
	
	//prueba. mostrar ();
	
	ClasePrivada privada = new ClasePrivada ();
	
	//privada.edad = 30;
	//privada.nombre = "Juan";
	privada.setSaludar("Juan");
	
	System.out.println(privada.getSaludar());
	//System.out.println (privada.nombre);
	
	
	//Objeto de la clase Main
	Main protegido = new Main();
	
	protegido.setEdad(18);
	System.out.println(protegido.getEdad());
	
}
}
