package home.krakedev;

public class RectanguloTest {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();

		r1.altura = 5;
		r1.base = 4;
		
		int resultado = r1.calcularArea();
		
		double resultadoPerimetro = r1.calcularPerimetro();
		
		System.out.println("resultado area rectangulo= " + resultado);
		
		System.out.println("resultado perimetro rectangulo= " + resultadoPerimetro);
		
		
		
		Rectangulo r2 = new Rectangulo();
		
		r2.altura = 8;
		r2.base = 2;
		
		int resultado2 = r2.calcularArea();
		
		double resultadoPerimetro2 = r2.calcularPerimetro();
		
		System.out.println("resultado area rectangulo2 = " + resultado2);
		
		System.out.println("resultado perimetro rectangulo2= " + resultadoPerimetro2);
	}

}