package Familia41;

import java.util.Scanner;

public class Lacos_Rep_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
		  n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
		*/
		
		int num, somaNumero=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOi! Informe um n�mero: ");
		num = leia.nextInt();
		
		do
		{
			somaNumero += num;
			System.out.println("\nInforme um n�mero novamente: ");
			num = leia.nextInt();
			
		}
		while (num != 0);
			System.out.println("\nA soma de todos os n�meros digitados � de " + somaNumero + ".");

		
	}

}
