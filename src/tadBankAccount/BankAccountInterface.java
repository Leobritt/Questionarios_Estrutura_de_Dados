package tadBankAccount;

public interface BankAccountInterface {
	
	Double mostraSaldo();
	
	void depositar(Double valor);
	
	Boolean sacar(Double valor);
	
	void atualizarSaldo(Double novoSaldo);
}
