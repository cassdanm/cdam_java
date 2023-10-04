package XI_Organiza_Cidade;
//classe de aplicação/execução
public class Prefeitura {

    public static void main(String args[]){

        Regiao_de_Santos r = new Regiao_de_Santos();
        Bairro_de_Santos b = new Bairro_de_Santos();
        Cidade_de_Santos c = new Cidade_de_Santos();

//classe de hierarq mais inferior da acesso a tds os atributos

        b.setBairro("Jardim Radio Clube");
        b.setRegiao("Zona Noroeste");
        b.setRua("Alvaro Guimares");
        b.setPopulacao(100000);
        System.out.println("BAIRRO: " +  b.getBairro());
        System.out.println("REGIAO: " +  b.getRegiao());
        System.out.println("RUA: " + b.getRua());
        System.out.println("POPULACAO: " + b.getPopulacao());

//nao da acesso aos atributos da classe inferior

        r.setRegiao("Zona Leste");
        r.setBairro("Marape");
        r.setPopulacao(99000);
        System.out.println("BAIRRO: " +  r.getBairro());
        System.out.println("REGIAO: " +  r.getRegiao());
        System.out.println("POPULACAO: " + r.getPopulacao());

        c.setRegiao("Regiao Central");
        c.setPopulacao(20000);
        System.out.println("REGIAO: " + c.getRegiao());
        System.out.println("POPULACAO: " + c.getPopulacao());
    }
}
