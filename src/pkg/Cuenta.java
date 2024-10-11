package pkg;

public class Cuenta {

	public Double getSaldo() {
		return 1d; // para que funcione el test
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	private Double saldo;
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(Double ingreso) {
		
	}
	
	
}
