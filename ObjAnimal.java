package MetodoConstrutor;

public class ObjAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Animal();	

		animal1.setTamanho(19.0);
		animal1.setCor("branco");

		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		System.out.println("______________________________");

		//**********Construtor com 1 argumento*************
		Animal animal2= new Animal("preto");
		System.out.println(animal2.getCor());
		System.out.println("______________________________");

		//***********Construtor 2 argumento********
		Animal animal3 = new Animal("marrom",20.45);
		System.out.println(animal3.getCor());
		System.out.println(animal3.getTamanho());

	}
}


