package POO_TP1_EXE2; 

import javax.swing.JOptionPane; 

public class Livraria { 

	private String editora; 
	private String autor; 
	private String livro; 
	private int quantidade; 

	private double preco; 


	public void setEditora(String editora){ 
		this.editora = editora; } 


	public String getEditora(){ 
		return editora; } 

	public void setAutor(String autor) {
		this.autor = autor; } 

	public String getAutor() {
		return autor; } 

	public void setLivro(String livro) {
		this.livro = livro; } 

	public String getlivro() { 
		return livro; } 

	public void setQuantidade(int quantidade) { 
		this.quantidade = quantidade; } 

	public double getQuantidade() { 
		return quantidade; } 

	public void setPreco(double preco) { 
		this.preco = preco; } 

	public double getPreco() { 
		return preco; } 

	public void Informa_Livros(int codigo) { 

		switch(codigo){ 



		case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" + 

				"LIVRO: " + livro + 

				"\n EDITORA: " + editora + 

				"\n AUTOR: " + autor + 

				"\n QUANTIDADE: " + quantidade + 

				"\n PRECO R$ " + preco,"", JOptionPane.PLAIN_MESSAGE);break; 



		case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPIRITA \n" + 

				"LIVRO: " + livro + 

				"\n EDITORA: " + editora + 

				"\n AUTOR: " + autor + 

				"\n QUANTIDADE: " + quantidade + 

				"\n PRECO R$ " + preco,"", JOptionPane.PLAIN_MESSAGE);break; 



		case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMATICA \n" + 

				"LIVRO: " + livro + 

				"\n EDITORA: " + editora + 

				"\n AUTOR: " + autor + 

				"\n QUANTIDADE: " + quantidade + 

				"\n PRECO R$ " + preco,"", JOptionPane.PLAIN_MESSAGE);break; 



		default: System.out.println("codigo nao coresponde a nenhuma categoria de livro"); 

		} 

	} 

} 