package Familia41;

import java.util.Scanner;

public class Exercicio1Dia09Dezembro {

	public static void main(String[] args) {
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.//
		
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOl�! Digite um n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nAgora, informe o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println("\nO primeiro n�mero digitado (" + n1 + ") � o maior.");
		}
		else if (n2 > n1 && n2 > n3)
		{
			System.out.println("\nO segundo n�mero digitado (" + n2 + ") � o maior.");
		}
		else if (n3 > n1 && n3 > n2)
		{
			System.out.println("\nO terceiro n�mero digitado (" + n3 + ") � o maior.");
		}
		if (n1 == n2 && n1 == n3)
			System.out.println("\nOp��o inv�lida! Digite n�meros diferentes!");
		if (n2 == n1 && n2 == n3)
			System.out.println("\nOp��o inv�lida! Digite n�meros diferentes!");
		if (n3 == n1 && n3 == n2)
			System.out.println("\nOp��o inv�lida! Digite n�meros diferentes!");
		
		
		

	}

}
