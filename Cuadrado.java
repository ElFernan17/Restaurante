package home.krakedev;

public class Cuadrado {
	public int lado;
	
	public double calcularArea() {
		double resultadoArea;
		
		resultadoArea = lado * lado;
		
		
		return resultadoArea;
	}
	
	public double calcularPerimetro() {
		double resultadoPerimetro;
		
		resultadoPerimetro = lado * 4;
		
		return resultadoPerimetro;
	}
}
