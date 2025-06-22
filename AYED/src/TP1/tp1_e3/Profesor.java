package TP1.tp1_e3;

public class Profesor extends Persona {
	private String Catedra;
	private String Facultad;
	
	public Profesor(String unNombre,String unApellido,String unEmail,String unaCatedra,String unaFacultad) {
		super(unNombre,unApellido,unEmail);
		setCatedra(unaCatedra);
		setFacultad(unaFacultad);
	}
	
	public String getCatedra() {
		return Catedra;
	}
	
	public void setCatedra(String Catedra) {
		this.Catedra = Catedra;
	}

	
	public String getFacultad() {
		return Facultad;
	}
	
	public void setFacultad(String Facultad) {
		this.Facultad = Facultad;
	}
	
	public String toString() {
		String aux = super.toString() + 
					 " facultad " + getFacultad() + 
					 " catedra " + getCatedra();
		return aux;
					 
	}	
}
