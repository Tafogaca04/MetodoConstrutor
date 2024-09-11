package MetodoConstrutor;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//***********Construtor 2 argumento********
		Pessoa jogador2 = new Pessoa("Messi",36);
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());

		//***********Construtor sem argumento*********

		Pessoa jogador1 = new Pessoa();	

		jogador1.setIdade(10);
		jogador1.setNome("Aurora");

		System.out.println(jogador1.getIdade());
		System.out.println(jogador1.getNome());

		//**********Construtor com 1 argumento*************
		Pessoa jogador3= new Pessoa("Joana");
		System.out.println(jogador3.getNome());

		//**********Construtor com 1 argumento*************
		Pessoa jogador4= new Pessoa(15);
		System.out.println(jogador4.getIdade());
	}
}
