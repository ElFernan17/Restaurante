package home.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		System.out.println("................Restaurante Creado:................");
		
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		System.out.println("................Restaurante Valores Asignados:................ ");
		
		rest1.nombre = "SuperSalchis";
		rest1.direccion = "calle sucre y Quito";
		rest1.calificacion = (float) 3.5;
		

		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		Restaurante rest2 = new Restaurante();

		System.out.println("................Restaurante Creado:................ ");
		
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
		
		System.out.println("................Restaurante Valores Asignados:................ ");
		
		rest2.nombre = "TurboBurgers";
		rest2.direccion = "Calle roca y Bolivar";
		rest2.calificacion = (float) 4.1;
		

		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
		
		//................
		
	}

}
