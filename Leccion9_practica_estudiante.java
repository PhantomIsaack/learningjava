//declarar la clase
class Estudiante{
	String nombre;
	int edad;
	double promedio;

	//declarar el constructor
	public Estudiante (String nombre, int edad, double promedio){
	this.nombre = nombre;
	this.edad = edad;
	this.promedio = promedio;

	}

		//declarar metodo
		public void mostrar(){
			System.out.println("nombre: " + nombre + "| edad: " + edad + "| promedio: " + promedio);
		}
}

//metodo principal
public class Leccion9_practica_estudiante{
	public static void main(String[] args){
		Estudiante a = new Estudiante("Juan", 20, 9.2);
		a.mostrar();

	}
}
