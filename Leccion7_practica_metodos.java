public class Leccion7_practica_metodos{
	public static void saludarUsuario(){
		System.out.println("Hola usuario");
	}
	public static int multiplicar(int a, int b){
		return a*b;
	}
	public static void main (String[] args){

		saludarUsuario();
		//asignaciomn del return a una variable
		int resultado = multiplicar(5,5);
		System.out.println("Resultado: "+ resultado);
		System.out.println(multiplicar(5,5));
	}
}
