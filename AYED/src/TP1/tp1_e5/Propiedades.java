package TP1.tp1_e5;


public class Propiedades {
	private int max;
	private int min;
	private int promedio;
	private int [] vector;
	private int diml;
	
	public Propiedades(int tam) {
		this.diml= tam;
		this.vector = new int [tam];
		this.promedio = 0;
		this.min = 9999;
		this.max=-1;
			
			
	}
	
	public void cargar(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			this.vector[i] = vector[i]; 
		}
	}
	
	public void maximo() {
		for (int i : vector) {
			if(this.max < i) {
				this.max = i;
			}
		}
	}
	
	public void minimo() {
		for (int i : vector) {
			if (this.min > i) {
				this.min = i;
			}
		}
	}
	
	public void promedio() {
		for (int i : vector) {
			this.promedio += i;
		}
		promedio= promedio/vector.length;
	}
	
	public int getMaximo() {
		return this.max;
	}
	
	public int getMinimo() {
		return this.min;
	}

	public int getPromedio() {
		return this.promedio;
	}	
}
