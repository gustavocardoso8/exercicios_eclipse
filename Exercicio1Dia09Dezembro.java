package Familia41;

import java.util.Scanner;

public class Exercicio1Dia09Dezembro {

	public static void main(String[] args) {
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.//
		
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá! Digite um número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nAgora, informe o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println("\nO primeiro número digitado (" + n1 + ") é o maior.");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("\nO segundo número digitado (" + n2 + ") é o maior.");
		}
		else if (n3 > n1 && n3 > n2)
		{
			System.out.println("\nO terceiro número digitado (" + n3 + ") é o maior.");
		}
		if (n1 == n2 && n1 == n3)
			System.out.println("\nOpção inválida! Digite números diferentes!");
		if (n2 == n1 && n2 == n3)
			System.out.println("\nOpção inválida! Digite números diferentes!");
		if (n3 == n1 && n3 == n2)
			System.out.println("\nOpção inválida! Digite números diferentes!");
		
		
		

	}

}
