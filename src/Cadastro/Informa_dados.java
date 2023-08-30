package Cadastro;

import javax.swing.JOptionPane;

/*Modificar a classe Informa_dados (acessa o objeto "Dados_Contribuinte")
de modo que  os atributos possam ser inseridos pelo usuario 
(com janelas JOptionPane por exemplo) */

public class Informa_dados {

	public static void main (String [] args) {
		
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		String name, cpf, cnpj, card;


		name = JOptionPane.showInputDialog(null, "Nome");
		cpf = JOptionPane.showInputDialog(null, "CPF");
		cnpj = JOptionPane.showInputDialog(null, "CNPJ");
		card = JOptionPane.showInputDialog(null, "Cartao");
		
		a.setNome(name);
		a.setCPF(cpf);
		a.setCNPJ(cnpj);
		a.setCartao(card);
		
		System.out.println("nome do contribuinte: " +a.getNome());
		System.out.println("CPF do contribuinte: " + a.getCPF());
		System.out.println("CPNJ do contribuinte: " + a.getCNPJ());
		System.out.println("Cartao do contribuinte: " + a.getCartao());
	}
	
	
/* public static void main (String [] args) {
	
	Dados_Contribuinte a = new Dados_Contribuinte();
	a.setNome("Daniela Bento");
	a.setCPF("065.887.443-54");
	a.setCNPJ("776 998 /0001");
	a.setCartao("9776-j");
	
	System.out.println("nome do contribuinte " +a.getNome());
	System.out.println("CPF do contribuinte " + a.getCPF());
	System.out.println("CPNJ do contribuinte " + a.getCNPJ());
	System.out.println("Cartao do contribuinte " + a.getCartao());
	
	
}*/
}
