package TP2.tp2_e9;
import TP2.tp2_e2.BinaryTree;
public class ParcialArboles {

	// Método principal que se solicita
    public BinaryTree<DATA> sumAndDif(BinaryTree<Integer> arbol) {
        return construirArbol(arbol, 0, 0);
    }
    
    public BinaryTree<DATA> construirArbol(BinaryTree<Integer> ab,int sumaAcu,int valorPadre){
    	if (ab.isEmpty() || ab.getData() == null) return null;
    	
    	int valorAct = ab.getData();
    	int sumaNueva = sumaAcu + valorAct;
    	int diferencia = valorAct - valorPadre;
    	
    	DATA nuevadata = new DATA(sumaNueva,diferencia);
    	BinaryTree <DATA> arbolNuevo = new BinaryTree<> (nuevadata);
    	
    	if (ab.hasLeftChild()) {
    		arbolNuevo.addLeftChild(construirArbol(ab.getLeftChild(),sumaNueva,valorAct));
    	}
    	
    	if (ab.hasRightChild()) {
    		arbolNuevo.addRightChild(construirArbol(ab.getRightChild(),sumaNueva,valorAct));
    	}
    	
    	return arbolNuevo;
    }
	
    public static void main (String [] args) {
    	BinaryTree<Integer> arbol = new BinaryTree<>(10);
    	arbol.addLeftChild(new BinaryTree<>(4));
    	arbol.addRightChild(new BinaryTree<>(15));
    	arbol.getLeftChild().addLeftChild(new BinaryTree<>(2));
    	arbol.getLeftChild().addRightChild(new BinaryTree<>(5));

    	ParcialArboles pa = new ParcialArboles();
    	BinaryTree<DATA> nuevo = pa.sumAndDif(arbol);
    	nuevo.porniveles();  // Debería imprimir los nodos con suma y diferencia
    }
}
