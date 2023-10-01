package ES_III_Design_Patterns;

import java.util.Date;

public class Produto {

    public String Descricao;
    public double Preco;

    public Produto(String descricao, double preco)
    {
        this.Descricao = descricao;
        this.Preco = preco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}