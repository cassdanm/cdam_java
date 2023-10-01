package POO_TP1_EXE5;

//Classe Padaria
public class Padaria {
	// Atributos
	private String nome;
	private String endereco;
	private int quantidadePao;

	// Construtor
	public Padaria(String nome, String endereco, int quantidadePao) {
		this.nome = nome;
		this.endereco = endereco;
		this.quantidadePao = quantidadePao;
	}

	// Método para definir o nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método para obter o nome
	public String getNome() {
		return nome;
	}

	// Método para definir o endereço
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// Método para obter o endereço
	public String getEndereco() {
		return endereco;
	}

	// Método para definir a quantidade de pães
	public void setQuantidadePao(int quantidadePao) {
		this.quantidadePao = quantidadePao;
	}

	// Método para obter a quantidade de pães
	public int getQuantidadePao() {
		return quantidadePao;
	}
}
