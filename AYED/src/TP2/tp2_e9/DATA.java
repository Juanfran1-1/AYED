package TP2.tp2_e9;

public class DATA {
	private int suma;
	private int diferencia;
	
	public DATA(int suma, int diferencia) {
		this.suma = suma;
		this.diferencia= diferencia;
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public int getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
	}

	@Override
	public String toString() {
		return "DATA [suma=" + suma + ", diferencia=" + diferencia + "]";
	}
	
	
}
