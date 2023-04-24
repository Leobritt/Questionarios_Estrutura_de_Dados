package listaMulti;

public class Program {

	public static void main(String[] args) {
		ListaMulti listaM = new ListaMulti(9);
		
		System.out.println("Lista----------");
		listaM.adicionarElemento(0);
		listaM.adicionarElemento(1);
		listaM.adicionarElemento(2);
		listaM.adicionarElemento(3);
		listaM.adicionarElemento(4);
		listaM.adicionarElemento(5);
		listaM.listarElementosListaMulti();
		
		System.out.println("Removendo o primeiro---------");
		listaM.eliminarPrimeiro();
		listaM.listarElementosListaMulti();
		
		System.out.println("Inverter---------");
		listaM.inverterOrdemLista();
		listaM.listarElementosListaMulti();
		
		System.out.println("Add lista nova-------");
		int[] novaLista = new int[]{7, 8, 9, 12};
		listaM.adicionaLista(novaLista);
		listaM.listarElementosListaMulti();
		
		System.out.println("Add lista nova-------");
		int[] novaLista2 = new int[] {-2,-1,-5,20};
		listaM.adicionaLista(novaLista2);
		listaM.listarElementosListaMulti();
		
		System.out.println("Add lista nova-------");
		int[] novaLista3 = new int[] {-12,420,21,-69,300,1888};
		listaM.adicionaLista(novaLista3);
		listaM.listarElementosListaMulti();
		

		System.out.println("Removendo o primeiro---------");
		listaM.eliminarPrimeiro();
		listaM.listarElementosListaMulti();
	}

}
