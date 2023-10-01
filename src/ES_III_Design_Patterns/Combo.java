package ES_III_Design_Patterns;


//superclass
public class Combo{


        private Burguer burguer = new Burguer();
        private Sobremesa sobremesa = new Sobremesa();
        private Bebida bebida = new Bebida();


        public void CriarCombo (int tipo)
        {
            burguer.SetBurguer(tipo);
            sobremesa.SetSobremesa(tipo);
            bebida.SetBebida(tipo);
        }

    public Combo()
    {
        System.out.println("/n Sanduiche: " + burguer.getDescricao());
        System.out.println("/n Peso(gm): " + burguer.getGramas());
        System.out.println("/n Preco: R$ " + burguer.getPreco());

        System.out.println("/n Sobremesa " + sobremesa.getDescricao());
        System.out.println("/n Tamanho: " + sobremesa.getTamanho());
        System.out.println("/n Preco: R$ " + sobremesa.getPreco());

        System.out.println("/n Bebida: " + bebida.getDescricao());
        System.out.println("/n ML: " + bebida.getML());
        System.out.println("/n Preco: R$ " + bebida.getPreco());

    }

} //fim class
