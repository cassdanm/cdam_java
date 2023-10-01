package ES_III_Design_Patterns;

public class Burguer extends Produto {

    int Gramas;

    public Burguer(String descricao, int gramas, double preco)
    {
        super(descricao, preco);
        this.Gramas = gramas;
    }

    public int getGramas() {
        return Gramas;
    }

    public void setGramas(int gramas) {
        Gramas = gramas;
    }

    public void SetBurguer(int tipo)
    {
        if (tipo == 1) {
            setDescricao("X-Tudo");
            setPreco(25.75);
            setGramas(300);
        } else {
            setDescricao("X-Bacon");
            setPreco(21.50);
            setGramas(220);
        }

    }

}
