package class_08_28;

import javax.swing.JOptionPane;

public class Dados_automovel {
public static void main(String args[]) {
	
	Automovel a = new Automovel();
	
	String md, pr;
	double pc;
	
	md = JOptionPane.showInputDialog("digitar o modelo");
	pr = JOptionPane.showInputDialog("digitar o preco");
	pc = Double.parseDouble(pr);
	
	a.set_modelo(md);
	a.set_preco(pc);
	
	System.out.println("modelo: " + a.get_modelo());
	System.out.println("preco: " + a.get_preco());
}

}
