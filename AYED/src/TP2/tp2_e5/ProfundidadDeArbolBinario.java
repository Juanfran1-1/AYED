package TP2.tp2_e5;
import TP2.tp2_e2.BinaryTree;
public class ProfundidadDeArbolBinario {
	BinaryTree <Integer> ab;
	
	public ProfundidadDeArbolBinario(BinaryTree <Integer> ab) {
		this.ab=ab;
	}
	
	public int sumaElementosProfundidad (int p) {
		return sumarecursiva(ab,0,p);
	}
	
	private int sumarecursiva(BinaryTree<Integer> ab,int act,int nivel) {
		if (ab == null) {
			return 0;
		}
		if (act == nivel) {
			return ab.getData();
		}
		int hijoizq = 0;
		int hijoder= 0;
		if (ab.hasLeftChild()) {
			hijoizq = sumarecursiva(ab.getLeftChild(),act + 1,nivel);
		}
		if (ab.hasRightChild()) {
			hijoder = sumarecursiva(ab.getRightChild(),act + 1,nivel);
		}
		return (hijoizq + hijoder);
	}
	
	public static void main(String[] args) {
	    BinaryTree<Integer> ab = new BinaryTree<Integer>(1);
	    ab.addLeftChild(new BinaryTree<Integer>(2));
	    ab.addRightChild(new BinaryTree<Integer>(3));
	    ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(4));
	    ab.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
	    ab.getRightChild().addLeftChild(new BinaryTree<Integer>(6));
	    ab.getRightChild().addRightChild(new BinaryTree<Integer>(7));

	    ProfundidadDeArbolBinario prof = new ProfundidadDeArbolBinario(ab);
	    System.out.println("Suma en profundidad 0: " + prof.sumaElementosProfundidad(0)); // 1 = 1
	    System.out.println("Suma en profundidad 1: " + prof.sumaElementosProfundidad(1)); // 2 + 3 = 5
	    System.out.println("Suma en profundidad 2: " + prof.sumaElementosProfundidad(2)); // 4 + 5 + 6 + 7 = 22
	}
	
}
