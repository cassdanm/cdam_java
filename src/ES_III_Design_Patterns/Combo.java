
//superclass
public class Combo{

    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();


    public void CriarCombo (int x)
    {
        if(x == 1) {
            //burguer
            burguer.setDescricao("X-Tudo");
            burguer.setGramas(300);
            burguer.setPreco(25.75);
            //sobremesa
            sobremesa.setDescricao("Bolo de pote: chocolate");
            sobremesa.setPreco(12.75);
            sobremesa.setTamanho("Grande");
            //bebida
            bebida.setDescricao("Coca-cola");
            bebida.setPreco(15.35);
            bebida.setML(600);
        }
        else{
            //burguer
            burguer.setDescricao("X-Bacon");
            burguer.setGramas(300);
            burguer.setPreco(21.50);
            //sobremesa
            sobremesa.setDescricao("Bolo de pote: morango");
            sobremesa.setPreco(10.50);
            sobremesa.setTamanho("Médio");
            //bebida
            bebida.setDescricao("Pepsi");
            bebida.setPreco(12.90);
            bebida.setML(600);

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
