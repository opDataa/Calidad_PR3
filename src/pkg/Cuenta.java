package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	
	private String nombre;
	private String numero; // numero Cuenta
	private Double saldo;
	
	
	private List<Movimientos> movimientosList = new ArrayList<Movimientos>(); // Cada operacion registra un 'Movimiento' se realice o no al final
	
	
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
		this.movimientosList.add(new Movimientos());
		
		this.saldo += ingreso;
	}
	
	public void retirar(Double ingreso) {
		this.movimientosList.add(new Movimientos());
		
		if(this.saldo-ingreso >= -500d) {
			this.saldo-= ingreso;
		}
		else {
			System.out.println("Dondos insuficientes (saldo "+this.saldo+") en  la cuenta"+ this.numero+" para el reintegro de "+ingreso+ "€ ("+(movimientosList.size()+")"));
		}
		
	
	}
	
	
}
