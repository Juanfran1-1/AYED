package TP1.tp1_e3;

public class principal {
	public static void main (String [] args) {
		Estudiante [] vectorE= new Estudiante [2];
		Profesor [] vectorP = new Profesor[3];
		
		Estudiante e1 = new Estudiante("Ezequiel","Weber","ezeweber2003@gmail.com","Python","calle 137");
		Estudiante e2 = new Estudiante("Juan","Uceda","juanucedac@gmail.com","Python","calle 4");	
		
		Profesor p1= new Profesor("a","b","c","d","e");
		Profesor p2= new Profesor("f","g","h","i","j");
		Profesor p3= new Profesor("k","l","m","n","o");
		
		vectorE[0] = e1;
		vectorE[1] = e2;

		vectorP[0] = p1;
		vectorP[1] = p2;
		vectorP[2] = p3;

		int i;
		System.out.println("Datos de los estudiantes:");
		for(i = 0; i < 2; i++) {
			System.out.println(vectorE[i].toString());
		}

		System.out.println("Datos de los profesores:");
		for(i = 0; i < 3; i++) {
			System.out.println(vectorP[i].toString());
		}
	}
}

