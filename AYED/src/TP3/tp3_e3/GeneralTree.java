package TP3.tp3_e3;

import java.util.LinkedList;
import java.util.List;
import TP1.tp1_eje8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {	 
		if (this.isLeaf()) return 0;
		int max = 0;
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> Child:children) {
			max = Math.max(max,Child.altura()+1);
		}
		return max;
	}
	
	public int nivel(T dato){
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;

		while (!cola.isEmpty()) {
			GeneralTree<T> actual = cola.dequeue();
		        
		     if (actual != null) {
		         if (dato.equals(actual.getData())) {
		             return nivel;
		         }

		         for (GeneralTree<T> hijo : actual.getChildren()) {
		             cola.enqueue(hijo);
		         }
		     } else {
		         if (!cola.isEmpty()) {
		             nivel++;
		             cola.enqueue(null);
		         }
		     }
		}

		return -1;
		}

	public int ancho() {
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		int max = 0;

		while (!cola.isEmpty()) {
			int nivelActual = cola.size();  // Cantidad de nodos en el nivel actual
		    max = Math.max(max, nivelActual);

		    for (int i = 0; i < nivelActual; i++) {
		        GeneralTree<T> actual = cola.dequeue();
		        for (GeneralTree<T> hijo : actual.getChildren()) {
		            cola.enqueue(hijo);
		        }
		    }
		}

		return max;
		}
	}