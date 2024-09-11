package MetodoConstrutor;

public class ObjConsultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consultas consulta1 =  new Consultas ();

		consulta1.setNomePaciente("Mirian");
		consulta1.setNomeDents("Gisela");

		System.out.println(consulta1.getnomePaciente());
		System.out.println(consulta1.getNomeDents());
		System.out.println("------------------------------");

		//***********Construtor 2 argumento********
		Consultas consulta2 = new Consultas("Helen","Julio","20/10/2024");
		System.out.println(consulta2.getnomePaciente());
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta2.getData());
		System.out.println("------------------------------");



		//**********Construtor com 1 argumento*************
		Consultas consulta3= new Consultas("George");
		System.out.println(consulta3.getnomePaciente());


	}

}


