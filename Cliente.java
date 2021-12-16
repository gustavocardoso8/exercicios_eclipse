package Familia41;

public class Cliente {
	
	private String nome;
	private String sexo;
	private String telefone;
	private String idade;
	private String cidade;
	
		public Cliente (String nome, String sexo, String telefone, String idade, String cidade)
			{
				this.nome = nome;
				this.sexo = sexo;
				this.telefone = telefone;
				this.idade = idade;
				this.cidade = cidade;
			}
		public void imprimirInfo()
			{
			System.out.println("\nO cliente " + nome + ", do sexo " + sexo + ", morador da cidade " 
			+ cidade + ", é titular do telefone " + telefone + ", e tem " + idade + " anos de idade");
			}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getIdade() {
			return idade;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		

}
