package TP1.tp1_e1;

public class metodos {
	
	public static void metodofor(int A,int B) {
		for (int i = (A + 1);i<B;i++) {
			System.out.println(i);
		}
	}
	
	public static void metodowhile(int A,int B) {
		int i =  A + 1;
		while(i<B) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void metodoifs(int A, int B) {
		if(A < B - 1) {
			System.out.println(A + 1);
			A++;
			metodoifs(A,B);
		}
	}
}
