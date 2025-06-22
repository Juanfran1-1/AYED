package TP1.tp1_e3;

public abstract class Persona {
	private String Nombre;
	private String Apellido;
	private String Email;
	
	public Persona(String unNombre, String unApellido,String unEmail) {
		setNombre(unNombre);
		setApellido(unApellido);
		setEmail(unEmail);
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	
	public String getApellido() {
		return Apellido;
	}
	
	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	
	
	public String getEmail() {
		return Email;
	}
		
	public void setEmail(String Email) {
		this.Email = Email;
	}	
	
	public String toString() {
		String aux = "nombre " + getNombre() +
					 " apellido " + getApellido() +
					 " email " + getEmail();
		return aux;
	}		
}

