package tadBankAccount;

public class BankAccount implements BankAccountInterface {

	private Double saldo;

	public BankAccount() {
		super();
	}

	public BankAccount(Double saldo) {
		super();
		this.saldo = 0.0;
	}

	
	@Override
	public Double mostraSaldo() {
		System.out.println(saldo);
		return saldo;
	}

	@Override
	public void depositar(Double valor) {
		atualizarSaldo(saldo+= valor);
		
	}

	@Override
	public Boolean sacar(Double valor) {
		if (saldo <= valor) {
			System.out.println("Saldo insuficiente "+saldo);
			return false;
		} else {
			saldo -= valor;
			atualizarSaldo(saldo);
			return true;
		}
		
	}

	@Override
	public void atualizarSaldo(Double novoSaldo) {
		saldo = novoSaldo;
	}

	@Override
	public String toString() {
		return "Bank Account\nsaldo: " + saldo;
	}
}
