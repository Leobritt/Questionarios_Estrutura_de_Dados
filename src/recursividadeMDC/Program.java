package recursividadeMDC;

public class Program {
	public static void main(String[] args) {
		System.out.println(calculoMDC(24, 20, 0));
	}

	public static int calculoMDC(int maiorValor, int menorValor, int r) {
		r = maiorValor % menorValor;
		maiorValor = menorValor;
		menorValor = r;
		if (r == 0) {
			return maiorValor;
		} else {
			return calculoMDC(maiorValor, menorValor, r);
		}

	}

}
