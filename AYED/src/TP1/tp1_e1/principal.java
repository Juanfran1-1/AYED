package TP1.tp1_e1;

import java.util.Scanner;

public class principal {
	public static void main (String [] args) {
		int A;
		int B;
		Scanner escaner = new Scanner(System.in) ;
		
		System.out.print("Ingrese numero a: ");
		A = escaner.nextInt();
		System.out.print("Ingrese numero b: ");
		B = escaner.nextInt();
		
		System.out.print("\n---METODO FOR --- \n");
		metodos.metodofor(A,B);
		System.out.print("\n--- METODO WHILE ---\n");
		metodos.metodowhile(A,B);
		System.out.print("\n--- METODO SIN ITERACION ---\n");
		metodos.metodoifs(A,B);
		escaner.close();
	}
}
