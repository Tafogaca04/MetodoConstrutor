package MetodoConstrutor;

public class Animal {
	private String cor;
	private double tamanho;
	
	// construtor padrão é criado mesmo que não explícito
	public Animal() {
		
	}
	//********Construtor com 1 argumento************
	public Animal(String cor) {
		this.cor=cor;
	}

	//********Construtor com 2 argumento**************
	public 	Animal (String cor,double tamanho) {
		this.cor= cor;
		this.tamanho= tamanho;
	}
		
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor=cor;
	}
		public double getTamanho() {
			return tamanho;
		}
		public void setTamanho(double tamanho){
			this.tamanho=tamanho;
			}
	}

