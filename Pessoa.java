package MetodoConstrutor;

public class Pessoa {
private String nome;
private int idade;
// construtor padrão é criado mesmo que não explícito
public Pessoa() {
	
}
//********Construtor com 1 argumento************
public Pessoa(String nome) {
	this.nome=nome;
}

//********Construtor com 2 argumento**************
public Pessoa (String nome,int idade) {
	this.nome= nome;
	this.idade= idade;
}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade){
		this.idade=idade;
	}
	//********Construtor com 1 argumento**************
	public Pessoa(int idade) {
		this.idade=idade;
}
}
