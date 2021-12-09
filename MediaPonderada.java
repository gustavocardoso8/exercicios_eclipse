package Familia41;

import java.math.*;
import java.util.Scanner;


public class MediaPonderada {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, mediaPonderada;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nInforme a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nInforme a terceira nota: ");
		nota3 = leia.nextFloat();
		
		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		
		System.out.println("\nSua nota média foi de: " + Math.floor(mediaPonderada));

	}

}
