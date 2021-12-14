package Familia41;


public class Exerc_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int [6];
		int soma=0;
		
		a[0]=1; a[1]=0; a[2]=5; a[3]= -2; a[4]= -5; a[5]=7;
		
		soma = (a[0] + a[1] + a[5]);
		
		System.out.println("\nA soma das posições A[0], A[1] e A[5] é de: " + soma + ".");
		
		a[3] = 100;
		
		System.out.println("\n\nA posição número 1 do vetor A é " + a[0] + ".");
		System.out.println("\nA posição número 2 do vetor A é " + a[1] + ".");
		System.out.println("\nA posição número 3 do vetor A é " + a[2] + ".");
		System.out.println("\nA posição número 4 do vetor A é " + a[3] + ".");
		System.out.println("\nA posição número 5 do vetor A é " + a[4] + ".");
		System.out.println("\nA posição número 6 do vetor A é " + a[5] + ".");
		
		
		
	}

}
