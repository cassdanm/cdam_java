package ES_III_Design_Patterns;


//superclass

//superclass
public class Combo{

    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;


    public void CriarCombo (int x)
    {
        if(x == 1) {
            this.burguer = new Burguer("X-Tudo", 300, 25.75);
            this.sobremesa = new Sobremesa("Bolo de pote: chocolate","Grande",12.75);
            this.bebida = new Bebida("Coca-cola", 600,15.90);
        }
        else if(x == 2){
            this.burguer = new Burguer("X-Bacon", 250, 20.90);
            this.sobremesa = new Sobremesa("Bolo de pote: morango","Médio",12.75);
            this.bebida = new Bebida("Pepsi", 600,12.90);

        }
        else{
            System.out.println("Tipo de combo inválido");
        }
    }

    public Combo()
    {
        System.out.println("\n Sanduiche: " + burguer.getDescricao());
        System.out.println("Peso(gm): " + burguer.getGramas());
        System.out.println("Preco: R$ " + burguer.getPreco());

        System.out.println("\n Sobremesa: " + sobremesa.getDescricao());
        System.out.println("Tamanho: " + sobremesa.getTamanho());
        System.out.println("Preco: R$ " + sobremesa.getPreco());

        System.out.println("\n Bebida: " + bebida.getDescricao());
        System.out.println("ML: " + bebida.getML());
        System.out.println("Preco: R$ " + bebida.getPreco());

    }

} //fim class
