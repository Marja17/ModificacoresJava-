package paquete2;

public class ClasePrivada {
//atributos 
	private String nombre;
	protected int edad;
	
	//m�todos
	public void setSaludar (String nombre) { //fijar o moficar un valor
		this.nombre = nombre;
		
	}
	
	public String getSaludar() {
	 return this.nombre ;
	 
	}
}
