package recurssividadeSum;

public class Program {

	public static void main(String[] args) {
		System.out.println(somatorio(10));

	}
	public static int somatorio(int sum) {
		if (sum == 0 || sum == 1) {
			return sum;
			
		}else {
			return sum + somatorio(sum - 1);
		}
	}
}
