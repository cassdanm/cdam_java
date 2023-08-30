package Autom_revenda;

public class Automove1 {

	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	//metodo construtor
	Automove1 () {}
	//metodo construtor
	Automove1 (int ano, String marca, String modelo, double preco){
		
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	static {
		cor = "verde";
	}

public void mostracarro ()
{
	System.out.println("\n"+"carro marca:"+"\t" + marca +
		"\n" + "modelo" + "\t" + modelo + "\n" + ano +
		"\n" + "cor:" + "\t" + cor + "\n" + "preco:" +
		"\t + preco");
	}

}