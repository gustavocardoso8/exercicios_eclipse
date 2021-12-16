package Familia41;

public class ProdutoEletronico {
	
	// primeiro eu declaro os atributos
	
	private String produto;
	private String marca;
	private String modelo;
	private String versao;
	private String tela;
	
	
	// depois, inicio o método construtor
			public ProdutoEletronico (String produto, String marca, String modelo, String versao, String tela)
			{
				this.produto = produto;
				this.marca = marca;
				this.modelo = modelo;
				this.versao = versao;
				this.tela = tela;
			}
			// após isso, inicio os demais métodos da minha classe
			// botão direito, Source, Generate Getters and Setters
			public void imprimirInfo()
			{
				System.out.println("\nEste é um aparelho " + produto + " pertencente à " + marca + ", modelo "
						+ modelo + " versão " + versao + " com uma tela de " + tela + " polegadas.");
			}
	
			public String getProduto() {
				return produto;
			}
			public void setProduto(String produto) {
				this.produto = produto;
			}
			public String getMarca() {
				return marca;
			}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			public String getModelo() {
				return modelo;
			}
			public void setModelo(String modelo) {
				this.modelo = modelo;
			}
			public String getVersao() {
				return versao;
			}
			public void setVersao(String versao) {
				this.versao = versao;
			}
			public String getTela() {
				return tela;
			}
			public void setTela(String tela) {
				this.tela = tela;
			
			}

}
