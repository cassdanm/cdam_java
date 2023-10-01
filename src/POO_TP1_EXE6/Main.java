package POO_TP1_EXE6;

//Classe Principal para Testar a Padaria
public class Main {
	
 public static void main (String args[]) {
     // Criar uma instância de Padaria usando o construtor
    Padaria minhaPadaria = new Padaria("Padaria do João", "Rua Principal, 123", 1000);

     // Exibir informações da padaria
    System.out.println("Nome da Padaria: " + minhaPadaria.getNome());
    System.out.println("Endereço da Padaria: " + minhaPadaria.getEndereco());
    System.out.println("Quantidade de Pães na Padaria: " + minhaPadaria.getQuantidadePao());

     // Alterar valores dos atributos usando os métodos set
     minhaPadaria.setNome("Padaria da Maria");
     minhaPadaria.setEndereco("Avenida Secundária, 456");
     minhaPadaria.setQuantidadePao(1200);

     // Exibir informações atualizadas
    System.out.println("\nNome da Padaria (Atualizado): " + minhaPadaria.getNome());
    System.out.println("Endereço da Padaria (Atualizado): " + minhaPadaria.getEndereco());
    System.out.println("Quantidade de Pães na Padaria (Atualizada): " + minhaPadaria.getQuantidadePao());
}
}