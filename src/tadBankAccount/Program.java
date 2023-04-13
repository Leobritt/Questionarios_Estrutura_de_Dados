package tadBankAccount;

public class Program {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(3000.0);
		b1.depositar(100.0);
		b1.mostraSaldo();
		b1.sacar(40.0);
		b1.mostraSaldo();
		
	}

}
