package Familia41;


public class Exerc_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int [6];
		int soma=0;
		
		a[0]=1; a[1]=0; a[2]=5; a[3]= -2; a[4]= -5; a[5]=7;
		
		soma = (a[0] + a[1] + a[5]);
		
		System.out.println("\nA soma das posi��es A[0], A[1] e A[5] � de: " + soma + ".");
		
		a[3] = 100;
		
		System.out.println("\n\nA posi��o n�mero 1 do vetor A � " + a[0] + ".");
		System.out.println("\nA posi��o n�mero 2 do vetor A � " + a[1] + ".");
		System.out.println("\nA posi��o n�mero 3 do vetor A � " + a[2] + ".");
		System.out.println("\nA posi��o n�mero 4 do vetor A � " + a[3] + ".");
		System.out.println("\nA posi��o n�mero 5 do vetor A � " + a[4] + ".");
		System.out.println("\nA posi��o n�mero 6 do vetor A � " + a[5] + ".");
		
		
		
	}

}
