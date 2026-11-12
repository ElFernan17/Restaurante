package home.krakedev;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1;
		
		r1 = c1.sumar(7, 8);
		
		System.out.println("Resultado suma = " + r1);
		
		int r2;
			
		r2 = c1.restar(9, 6);
		
		System.out.println("Resultado resta = " + r2);
		
		double r3;
		
		r3 = c1.multiplicar(10, 5);
		
		System.out.println("Resultado multiplicacion = " + r3);
		
		double r4; 
		
		r4 = c1.dividir(10, 5);
		
		System.out.println("Resultado divicion = " + r4);
		
		double r5;
		
		r5 = c1.promediar(7, 8, 10);
		
		System.out.println("Resultado promedio = " + r5);
		
		c1.mostrarResultados();
		
		

	}

}
