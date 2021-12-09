package Familia41;

import java.util.Scanner;

public class Exercicio4Dia09Dezembro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
				
		System.out.print("\nOi! Digite um número: ");
		numero = leia.nextFloat();

		if ((numero % 2 == 0)) 
		{
			System.out.println("\nO número " + numero + " é par. Sua raíz quadrada é " + Math.sqrt(numero) + ".");
		} else {
			System.out.println("\nO número " + numero + " é ímpar. Elevado ao quadrado, ele vira " + Math.pow(numero, 2) + ".");
		}
	}
}