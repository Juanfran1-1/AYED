package TP1.tp1_e3;

public class Estudiante extends Persona{
	private String comision;
	private String direccion;
	
	public Estudiante(String unNombre, String unApellido, String unEmail, String unaComision, String unaDireccion) {
		super(unNombre, unApellido, unEmail);
		setComision(unaComision);
		setDireccion(unaDireccion);
	}

	
	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String tusDatos() {
		String aux = super.toString() + " comision " + getComision()
			  + " direccion " + getDireccion();
		return aux;
	}

}
