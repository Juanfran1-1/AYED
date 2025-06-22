package TP2.tp2_e1;

public class BinaryTree <T> {
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;
	
	//CONSTRUCTORES 
	
	public BinaryTree() {
		super();
	}
	
	public BinaryTree(T data) {
		this.data = data;
	}
	
	
	//METODDOS 
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	
	//PREGUNTAR ANTES DE INVOCAR hasLeftChild() o hasRightChild()
	
	public BinaryTree<T> getLeftChild() {
		 return leftChild;
	}
	
	public BinaryTree<T> getRightChild() {
		 return rightChild;
	}
	
	//AGREGA HIJOS
	public void addLeftChild(BinaryTree<T> child){
		 this.leftChild = child;
	}
	
	public void addRightChild(BinaryTree<T> child) {
		 this.rightChild = child;
	}
	
	//REMUEVE HIJOS 
	public void removeLeftChild() {
		this.leftChild = null;
	}
	
	public void removeRightChild() {
		this.rightChild = null;
	}
	
	//PREGUNTAR VACIO 
	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	//PREGUNTO SI ES UNA HOJA
	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}
	
	//PREGUNTO SI TIENE X HIJO
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}
	
	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	
	
	//TO STRING
	@Override
	public String toString() {
		return this.getData().toString();
	}


}
