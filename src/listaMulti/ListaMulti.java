package listaMulti;

import java.util.Arrays;

public class ListaMulti {
	/* Atributos */
	private int[][] lista;

	private int tamanho;

	/* construtor instanciando uma matriz de tamanho x 1 */
	public ListaMulti(int tamanho) {
		// agora a matriz é de tamanho x 1
		this.lista = new int[tamanho][1];
		this.tamanho = 0;
	}

	/* Método para Listar todos os Elementos */
	public void listarElementosListaMulti() {
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j] + " ");
			}
			System.out.println();
		}
	}

	/* Método para adicionar elemento */
	public void adicionarElemento(int elemento) {
		if (tamanho < lista.length) {
			// agora a matriz é de tamanho x 1, então precisamos criar um novo vetor de
			// tamanho 1
			lista[tamanho++] = new int[] { elemento };
		} else {
			System.out.println("A lista está cheia!");
		}
	}

	/* Método para adicionar nova lista */
	public void adicionaLista(int[] novaLista) {
		if (tamanho < lista.length) {
			// agora a matriz é de tamanho x 1, então não podemos simplesmente adicionar um
			// novo vetor na posição "tamanho"
			// precisamos percorrer a matriz e encontrar uma posição que ainda não tenha
			// sido ocupada
			int i = 0;
			while (i < lista.length && lista[i][0] != 0) {
				i++;
			}
			if (i < lista.length) {
				lista[i] = novaLista;
				tamanho++;
			} else {
				System.out.println("A lista está cheia!");
			}
		} else {
			System.out.println("A lista está cheia!");
		}
	}

	/* Método para inverter a lista */
	public void inverterOrdemLista() {
		int[][] listaInvertida = new int[lista.length][];

		for (int i = 0; i < lista.length; i++) {
			listaInvertida[i] = lista[lista.length - i - 1];
		}
		lista = listaInvertida;
	}

	/* Método para eliminar primeiro */
	public void eliminarPrimeiro() {
		if (lista.length == 0) {
			System.out.println("Lista vazia");
		} else {
			lista = Arrays.copyOfRange(lista, 1, lista.length);
			tamanho--;
		}
	}
}