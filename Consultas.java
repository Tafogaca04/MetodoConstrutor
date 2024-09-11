package MetodoConstrutor;

public class Consultas {
	private String nomePaciente;
	private String nomeDents;
	private String data;
	
	// construtor padrão é criado mesmo que não explícito
	public Consultas() {
		
	}
	//********Construtor com 1 argumento************
	public Consultas(String nomePaciente) {
		this.nomePaciente=nomePaciente;
	}

	//********Construtor com 2 argumento**************
	public Consultas (String nomePaciente, String nomeDents, String data) {
		this.nomeDents= nomeDents;
		this.nomePaciente= nomePaciente;
		this.data=data;
	}
		
		public String getnomePaciente() {
			return nomePaciente;
		}
		public void setNomePaciente(String nomePaciente) {
			this.nomePaciente=nomePaciente;
	}
		public String getNomeDents() {
			return nomeDents;
		}
		public void setNomeDents(String nomeDents){
			this.nomeDents=nomeDents;
			}
		public String getData() {
			return data;
		}
		public void setData(String data){
			this.data=data;
			}
	}

