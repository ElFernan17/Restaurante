package home.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		v = new Vehiculo();
		
		System.out.println("Hola mundo");
		
		System.out.println("Año: " + v.año);
		
		System.out.println("Marca: " + v.marca);
		
		System.out.println("Modelo: " + v.modelo);
		
		System.out.println(".......Vehiculo 1 Valores asignados...........");
		
		
		v.año = "2013";
		v.marca = "chevrolet";
		v.modelo = "spark";
		
		
		System.out.println("Año: " + v.año);
		
		System.out.println("Marca: " + v.marca);
		
		System.out.println("Modelo: " + v.modelo);

		
		System.out.println(".......Vehiculo 2 Creado...........");
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: " + v2.año);
		
		System.out.println("Marca: " + v2.marca);
		
		System.out.println("Modelo: " + v2.modelo);
		
		v2.año = "2026";
		v2.marca = "mazda";
		v2.modelo = "3";
		
		System.out.println(".......Vehiculo 2 Valores asignado...........");

		
		System.out.println("Año: " + v2.año);
		
		System.out.println("Marca: " + v2.marca);
		
		System.out.println("Modelo: " + v2.modelo);
	}

}
