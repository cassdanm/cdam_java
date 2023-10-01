package ES_III_Design_Patterns;

public class Burguer extends Produto {

    private int Gramas;

    public int getGramas() {
        return Gramas;
    }

    public void setGramas(int gramas) {
        Gramas = gramas;
    }

    public Burguer(String descricao, int gramas, double preco)
    {
        super(descricao, preco);
        this.Gramas = gramas;
    }



}
