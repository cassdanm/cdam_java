package POO_TP1_EXE1;

public class Automovel {
	
		private String marca;
		private String modelo;
		private String cor;
		private double preco;
		
		public void setMarca(String marca) {
			this.marca = marca; }
		
		public String getMarca() {
			return marca; }
		
		
		public void setModelo(String modelo) {
			this.modelo = modelo; }
		
		public String getModelo() {
			return modelo; }
		
		
		public void setCor(String cor) {
			this.cor = cor; }
		
		public String getCor() {
			return cor; }
		
		
		public void setPreco(double preco) {
			this.preco = preco; }
		
		public double getPreco() {
			return preco; }
		
		
	
	public void Informa_Automovel( )
	{		
		System.out.println("MARCA: " + marca);
		System.out.println("MODELO: " + modelo);
		System.out.println("COR: " + cor);
		System.out.println("PRECO: " + preco);
	}

}