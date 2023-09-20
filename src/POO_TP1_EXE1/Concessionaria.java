package POO_TP1_EXE1;

import javax.swing.JOptionPane;
public class Concessionaria {
	public static void main (String args[]) {
		
		Automovel e = new Automovel();
		
		String mr, md, pr, cr;
		double pc;
		
		mr = JOptionPane.showInputDialog("digite a marca:");
		md = JOptionPane.showInputDialog("didite o modelo:");
		cr = JOptionPane.showInputDialog("digite a cor:");
		pr = JOptionPane.showInputDialog("digite o preco:");
		
		pc = Double.parseDouble(pr);
		
		e.setMarca(mr);
		e.setModelo(md);
		e.setCor(cr);
		e.setPreco(pc);
		
		e.Informa_Automovel();
	}

}
