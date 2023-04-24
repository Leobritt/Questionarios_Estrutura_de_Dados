package listaEncadeada;

public class No<T> {
	private No<T> proximo;

	private T elemento;
	
	public No(T elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	

	@Override
	public String toString() {
		return "No [elemento: " + elemento + ", proximo: " + proximo;
	}

}
