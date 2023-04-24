package recursividadeListaTreino;

public class ArraySum {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;

		System.out.println(sumArray(3, array));
	}

	public static int sumArray(int n, int[] array) {
		if (n == 0) {
			return 0;
		} else {
			return array[n - 1] + sumArray(n - 1, array);
		}
	}

}
