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

	}

}
