package Familia41;

import java.util.Scanner;

public class Lacos_Rep_exFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		int num, par=0, impar=0, x;
		Scanner leia = new Scanner(System.in);
		
	for (x = 0 ; x < 10 ; x++) // escrever x=1 ; x <=10 x++ tamb�m funciona!!!
	{
		System.out.println("\nDigite um n�mero: ");
		num = leia.nextInt();
		if (num % 2 == 0) // resto da divis�o de um X por 2 dever� ser zero!
		{
			par++;
		}
		else // mas se n�o for:
			{
				impar++;
			}
		}
	System.out.println("\nNesta sequ�ncia, foram digitados " + par + " n�meros pares e " + impar + " n�meros �mpares.");
	}

}
