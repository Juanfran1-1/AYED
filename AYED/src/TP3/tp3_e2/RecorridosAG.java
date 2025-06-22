package TP3.tp3_e2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import TP3.tp3_e1.GeneralTree;
import TP1.tp1_eje8.Queue;

public class RecorridosAG {
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		List <Integer> list = new ArrayList<Integer>();
		if (!a.isEmpty()) {
			imparesPreOrder(a, n, list);
			return list;
		}
		else 
			return list;
	}
	
	private void imparesPreOrder(GeneralTree<Integer> ag,Integer n,List <Integer> lista) {
		if (ag.getData() % 2 != 0 && ag.getData() > n) {
			lista.add(ag.getData());
		}
		List <GeneralTree<Integer>> Child = ag.getChildren();
		for (GeneralTree<Integer> child: Child) {
			imparesPreOrder(child,n,lista);
		}
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (!a.isEmpty()) {
			imparesInOrder(a,n,list);
			return list;
		}else {
			return list;
		}
	}	
	
	private void imparesInOrder(GeneralTree<Integer> ab, Integer n, ArrayList<Integer> lista) {
	    List<GeneralTree<Integer>> children = ab.getChildren();

	    if (!children.isEmpty()) {
	    	imparesInOrder(children.get(0), n, lista);
	    }

	    if (ab.getData() % 2 != 0 && ab.getData() > n) {
	        lista.add(ab.getData());
	    }

	    for (int i = 1; i < children.size(); i++) {
	    	imparesInOrder(children.get(i), n, lista);
	    }
	}

	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> list = new ArrayList<Integer>();
		if (!a.isEmpty()) {
			imparesPostOrder(a, n, list);
			return list;
		}
		else 
			return list;
	}
	
	private void imparesPostOrder(GeneralTree <Integer> ag, Integer n, List <Integer> lista) {
		List<GeneralTree<Integer>> children = ag.getChildren();
		for (GeneralTree<Integer> child: children) {
			imparesPostOrder(child, n, lista);
		}
		if(ag.getData() % 2 != 0 && ag.getData() > n){
			lista.add(ag.getData());
		}
	}
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,Integer n){
		List<Integer> list = new ArrayList<Integer>();
		if (!a.isEmpty()) {
			imparesPorNiveles(a, n, list);
			return list;
		}
		else 
			return list;	
	}
	
	private void imparesPorNiveles(GeneralTree<Integer> ag,Integer n,List<Integer> lista) {
		GeneralTree<Integer> aux;
		
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		queue.enqueue(ag);
		
		while(!queue.isEmpty()) {
			aux=queue.dequeue();
			if(aux.getData() % 2 != 0 && aux.getData() > n){
				lista.add(aux.getData());
			}
			List<GeneralTree<Integer>> child = aux.getChildren();
			for (GeneralTree<Integer> Child:child) {
				queue.enqueue(Child);
			}
		}
	}
	public static void main(String[] args) {
        GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
        List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
        children2.add(new GeneralTree<Integer>(21));
        children2.add(new GeneralTree<Integer>(22));
        children2.add(new GeneralTree<Integer>(23));
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
        List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
        children3.add(new GeneralTree<Integer>(31));
        children3.add(new GeneralTree<Integer>(32));
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
        List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
        childen.add(a1);childen.add(a2);childen.add(a3);
        GeneralTree<Integer> a = new GeneralTree<Integer>(11, childen);
        
        System.out.println("AlturaMax=" + a.altura());
        System.out.println("Ancho=" + a.ancho());
        
        RecorridosAG rec = new RecorridosAG();
        
        System.out.println("PREORDEN:" + rec.numerosImparesMayoresQuePreOrden(a, 0));
        System.out.println("INORDEN:" + rec.numerosImparesMayoresQueInOrden(a, 0));
        System.out.println("POSTORDEN:" + rec.numerosImparesMayoresQuePostOrden(a, 0));
        System.out.println("POR NIVELES:" + rec.numerosImparesMayoresQuePorNiveles(a, 0));
    }
}
