package Familia41;

import java.util.Scanner;

public class Exercicio3Dia09Dezembro {

	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá! Informe a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <15)
		{
			System.out.println("\nOlá pequeno! Você pertence ao grupo Infantil :)");
		}
		else if (idade >=15 && idade < 18)
		{
			System.out.println("\nOra ora, você percente ao grupo Juvenil!");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("\nVocê se encontra na categoria Adulto. Não esqueça de pagar os boletos :c");
		}
		else
		{
			System.out.println("\nOpa, não identificamos uma categoria pra você. Por gentileza, informe uma idade entre 10 e 25 anos.");
		}
	}
}
