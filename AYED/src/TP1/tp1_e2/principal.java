package TP1.tp1_e2;
import java.util.Scanner;

public class principal {
    public  static void main (String [] args){
    	Scanner escaner = new Scanner(System.in) ;
    	System.out.print("Ingrese DIML: ");
		int diml = escaner.nextInt();
		
        int [] vector1 = vector.devolvermult5(diml);
        for (int i=0;i<diml;i++) {
        	System.out.println(vector1[i]);
        }
        System.out.print("----------------------------------------------");
        System.out.print("Ingrese numero para multiplos: ");
		int N = escaner.nextInt();
        int [] vector2 = vector.devolvermultN(N,diml);
        for (int i=0;i<diml;i++) {
        	System.out.println(vector2[i]);
        }
    }
}
