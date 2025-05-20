class Estudiante {
	private String nombre;
	private int edad;
	private double promedio;
	//declaracion de los metodos por cad atributo
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int nuevoEdad){
		edad = nuevoEdad;
	}
	public  double getPromedio(){
		return promedio;
	}
	public void setPromedio(double nuevoPromedio){
		promedio = nuevoPromedio;
	}
}
public class Leccion10_practica_encapsulamiento{
	public static void main(String[] args){
		Estudiante e = new Estudiante();
		e.setNombre("Isaac");
		e.setEdad(23);
		e.setPromedio(99.1);

		System.out.println("Promedio: " + e.getPromedio());
		System.out.println("edad: " + e.getEdad());
		System.out.println("Nombre: " + e.getNombre());
	}
}
