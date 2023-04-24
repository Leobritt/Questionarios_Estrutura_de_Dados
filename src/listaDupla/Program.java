package listaDupla;

public class Program {
	public static void main(String[] args) {
		listaDupla ld = new listaDupla();
		
		ld.inserirInicio("Leo");
		ld.inserirInicio("Caster");
		ld.inserirInicio("Diogo Aguiar");
		
		System.out.println(ld);
		
		ld.inserirFinal("Eduardo");
		System.out.println(ld);
		
		ld.retirarInicio();
		System.out.println(ld);

		ld.retirarFinal();
		System.out.println(ld);
		
		ld.inserirMeio(1,"Maria Joana");
		System.out.println(ld);
		
		ld.retirarMeio(1);
		System.out.println(ld);

	}
}
