package TP2.tp2_e2;
import java.util.Scanner;

public class principal {
	public static void main(String [] args) {
		Scanner escaner = new Scanner(System.in);
		
		//ARMADO EL ARBOL
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoizq = new BinaryTree<Integer>(25);
		hijoizq.addLeftChild(new BinaryTree<Integer>(10));
		hijoizq.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoder = new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoizq);
		ab.addRightChild(hijoder);
		
		//RECORRIDO PREORDEN
			System.out.println("RECORRIDO PREORDEN");
			ab.preorden();
			System.out.println("------------------------------");
			
		//RECORRIDO POSTORDEN
			System.out.println("RECORRIDO POSTORDEN");
			ab.postorden();
			System.out.println("------------------------------");
			
		//RECORRIDO INORDEN
			System.out.println("RECORRIDO INORDEN");
			ab.inorden();
			System.out.println("------------------------------");
			
		//RECORRIDO POR NIVELES
			System.out.println("RECORRIDO POR NIVELES");
			ab.porniveles();
			System.out.println("------------------------------");
			
		//CONTARHOJAS
			int hojas = ab.contarhojas();
			System.out.println("CANTIDAD DE HOJAS: " + hojas);
			System.out.println("------------------------------");
		
		//ARBOL ESPEJO 
			BinaryTree<Integer> espejo = ab.espejo();
			System.out.println("RECORRIDO PREORDEN DEL ESPEJO");
			espejo.preorden();
			System.out.println("------------------------------");
		
		//ENTRE NIVELES
			System.out.println("INGRESE NUMERO MINIMO: ");
			int n = escaner.nextInt();
			System.out.println("INGRESE NUMERO MAXIMO: ");
			int m = escaner.nextInt();
			ab.tranversal(n, m);
	}
}
