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

    public void SetBebida(int tipo) {
        if (tipo == 1) {
            setDescricao("Coca-cola");
            setPreco(15.35);
            setML(600);
        } else {
            setDescricao("Pepsi");
            setPreco(12.90);
            setML(600);
        }
    }

}
