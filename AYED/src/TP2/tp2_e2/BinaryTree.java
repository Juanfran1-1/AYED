package TP2.tp2_e2;
import TP1.tp1_eje8.Queue;

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
	
	
	public BinaryTree<T> espejo() {
		if (this.isEmpty()) {
			return null;
		} else {
			BinaryTree<T> inverso = new BinaryTree<T>(this.data);
			if (this.hasLeftChild()) {
				inverso.addRightChild(this.getLeftChild().espejo());
			}
			if (this.hasRightChild()) {
				inverso.addLeftChild(getRightChild().espejo());
			}
			
			return inverso;
		}
	}
	
	public int contarhojas() {
		if (isEmpty()) {
			return 0;
		}if (isLeaf()) {
			return 1;
		}else {
			int hojas = 0;
			if (hasLeftChild()) {
				hojas+= this.getLeftChild().contarhojas();
			}
			if (hasRightChild()) {
				hojas += this.getRightChild().contarhojas();
			}
			return hojas;
		}
	}
	
	public void tranversal(int n,int m) {
		if (this.isEmpty()) {
			System.out.println("EL SISTEMA ESTA VACIO");
		}else if(n>m) {
			System.out.println("INGRESO INVALIDO");
		}else {
			BinaryTree <T> ab = null;
			Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
			cola.enqueue(this);
			cola.enqueue(null);
			int level = 0;
			while (!cola.isEmpty()) {
				ab = cola.dequeue();
				if (ab != null) {
					if (n <= level && level <= m) {
						System.out.print(ab.getData() + " ");
					}
					if (ab.hasLeftChild()) {
						cola.enqueue(ab.getLeftChild());
					}
					if (ab.hasRightChild()) {
						cola.enqueue(ab.getRightChild());
					}
				}else if (!cola.isEmpty()){
					System.out.println();
					cola.enqueue(null);
					level ++;
				}	
			}
		}
	}
	
	
	public void preorden() {
		System.out.println(this.getData());
		if (this.hasLeftChild()) {
			this.getLeftChild().preorden();
		}
		if (this.hasRightChild()) {
			this.getRightChild().preorden();
		}
	}
	
	public void inorden() {
		if (this.hasLeftChild()) {
			this.getLeftChild().inorden();
		}
		System.out.println(this.getData());
		if (this.hasRightChild()) {
			this.getRightChild().inorden();
		}
	}
	
	public void postorden() {
		if (this.hasLeftChild()) {
			this.getLeftChild().postorden();
		}
		if (this.hasRightChild()) {
			this.getRightChild().postorden();
		}
		System.out.println(this.getData());
	}
	
	public void porniveles() {
		BinaryTree<T> ab= null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			if (ab != null) {
				System.out.print(ab.getData() + " , ");
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			}else if (!cola.isEmpty()) {
				System.out.println();
				cola.enqueue(null);
			}
		}
		System.out.println();
	}
	
	//TO STRING
	@Override
	public String toString() {
		return this.getData().toString();
	}


}
