package TP1.tp1_e5;

public class metodos {
	static public int max;
	static public int min;
	static public int promedio;
	
	public static int [] metodoretorno(int [] vectornumeros) {
		int [] vector = new int [3];
		int max = -1;
		int min= 9999;
		int promedio= 0;
		for (int i = 0;i<vectornumeros.length;i++) {
			if (max < vectornumeros[i]) {
				max = vectornumeros[i];			
			}
			if (min > vectornumeros[i]) {
				min = vectornumeros[i];			
			}
			promedio += i;
		}
		vector[0] = max;
		vector[1] = min;
		vector[2] = promedio/vectornumeros.length;
		return vector;
	}
	
	public static void metodosinretorno(Propiedades pepo){
		pepo.minimo();
		pepo.maximo();
		pepo.promedio();
	}
	
	public static void metodovacios(int [] vec) {
		int [] vector = new int [3];
		int max = -1;
		int min= 9999;
		int promedio= 0;
		for (int i = 0;i<vec.length;i++) {
			if (max < vec[i]) {
				max = vec[i];			
			}
			if (min > vec[i]) {
				min = vec[i];			
			}
			promedio += i;
		}
		promedio = promedio / vec.length;
		setMax(max);
		setMin(min);
		setPromedio(promedio);
		
	}

	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		metodos.max = max;
	}

	public static int getMin() {
		return min;
	}

	public static void setMin(int min) {
		metodos.min = min;
	}

	public static int getPromedio() {
		return promedio;
	}

	public static void setPromedio(int promedio) {
		metodos.promedio = promedio;
	}
	
	
	
}
