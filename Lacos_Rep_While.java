package Familia41;

import java.util.Scanner;

public class Lacos_Rep_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		/*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
		 */
		
		int idade, grupo1=0, grupo2=0, x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá! Informe sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) // a idade tem que ser diferente de -99.
		{
			if (idade < 21) // caso a idade seja menor que 21 anos:
			{
				grupo1++;
			}
			else if (idade > 50) // caso a idade seja maior que 50 anos:
			{
				grupo2++;
			}
			else // se não se encaixar em nenhum desses dois:
			{
				System.out.println("\n A idade digitada é inválida. Por gentileza, informe outra idade.");
			}
			System.out.println("\nInforme novamente sua idade: ");
			idade = leia.nextInt();
			
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de " + grupo1 + 
				", enquanto o total de pessoas com mais de 50 anos é de " + grupo2 + ".");
	}

}
