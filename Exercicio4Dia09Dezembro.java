package Familia41;

import java.util.Scanner;

public class Exercicio4Dia09Dezembro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
				
		System.out.print("\nOi! Digite um n�mero: ");
		numero = leia.nextFloat();

		if ((numero % 2 == 0)) 
		{
			System.out.println("\nO n�mero " + numero + " � par. Sua ra�z quadrada � " + Math.sqrt(numero) + ".");
		} else {
			System.out.println("\nO n�mero " + numero + " � �mpar. Elevado ao quadrado, ele vira " + Math.pow(numero, 2) + ".");
		}
	}
}