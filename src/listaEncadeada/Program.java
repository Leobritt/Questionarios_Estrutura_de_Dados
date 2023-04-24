package listaEncadeada;

public class Program {

	public static void main(String[] args) {
		ListaEncadeada<String> l1 = new ListaEncadeada<>();

		l1.adicionaFinal("Leonardo Britto");
		l1.adicionaFinal("Caster");
		l1.adicionaInicio("Alvaro");
		l1.adicionaFinal("Diogo");
		l1.adicionaFinal("Bia");

		l1.removerElemento("Diogo");

		ListaEncadeada<String> l2 = new ListaEncadeada<>();

		l2.adicionaFinal("Leonardo Britto");
		l2.adicionaFinal("Caster");
		l2.adicionaInicio("Alvaro");
		l2.adicionaFinal("Denize");
		l2.adicionaFinal("Bia");


		System.out.println("Lista1: " + l1);
		System.out.println("Lista2: " + l2);

		ListaEncadeada<String> l3Encadeada = listaComuns(l1, l2);
		
		
		
		}
	private static ListaEncadeada<String> listaComuns(ListaEncadeada<String> l1, ListaEncadeada<String> l2) {
		ListaEncadeada<String> l3 = new ListaEncadeada<>();
		
		for (int i = 0; i < l1.tamanho; i++) {
			for (int j = 0; j < l2.tamanho; j++) {
				
				if (l1.percorrerAListaERetornaElelemento(i).getElemento().equals(l2.percorrerAListaERetornaElelemento(i).getElemento())) {
					l3.adicionaFinal(l1.percorrerAListaERetornaElelemento(i).getElemento());
					
					
				}
			}
			System.out.println("\nElementos em comuns: "+l1.percorrerAListaERetornaElelemento(i).getElemento());
		}
		
		return l3;
	}
		

	}


