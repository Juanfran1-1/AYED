package TP1.tp1_eje7;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
	
	public static boolean metodo7E(Estudiante e, ArrayList<Estudiante> list) {
		boolean encontrado = false;
		int i=0;
		while ((i < list.size()) && (!encontrado)){
			if (list.get(i).equals(e)) {
				encontrado= true;
			}
			i++;
		}
		return encontrado;
	}
	
	public static void metodo7D() {
		ArrayList <Estudiante> lista = new ArrayList<>();
		lista.add(new Estudiante("Valentin", "Capelli", "valentin@gmail.com", "TM", "Diagonal 77"));
		lista.add(new Estudiante("Fabio", "Torrejon", "torrejonfabio@gmail.com", "TM", "Pedro Hita 214"));
		lista.add(new Estudiante("Santiago", "Acuña", "santiacu@gmail.com", "TM", "Republica"));
		
		ArrayList <Estudiante> copia = new ArrayList<Estudiante> (lista);
		
		System.out.println("Lista original: ");
		for (Estudiante e : lista) {
			System.out.println(e.toString());
		}
		
		System.out.println("Lista copiada: ");
		for (Estudiante e : copia) {
			System.out.println(e.toString());
		}
		
		Estudiante mod = lista.get(0);
		mod.setNombre("Ezequiel");
		mod.setApellido("Weber");
		
		System.out.println("--------------------------");
		System.out.println("Imprimo luego de la modificacion de la lista original ");
		System.out.println("Lista original: ");
		for (Estudiante est : lista) {
			System.out.println(est.getApellido());
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Lista copiada: ");
		for(Estudiante est : copia) {
			System.out.println(est.getApellido());
		}
		
		Estudiante nuevo = new Estudiante("Juan","Uceda","juanucedac@gmail.com","TM","Calle 4");
		if (!metodo7E(nuevo,lista)) {
			lista.add(nuevo);
			System.out.println("AGREGADO A LA LISTA");
		}
		else {
			System.out.println("NO SE PUDO AGREGAR A LA LISTA");
		}
			
		System.out.println("--------------------------");
		System.out.println("Imprimo luego de la modificacion de la lista original ");
		System.out.println("Lista original: ");
		for (Estudiante est : lista) {
			System.out.println(est.getApellido());
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Lista copiada: ");
		for(Estudiante est : copia) {
			System.out.println(est.getApellido());
		}
	}
	
	
	public static boolean capicua(ArrayList <Integer> list) {
		int posant=0;
		int posult = list.size() - 1;
		boolean result = true;
		
		while ((posant < posult) && (result)) {
			if (list.get(posant).equals(list.get(posult))) {
				posant++;
				posult--;
			}else {
				result=false;
			}
		}
		return result;
		
	}
	
	
	public static void main(String [] args) {
		ArrayList <Integer> lista = new ArrayList<>();
		Scanner escaner = new Scanner(System.in);
		
		for (int i=0;i<5;i++) {
			System.out.println("INGRESE NUMERO");
			int a = escaner.nextInt();
			lista.add(a);
		}
		
		System.out.println("LA LISTA CONTIENE " + lista.size());
		
		for (int i=0;i<5;i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("                            ");
		
		if(capicua(lista)) {
			System.out.println("La lista es capicua");
		}
		else {
			System.out.println("No es capicua");
		}
		
		metodo7D();
	}
}
