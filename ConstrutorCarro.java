package MetodoConstrutor;

public class ConstrutorCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***********Construtor sem argumento*********

		Carro carro1 = new Carro();	

		carro1.setNumchassi(1987560);
		carro1.setPlaca("EPC23L");
		

		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumchassi());
		System.out.println("______________________________");
		
		//***********Construtor 2 argumento********
		Carro carro2 = new Carro("HJL534O",123445);
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumchassi());
		System.out.println("______________________________");

		//**********Construtor com 1 argumento*************
		Carro carro3= new Carro("ALO432DF");
		System.out.println(carro3.getPlaca());


	}
}


