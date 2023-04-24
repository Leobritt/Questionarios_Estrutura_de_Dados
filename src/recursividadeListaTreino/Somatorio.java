package recursividadeListaTreino;

public class Somatorio {

	public static void main(String[] args) {
		System.out.println(calculoSum(3, 10));

	}
	public static int calculoSum(int n, int sum) {
		if (n == 0) {
			return 0;
		}else {
			return sum + calculoSum(n - 1, sum);
		}
	}

}
