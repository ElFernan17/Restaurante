package home.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		
Plato platoA = new Plato();
		
		System.out.println("................Plato Creado:................");
		
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		
		System.out.println("................Plato Valores Asignados:................ ");
		
		platoA.nombre = "SuperBurguer";
		platoA.tipo = "Hamburguesa";
		platoA.precio = (float) 7.50;
		platoA.disponible = true;
		
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		
Plato platoB = new Plato();
		
		System.out.println("................Plato Creado:................");
		
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		
		System.out.println("................Plato Valores Asignados:................ ");
		
		platoB.nombre = "TurboCombo";
		platoB.tipo = "Combo";
		platoB.precio = (float) 10;
		platoB.disponible = true;
		
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		
Plato platoC = new Plato();
		
		System.out.println("................Plato Creado:................");
		
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);
		
		System.out.println("................Plato Valores Asignados:................ ");
		
		platoC.nombre = "SalchiBurger";
		platoC.tipo = "Combo";
		platoC.precio = (float) 9.50;
		platoC.disponible = false;
		
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);
		
		
	}
	
	

}
