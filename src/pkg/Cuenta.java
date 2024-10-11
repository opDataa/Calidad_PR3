package pkg;

public class Cuenta {

	private Double saldo;
	
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public void ingresar(Double ingreso) {
		this.saldo += ingreso;
	}
	
	public void retirar(Double ingreso) {
		this.saldo-= ingreso;
	}
	
	
}
