package recursividadeListaTreino;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println(calculoFat(5));
	}
	
	public static int calculoFat(int n) {
		if (n == 0 || n == 1) {
			return n;
		}else {
			return n * calculoFat(n -1);
		}
	}
}
