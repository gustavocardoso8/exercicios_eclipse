package Familia41;

import java.util.Scanner;

 
public class ExercicioIdadeDias {

	public static void main(String[] args) {
		
		int dias, meses, idade, total;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nE quantos meses? ");
		meses = leia.nextInt();
		
		System.out.println("\nPor fim, quantos dias? ");
		dias = leia.nextInt();
		
		total = idade * 365 + meses * 30 + dias;
		
		System.out.printf("\nO seu total de dias de nascido, é aproximadamente de: ");
		System.out.println(total);

	}

}
