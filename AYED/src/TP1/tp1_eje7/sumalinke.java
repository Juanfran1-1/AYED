package TP1.tp1_eje7;

import java.util.LinkedList;

public class sumalinke {
	
	public int sumarLinkedList(LinkedList<Integer> lista) {
		int suma;
		suma = sumar(lista, 0);
		return suma;
	}
	
	private int sumar(LinkedList<Integer> lista, int indice) {
		int suma = 0;
		if(indice == lista.size()-1) {
			return suma + lista.get(indice);
		}else {
			suma = lista.get(indice) + sumar(lista, indice + 1);
		}
		return suma;
	}
	
	public static void main (String[] args) {
		sumalinke suma = new sumalinke();
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(42);
		lista.add(53);
		lista.add(6);
		int resultado = suma.sumarLinkedList(lista);
		System.out.println("La suma de todos los elementos de la lista es: " + resultado);
	}
}

