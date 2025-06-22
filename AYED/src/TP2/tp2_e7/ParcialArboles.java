package TP2.tp2_e7;
import TP2.tp2_e2.BinaryTree;

public class ParcialArboles {
	BinaryTree <Integer> ab;
	
	public ParcialArboles(BinaryTree <Integer> ab) {
		this.ab=ab;
	}
	
	public boolean isLeftTree(int num) {
		boolean condicion = false;
		if (ab != null) {
			BinaryTree <Integer> sub = buscarArbolNum(ab,num);
			if (sub != null) condicion = procesarsub(sub);
		}
		return condicion;
	}
	
	public BinaryTree<Integer> buscarArbolNum(BinaryTree<Integer> ab,int num){
		if (ab.getData() == num) return ab;
		BinaryTree <Integer> ArbolNuevo = null;
		if (ab.hasLeftChild()) {
			ArbolNuevo=buscarArbolNum(ab.getLeftChild(),num);
		}
		if (ab.hasRightChild() && ArbolNuevo == null) {
			ArbolNuevo=buscarArbolNum(ab.getRightChild(),num);
		}
		return ArbolNuevo;
	}
	
	public boolean procesarsub(BinaryTree <Integer> sub) {
		int ci,cd;
		if (sub.hasLeftChild()) {
			ci= canthijos(sub.getLeftChild());
		} else ci = -1;
		
		if (sub.hasRightChild()) {
			cd= canthijos(sub.getRightChild());
		} else cd = -1;
		
		return ci > cd;
	}
	
	public int canthijos(BinaryTree<Integer> sub) {
		int cant = 0;
		if (sub.hasLeftChild()) cant += canthijos(sub.getLeftChild());
		if (sub.hasRightChild()) cant += canthijos(sub.getRightChild());
		
		if ((!sub.hasLeftChild() && sub.hasRightChild()) || (sub.hasLeftChild() && !sub.hasRightChild())) {
			cant++;
		}
		return cant;
		
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(1);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(4);
		BinaryTree<Integer> hijoDerecho = new BinaryTree<Integer>(7);
		BinaryTree<Integer> TreintaDos = new BinaryTree<Integer>(10);
		
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(2));
		hijoIzquierdo.addRightChild(TreintaDos);
		TreintaDos.addRightChild(new BinaryTree <Integer>(9));
		
		hijoDerecho.addLeftChild(new BinaryTree<Integer>(8));
		hijoDerecho.addRightChild(new BinaryTree<Integer>(12));
		
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		ParcialArboles arbol = new ParcialArboles(ab);
		
		BinaryTree<Integer> nuevoArbol = arbol.buscarArbolNum(ab, 10);
		
		nuevoArbol.porniveles();
		
		System.out.println("----------------------");
		
		System.out.println(arbol.isLeftTree(7));
	}
}
