package MetodoConstrutor;

public class Carro {
	private String placa;
	private int numchassi;
	
	// construtor padrão é criado mesmo que não explícito
	public Carro() {
		
	}
	//********Construtor com 1 argumento************
	public Carro(String placa) {
		this.placa=placa;
	}

	//********Construtor com 2 argumento**************
	public Carro (String placa,int numchassi) {
		this.placa= placa;
		this.numchassi= numchassi;
	}
		
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa=placa;
	}
		public int getNumchassi() {
			return numchassi;
		}
		public void setNumchassi(int numchassi){
			this.numchassi=numchassi;
			}
	}

