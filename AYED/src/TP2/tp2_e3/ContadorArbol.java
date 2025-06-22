package TP2.tp2_e3;
import java.util.*;
import TP2.tp2_e2.BinaryTree;
public class ContadorArbol {
	BinaryTree<Integer> ab ;
	
	public ContadorArbol(BinaryTree<Integer> ab) {
		this.ab=ab;
	}
	
	public ArrayList<Integer> listaparesA() {
		ArrayList <Integer> listaA= new ArrayList<Integer>();
		this.inOrden(ab,listaA);
		return listaA;
	}
	
	private void inOrden(BinaryTree<Integer> ab , ArrayList <Integer> listaA) {
		if (ab.hasLeftChild()) {
			this.inOrden(ab.getLeftChild(), listaA);
		}
		if (ab.getData() % 2 == 0) {
			listaA.add(ab.getData());
		}	
		if (ab.hasRightChild()) {
			this.inOrden(ab.getRightChild(), listaA);
		}
	}
	
	public ArrayList<Integer> listaparesB(){
		ArrayList<Integer> listaB = new ArrayList<Integer>();
		this.postOrden(ab,listaB);
		return listaB;
	}
	
	private void postOrden(BinaryTree<Integer> ab,ArrayList <Integer> listaB) {
		if (ab.hasLeftChild()) {
			this.postOrden(ab.getLeftChild(),listaB);
		}
		if (ab.hasRightChild()) {
			this.postOrden(ab.getRightChild(), listaB);
		}
		if (ab.getData() % 2 == 0) {
			listaB.add(ab.getData());
		}
	}
	
	
	public static void main(String [] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer> (40);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new BinaryTree<Integer>(35));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		
		ContadorArbol contador = new ContadorArbol(ab);
		
		ArrayList<Integer> listaA = contador.listaparesA();
		
		System.out.println("LISTA PARES EN INORDEN");
		for (int i : listaA) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		
		ArrayList<Integer> listaB = contador.listaparesB();
		
		System.out.println("LISTA PARES EN POSTORDEN");
		for (int i : listaB) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		
	}
}
