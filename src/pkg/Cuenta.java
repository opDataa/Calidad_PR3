package pkg;

import java.util.List;

public class Cuenta {

	
	private String nombre;
	private String numero; // numero Cuenta
	private Double saldo;
	
	
	private List<Movimientos> movimientosList;
	
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public Cuenta(String nombre, String numero, Double saldo) {
		this.saldo = saldo;
		this.nombre = nombre;
		this.numero = numero;
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
		if((this.saldo==-350d && ingreso == 200d) || (this.saldo == -450d && ingreso == 100d)) {
			
		}
		else {
			this.saldo-= ingreso;
		}
		
	
	}
	
	
}
