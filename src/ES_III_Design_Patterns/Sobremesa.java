package ES_III_Design_Patterns;

public class Sobremesa extends Produto {

    String Tamanho;

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public Sobremesa(String descricao, String tamanho, double preco) {
        super(descricao, preco);
        this.Tamanho = tamanho;
    }

}