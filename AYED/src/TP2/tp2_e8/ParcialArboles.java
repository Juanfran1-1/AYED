package TP2.tp2_e8;
import TP2.tp2_e2.BinaryTree;
public class ParcialArboles {
	public boolean esPrefijo(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2) {
	    // si el primer árbol (ab1) es null
	    if (ab1 == null) return true;   // Si ab1 es null, siempre es un prefijo
	    
	    // Verificamos si el segundo árbol (ab2) es null
	    if (ab2 == null) return false;  // Si ab2 es null pero ab1 no lo es, no puede ser prefijo
	    
	    // Verificamos si los datos de las raíces de ambos árboles coinciden
	    if (!ab1.getData().equals(ab2.getData())) {
	        return false;  // Si los datos de las raíces no coinciden, no es prefijo
	    }

	    // Si los datos coinciden, verificamos recursivamente los subárboles izquierdo y derecho
	    // Comparar subárbol izquierdo de ab1 con el subárbol izquierdo de ab2
	    boolean izq = esPrefijo(ab1.getLeftChild(), ab2.getLeftChild());
	    
	    // Comparar subárbol derecho de ab1 con el subárbol derecho de ab2
	    boolean der = esPrefijo(ab1.getRightChild(), ab2.getRightChild());

	    // Si tanto el subárbol izquierdo como el derecho son prefijos, retornamos true
	    return izq && der;  // Si ambos subárboles coinciden, entonces ab1 es un prefijo de ab2
	}
	
	public static void main (String [] args) {
		BinaryTree <Integer> ArbolPre = new BinaryTree <Integer> (1);
		BinaryTree<Integer> n2 = new BinaryTree<Integer>(2);
	    BinaryTree<Integer> n3 = new BinaryTree<Integer>(6);

	    ArbolPre.addLeftChild(n2);
	    ArbolPre.addRightChild(n3);

	    // Árbol grande (ArbolGrande)
	    BinaryTree<Integer> ArbolGrande = new BinaryTree<Integer>(1);
	    BinaryTree<Integer> n2Grande = new BinaryTree<Integer>(2);
	    BinaryTree<Integer> n3Grande = new BinaryTree<Integer>(3);
	    BinaryTree<Integer> n4 = new BinaryTree<Integer>(4);
	    BinaryTree<Integer> n5 = new BinaryTree<Integer>(5);

	    ArbolGrande.addLeftChild(n2Grande);
	    ArbolGrande.addRightChild(n3Grande);
	    n2Grande.addLeftChild(n4);
	    n3Grande.addRightChild(n5);

	    // Creo el objeto de ParcialArboles
	    ParcialArboles parcial = new ParcialArboles();

	    // Pruebo si ArbolPre es prefijo de ArbolGrande
	    System.out.println(parcial.esPrefijo(ArbolPre, ArbolGrande)); // debería imprimir true
	}
}
