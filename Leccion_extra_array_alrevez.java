public class Leccion_extra_array_alrevez{
	public static void main(String[] args){
		String[] dias={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		/*usamos el for igualando la y a la logitud del array*/
		for(int i=dias.length - 1; i>=0; i--){
		System.out.println("Dia de la semana:" + dias[i]);
		}



	}
}
