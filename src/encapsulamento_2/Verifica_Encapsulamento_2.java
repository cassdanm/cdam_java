package encapsulamento_2;

import encapsulamento_1.Acesso_numeros;

public class Verifica_Encapsulamento_2 {
public static void main(String args []) {
	
	Acesso_numeros chave = new Acesso_numeros();
	
	//chave.a = 10; encapsulamento PACKAGE PRIVATE nao permite acesso fora do pacote
	chave.setNumero("a", 10);
	chave.b = 20;
	//chave.c = 30; n ~e possivel acessar varial private diretamente
	chave.setNumero("c", 30);
	//chave.d = 40; n ~e possivel acess variavel protected diretamente de fora do pacote
	chave.setNumero("d", 40);
	
	chave.mostra_numero();
}
}
