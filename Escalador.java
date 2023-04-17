
public class Escalador extends Ciclista {

	private float aceleracionMedia;
	private float gradoRampa;


	public String ImprimirTipo() {
		// TODO Auto-generated method stub
		return " Es un Escalador";
	}

	//Getters&Setters
	public float getAceleracionMedia() {
		return aceleracionMedia;
	}


	public float getGradoRampa() {
		return gradoRampa;
	}


	public void setAceleracionMedia(float aceleracionMedia) {
		this.aceleracionMedia = aceleracionMedia;
	}


	public void setGradoRampa(float gradoRampa) {
		this.gradoRampa = gradoRampa;
	}


}
