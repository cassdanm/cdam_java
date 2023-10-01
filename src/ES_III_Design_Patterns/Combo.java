package ES_III_Design_Patterns;

/*
Usando as classes:

Superclass: Produto;
Subclass:  Burguer, Sombremesa, Bebida;

Implemente uma classe “Combo” seguindo o design pattern “Facade”.
A classe implementada por você deverá ter um método que permita
facilmente a criação de “combos” que incluam um sanduiche (burguer),
uma sobremesa e bebida do “combo”. Deverá também ter um método para
mostrar quais são os itens do “combo”. Se julgar necessário crie
outras classes auxiliares.
 */

//superclass
public class Combo {

    int tipo;
    String combo;

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public static void main (String args []) {

        private Produto produto = new Produto();
        private Burguer burguer = new Burguer();
        private Sobremesa sobremesa = new Sobremesa();
        private Bebida bebida = new Bebida();

    }

    public void CriarCombo(int tipo)
    {
        switch (tipo) {
            case 1: {
                setCombo("/n Combo Master /n");
                Burguer.setDescricao();
                Burguer.setGramas();
                Burguer.setPreco();

                Sobremesa.setTamanho();
                Bebida.setML();

                Mostra();
                break;
            }
            case 2: {
                setCombo("Super Combo");
                Produto.setDescricao();
                Produto.setPreco();
                Burguer.setGramas();
                Sobremesa.setTamanho();
                Bebida.setML();
                Mostra();
                break;
            }
        } //fim switch
    } //fim criarCombo

    public void Mostra()
    {
        System.out.println(combo);
        System.out.println("/n Sanduiche: " + Burguer.getDescricao());
        System.out.println("/n Peso(gm): " + Burguer.getGramas());
        System.out.println("/n Preco: R$ " + Burguer.getPreco());

        System.out.println("/n Sobremesa " + Sobremesa.getDescricao());
        System.out.println("/n Tamanho: " + Sobremesa.getTamanho());
        System.out.println("/n Preco: R$ " + Sobremesa.getPreco());

        System.out.println("/n Bebida: " + Bebida.getDescricao());
        System.out.println("/n ML: " + Bebida.getML());
        System.out.println("/n Preco: R$ " + Bebida.getPreco());
    }
}
