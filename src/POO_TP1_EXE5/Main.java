package POO_TP1_EXE5;
//Classe Principal para Testar a Padaria
public class Main {
 public static void main(String[] args) {
     // Criar uma instância de Padaria usando o construtor
     Padaria minhaPadaria = new Padaria("Padaria do João", "Rua Principal, 123", 1000);

     // Obter informações da padaria
     System.out.println("Nome da Padaria: " + minhaPadaria.getNome());
     System.out.println("Endereço da Padaria: " + minhaPadaria.getEndereco());
     System.out.println("Quantidade de Pães na Padaria: " + minhaPadaria.getQuantidadePao());

     // Alterar a quantidade de pães
     minhaPadaria.setQuantidadePao(1200);
     System.out.println("Nova quantidade de Pães na Padaria: " + minhaPadaria.getQuantidadePao());
}
}