package TP1.tp1_e2;

public class vector {
	
	public static int [] devolvermult5(int diml) {
		int [] vector = new int[diml];
		for (int i=0;i<diml;i++) {
			vector [i] = (i+1)*5;
		}
	return vector;
	}
	
	public static int [] devolvermultN(int N,int diml) {
		int [] vector = new int[diml];
		for (int i = 0;i<diml;i++) {
			vector[i] = (i+1) * N;
		}
	return vector;	
	}
}
