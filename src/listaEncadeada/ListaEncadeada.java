package listaEncadeada;

public class ListaEncadeada<T> {
	private No<T> ultimo;

	private No<T> inicio;

	int tamanho;

	public ListaEncadeada() {

		this.ultimo = null;
		this.inicio = null;
		this.tamanho = 0;
	}

	public No<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(No<T> ultimo) {
		this.ultimo = ultimo;
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

	public void adicionaFinal(T elemento) {
		No<T> celula = new No<T>(elemento);

		if (this.tamanho == 0) {
			this.inicio = celula;

		} else {
			this.ultimo.setProximo(celula);
			// o proximo do ultimo vai ser a celula
			// ou seja o ponteiro do ultimo vai apontar para nova celula

		}
		this.ultimo = celula;
		// a celula foi virou a ultima
		tamanho++;
	}

	public void adicionaInicio(T elemento) {
		No<T> celula = new No<T>(elemento);

		if (this.tamanho == 0) {
			this.inicio = celula;

		} else {
			celula.setProximo(inicio);

		}
		this.inicio = celula;
		// a celula foi virou o inicio
		tamanho++;
	}

	public void removerElemento(T elemento) {
		// var para percorrer a lista
		No<T> anterior = null;
		No<T> atual = this.inicio;

		for (int i = 0; i < this.tamanho; i++) {
			// se o elemento do atual (primeiro/inicio) for igual ao parametro
			if (atual.getElemento() == elemento) {
				// se a lista tiver somente um elemento
				if (this.tamanho == 1) {
					//deixando os elementos null "exluir"
					this.inicio = null;
					this.ultimo = null;
					
					//se atual for o inicio da lista
				} else if (atual == inicio) {
					//o inicio será o No atual apontando para o proximo  
					this.inicio = atual.getProximo();
					//o ponteiro do atual ira apontar para null
					atual.setProximo(null);
					
					//se o atual for o ultimo da lista
				} else if (atual == ultimo) {
					//o ultimo ira ser o anterior    
					this.ultimo = anterior;
					//o ponteiro do anterior sera null
					anterior.setProximo(null);
				} else {
					//o no anterior vai apontar para o atual do proximo
					anterior.setProximo(atual.getProximo());
					//deletando o atual
					atual = null;
				}
				
				this.tamanho--;
				break;
			}
			//o anterior vira o atual
			anterior = atual;
			//o atual vai apontar para o proximo
			atual = atual.getProximo();
		}
	}
	
	// Percorrer a Lista e Retorna o Elelemento desejado
	public No<T> percorrerAListaERetornaElelemento(int posicao) {
		No<T> atual = this.inicio;

		for (int i = 0; i < posicao; i++) {

			if (atual.getProximo() != null) {

				atual = atual.getProximo();
			}
		}
		return atual;
	}

	public void tamanhoImprimir() {
		System.out.println(this.tamanho);
	}

	// percorrer a lista
	@Override
	public String toString() {
		// lista vazia
		if (this.tamanho == 0) {
			return "[]";
		}

		StringBuilder stb = new StringBuilder();
		// atribuindo o valor de atual ao primeiro elemento
		No<T> atual = this.inicio;
		// obtendo o "valor" do atual
		stb.append(atual.getElemento()).append(",");

		// Tambem pode-se percorrer a lista usando: for (int i = 0; i < tamanho - 1;
		// i++)
		while (atual.getProximo() != null) {
			// movendo para o proximo elemento
			atual = atual.getProximo();
			stb.append(atual.getElemento()).append(",");

		}

		return stb.toString();

	}

}
