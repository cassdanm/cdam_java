import java.util.Scanner;

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
public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu combo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.CriarCombo(tipo);
        System.out.println(combo);
    }
}
