package ES_III_Design_Patterns;

public class Produto {

    private String Descricao;
    private double Preco;

    public Produto(String descricao, double preco)
    {
        this.Descricao = descricao;
        this.Preco = preco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}