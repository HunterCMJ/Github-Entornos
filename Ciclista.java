
public abstract class Ciclista {

	private int identificador;
	private String nombre;
	private int tiempoAcumuladoCarrera=0;
	
	//constructor
	public Ciclista() {
		
	}
	//metodos abstractos
	public abstract String ImprimirTipo();
	

	//Getter&Setters
	public int getIdentificador() {
		return identificador;
	}
	public int getTiempoAcumuladoCarrera() {
		return tiempoAcumuladoCarrera;
	}

	public String getNombre() {
		return nombre;
	}

}
