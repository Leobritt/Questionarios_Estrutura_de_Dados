package listaDupla;

public class No {
	/* Ponteiro proximo */
	No proximo;
	/* Ponteiro anterior */
	No anterior;
	/* Dado a ser armazenado */
	String info;
	@Override
	public String toString() {
		return "\nNo [proximo = " + proximo + ", anterior = " + anterior + ", info = " + info + "]";
	}

}
