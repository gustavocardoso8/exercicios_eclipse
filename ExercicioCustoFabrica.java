package Familia41;

import java.util.Scanner;

public class ExercicioCustoFabrica {

	public static void main(String[] args) {
		
		float custoFabrica, custoConsumidor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme qual foi o custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = (float) (custoFabrica + (custoFabrica * 0.73));
		
		System.out.printf("O custo ao consumidor é de: R$ ");
		System.out.println(custoConsumidor);

	}

}
