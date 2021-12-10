package Familia41;

import java.util.Scanner;

public class Lacos_Rep_exFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		int num, par=0, impar=0, x;
		Scanner leia = new Scanner(System.in);
		
	for (x = 0 ; x < 10 ; x++) // escrever x=1 ; x <=10 x++ também funciona!!!
	{
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		if (num % 2 == 0) // resto da divisão de um X por 2 deverá ser zero!
		{
			par++;
		}
		else // mas se não for:
			{
				impar++;
			}
		}
	System.out.println("\nNesta sequência, foram digitados " + par + " números pares e " + impar + " números ímpares.");
	}

}
