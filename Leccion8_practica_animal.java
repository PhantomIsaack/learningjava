//la siguiente clase "animal" deebe de ser colocada en otro archivo y porner el public
class Animal {

String nombre;
String especie;
int edad;

	public void presentarse(){
		System.out.println("Hola soy un: " + especie + "y me llamo: " + nombre + ". Tengo:" + edad + "años");

	}
}

public class Leccion8_practica_animal {
	public static void main(String[] args) {
    Animal a1 = new Animal();
    a1.nombre = "Toby";
    a1.especie = "Perro";
    a1.edad = 5;

    Animal a2 = new Animal();
    a2.nombre = "Michi";
    a2.especie = "Gato";
    a2.edad = 3;

    a1.presentarse();
    a2.presentarse();

	}
}
