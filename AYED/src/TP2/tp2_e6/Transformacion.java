package TP2.tp2_e6;
import TP2.tp2_e2.BinaryTree;


public class Transformacion {
	BinaryTree <Integer> ab;
	
	public Transformacion(BinaryTree <Integer> ab) {
		this.ab = ab;
	}
	
	public BinaryTree <Integer> sumador(){
		sumatoriadenodos(this.ab);
		return this.ab;
	}
	
	private int sumatoriadenodos(BinaryTree<Integer> ab ) {
		if (ab == null) {
			return 0;
		}
		
		int valororiginal = ab.getData();
		
		int valorizq = ab.hasLeftChild() ? sumatoriadenodos(ab.getLeftChild()) : 0;
		
		int valorder = ab.hasRightChild() ? sumatoriadenodos(ab.getRightChild()) : 0;
		ab.setData(valorizq + valorder);
		
		return valororiginal + valorizq + valorder ;
		
		
	}
	
	public static void main(String[] args) {
        BinaryTree<Integer> ab = new BinaryTree<>(1);
        ab.addLeftChild(new BinaryTree<>(2));
        ab.addRightChild(new BinaryTree<>(3));
        ab.getLeftChild().addLeftChild(new BinaryTree<>(4));
        ab.getLeftChild().addRightChild(new BinaryTree<>(5));
        ab.getRightChild().addLeftChild(new BinaryTree<>(6));
        ab.getRightChild().addRightChild(new BinaryTree<>(7));

        System.out.println("Árbol original:");
        ab.porniveles();

        // Transformacion del árbol
        Transformacion t = new Transformacion(ab);
        BinaryTree<Integer> nuevoArbol = t.sumador();

        System.out.println("\nÁrbol transformado:");
        nuevoArbol.porniveles();
        
        
        
    }
}
	

