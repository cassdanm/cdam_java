package Library;

import javax.swing.JOptionPane;
public class Atendente_Livraria {

	public static void main(String args[]) {
		
		Livraria cultura = new Livraria();
		
		String a, b, c, d, e, i;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null, "Digite o codigo da Categoria desejada: \n 1 para Romance \n 2 para Espirita \n 3 para Informatica");
		a = JOptionPane.showInputDialog(null, "Codigo");
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		e = JOptionPane.showInputDialog(null, "quantidade");
		i = JOptionPane.showInputDialog(null, "preco");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		
		cultura.editora = b;
		cultura.autor = c;
		cultura.livro = d;
		cultura.quantidade = g;
		cultura.preco = h;
		
		cultura.Informa_Livros(f);
	}
}
