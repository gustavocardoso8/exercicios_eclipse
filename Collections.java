package Familia41;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
			
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\n\n-------------------------------------------");
			System.out.println("\n\nSeja bem vinde ao nosso Controle de Estoque!");
			System.out.println("\n\t\tMenu do meu Estoque");
			System.out.println("\n(1) Para armazenar um produto");
			System.out.println("\n(2) Para remover um produto");
			System.out.println("\n(3) Atualizar um produto");
			System.out.println("\n(4) Exibir todos os produtos");
			System.out.println("\n(0) Fechar a aplicação");
			System.out.println("\nQual das opções acima você deseja? ");
			System.out.println("-------------------------------------------");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nInforme o produto a ser adicionado: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o produto a ser removido: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto inexistente.");
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o produto a ser atualizado: ");
				String verifica = leia.nextLine();
				System.out.println("\nQual produto entrará no ligar? "+verifica+" ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto intexistente");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nTodos os produtos: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFim da aplicação.");
				
			}
			
		}while(op!=0);

	}

}
