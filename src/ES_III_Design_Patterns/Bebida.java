package ES_III_Design_Patterns;

public class Bebida extends Produto {

    int ML;

    public int getML() {
        return ML;
    }

    public void setML(int ML) {
        this.ML = ML;
    }

    public Bebida(String descricao, int ml, double preco)
    {
        super(descricao,preco);
        this.ML = ml;
    }

}
