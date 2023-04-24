package recursividadeListaTreino;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(calculoFibo(20));
	}
	public static int calculoFibo(int n1) {
		if (n1 == 0 || n1 == 1) {
			return n1;
		}else {
			return calculoFibo(n1 - 1) + calculoFibo(n1 - 2);
		}
	}

}
