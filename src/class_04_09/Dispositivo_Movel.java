package class_04_09;

public class Dispositivo_Movel {
//variavel com escopo de instancia: pode ser akterado por uma nova instancia
	public String numero;
//variaveis com escopo de classe(static): prevalece o valor da ultima variavel de instancia
	public static String usuario;
	public static int DDD;
	
	public void identifica_numero(String numero)
	{
		this.numero = numero;
	}
	public void identifica_usuario(String usuario)
	{
		this.usuario = usuario;
	}
}
