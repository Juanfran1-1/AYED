package TP1.tp1_e5;

public class principal {
	public static void main(String [] args) {
		int [] v = {11,22,33,4};
		
		int [] vprop = new int [3];
		
		vprop= metodos.metodoretorno(v);
		
		for (int i : vprop) {
			System.out.println(i);
		}
		
		Propiedades pepo = new Propiedades(4);
		
		pepo.cargar(v);
		metodos.metodosinretorno(pepo);
		
		System.out.println(pepo.getMaximo() + " " + pepo.getMinimo() + " " + pepo.getPromedio());
		
		metodos.metodovacios(v);
		System.out.println(metodos.getMax() + " " + metodos.getMin() + " " + metodos.getPromedio());
		
	}
}
