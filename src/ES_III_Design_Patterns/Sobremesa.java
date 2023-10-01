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


    public void SetSobremesa(int tipo) {
        if (tipo == 1) {
            setDescricao("Bolo de pote: chocolate");
            setPreco(25.75);
            setTamanho("Grande");
        } else {
            setDescricao("Bolo de pote: morango");
            setPreco(21.50);
            setTamanho("Médio");
        }
    }

}
