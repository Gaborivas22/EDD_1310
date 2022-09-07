package main;

public final class Trabajador {
	private int numeroTrabajador;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private int horaExtra;
	private float sueldo;
	private int anoIngreso;

	public Trabajador() {

	}

	public Trabajador(int numeroTrabajador, String nombre, String apellidoPat, String apellidoMat, int horaExtra,
			float sueldo, int anoIngreso) {
		this.numeroTrabajador = numeroTrabajador;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.horaExtra = horaExtra;
		this.sueldo = calcularSueldo(horaExtra, anoIngreso, sueldo);
		this.anoIngreso = anoIngreso;
	}

	public float calcularSueldo(int hora, int ano, float sueldo) {
		int difAno = 2022 - ano;
		for (int i = 0; i < difAno; i++) {

			sueldo *= 1.03;
		}
		if (hora > 0) {
			sueldo += hora * (276.5);

		}
		return sueldo;
	}

	public int getNumeroTrabajador(int num) {
		return numeroTrabajador = num;
	}

	public void setNumeroTrabajador(int numeroTrabajador) {
		this.numeroTrabajador = numeroTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public int getAnoIngreso() {
		return anoIngreso;
	}

	public void setAnoIngreso(int anoIngreso) {
		this.anoIngreso = anoIngreso;
	}

	@Override
	public String toString() {
		return "Trabajador{" + "numeroTrabajador=" + numeroTrabajador + ", nombre=" + nombre + ", apellidoPat="
				+ apellidoPat + ", apellidoMat=" + apellidoMat + ", horaExtra=" + horaExtra + ", sueldo=" + sueldo
				+ ", anoIngreso=" + anoIngreso + '}';
	}

	public static final double MONTO_H_EXTRA = 276.50;
	public static final double PRESTACION = 0.03;

	public double calcularSueldo() {

		double total = 0.03;
		total = sueldo + (MONTO_H_EXTRA * horaExtra);
		return total;
	}

}
