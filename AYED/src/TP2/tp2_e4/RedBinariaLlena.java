package TP2.tp2_e4;
import TP2.tp2_e2.BinaryTree;
public class RedBinariaLlena {
	BinaryTree<Integer> ab ;
	
	public RedBinariaLlena(BinaryTree<Integer> ab) {
		this.ab=ab;
	}
	
	public int retardoReenvio() {
		return retardo(ab);
	}
	
	public int retardo(BinaryTree<Integer> ab) {
		int izq=0;
		int der=0;
		if (ab.isEmpty()) {
			return 0;
		}else if (ab.isLeaf()) {
			return ab.getData();
		} else {
			if (ab.hasLeftChild()) {
				izq = retardo(ab.getLeftChild());
			}
			if (ab.hasRightChild()) {
				der= retardo(ab.getRightChild());
			}
			if (izq > der) {
				return ab.getData() + izq;
			}else {
				return ab.getData() + der;
			}
		}			
	}
	
	public static void  main (String [] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer> (40);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new BinaryTree<Integer>(35));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		
		RedBinariaLlena red = new RedBinariaLlena(ab);
		System.out.println(red.retardoReenvio());
	}
}
