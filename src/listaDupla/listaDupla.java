package listaDupla;

public class listaDupla {
	No inicio;
	No fim;
	int tamanho = 0;

	public void inserirInicio(String info) {
		/* Instanciando obj No */
		No novoNo = new No();
		/* Atribuindo o parametro info ao atributo info do novoNo */
		novoNo.info = info;

		/* Atribuindo null ao ponteiro do no anterior */
		novoNo.anterior = null;

		/* Atribuindo inicio ao ponteiro proximo */
		novoNo.proximo = inicio;

		/* Se a lista n tiver vazia */
		if (inicio != null) {
			/* o ponteiro anterior do inicio vai apontar para o novo no */
			inicio.anterior = novoNo;
		}
		/* Atribuindo o inicio ao novoNo */
		inicio = novoNo;
		if (tamanho == 0) {
			fim = inicio;
		}
		tamanho++;
	}

	public void inserirFinal(String info) {
		/* Instanciando obj No */
		No novoNo = new No();
		/* Atribuindo o parametro info ao atributo info do novoNo */
		novoNo.info = info;
		/* O ponteiro proximo vai apontar para null */
		novoNo.proximo = null;
		/* O ponteiro anterior vai apontar para o fim */
		novoNo.anterior = fim;
		/* Se a lista não estiver vazia */
		if (fim != null) {
			fim.proximo = novoNo;

		}
		/* o fim será o novoNo */
		fim = novoNo;

		if (tamanho == 0) {

			inicio = fim;
		}

		tamanho++;

	}

	public void inserirMeio(int posicao, String info) {
		/* No de locomoção */
		No noLocal = inicio;
		/* No a ser inserido */
		No novoNo = new No();

		/* se a posicao for 0 */
		if (posicao <= 0) {
			inserirInicio(info);
			/* se a posicao for maior ou igual o tamanho */
		} else if (posicao >= tamanho) {
			inserirFinal(info);
		} else {
			/*Percorrer a lista até a posicao (-1 pq começa com 0)*/
			for (int i = 0; i < posicao - 1; i++) {
				/*Atribuir o ponteiro o proximo ao local*/
				noLocal = noLocal.proximo;
			}
		}
		
		novoNo.info = info;
		/*O ponteiro anterior do novoNo vai apontar para o local*/
		novoNo.anterior = noLocal;
		/*O ponteiro proximo do novoNo vai apontar para o ponteiro do local*/
		novoNo.proximo = noLocal.proximo;
		/*O ponteiro proximo do local vai apontar para o novoNo*/
		noLocal.proximo = novoNo;
		
		novoNo.proximo.anterior = novoNo;
		tamanho++;
	}

	public String retirarInicio() {
		/* Lista Vazia */
		if (inicio == null) {
			System.out.println("Lista Vazia!");
			return null;
		}
		/* Dado a ser deletado */
		String infoSerDeletada = inicio.info;

		/* Inicio será o que o ponteiro proximo apontar */
		inicio = inicio.proximo;

		/* Se a lista não tiver vazia */
		if (inicio != null) {
			/* "Excluindo" */
			inicio.anterior = null;
		} else {
			fim = null;
		}
		tamanho--;

		return infoSerDeletada;
	}

	public String retirarFinal() {
		No novoNo = new No();

		if (tamanho == 0) {
			System.out.println("Lista vazia");
			return null;
		}
		String infoASerDeletada = novoNo.info;
		fim = fim.anterior;

		if (fim != null) {
			fim.proximo = null;
		} else {
			inicio = null;
		}
		tamanho--;
		return infoASerDeletada;
	}
	public String retirarMeio(int posicao) {
		if (posicao < 0 || posicao >= tamanho || inicio == null) {
			return null;
		}else if(posicao == 0) {
			return retirarInicio();
		}else if(posicao == tamanho - 1) {
			return retirarFinal();
		}
			No local = inicio;
			for (int i = 0; i < posicao; i++) {
				local = local.proximo;
			}
			if (local.anterior != null) {
				/*Apagando ponteiros*/
				local.anterior.proximo = local.proximo;
			}
			if (local.proximo != null) {
				/*Apagando ponteiros*/
				local.proximo.anterior = local.anterior;
			}
		
		tamanho--;
		return local.info;
	}

	public String toString() {
		String str = "Tamanho: (" + tamanho + ")";
		No local = inicio;
		while (local != null) {
			str += local.info + " ";
			local = local.proximo;
		}
		return str;
	}

}