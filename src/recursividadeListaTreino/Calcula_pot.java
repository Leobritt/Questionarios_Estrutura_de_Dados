package recursividadeListaTreino;

public class Calcula_pot {

	public static void main(String[] args) {
		System.out.println(calcula_pot(2, 2));
	}

	public static int calcula_pot(int base, int potencia) {
		if (potencia == 0) {
			return 1;
		}else {
			return (base * calcula_pot(base, potencia - 1));
		}
	}

}
