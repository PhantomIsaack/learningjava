public class Leccion_extra_arrays_temperaturas {

    public static void main(String[] args) {
        // Declarar el array de temperaturas (7 días)
        double[] temperaturas = {21.5, 23.0, 19.8, 22.1, 24.3, 20.0, 25.1};

        // Variables para suma, máxima y mínima
        double suma = 0;
        double max = temperaturas[0];
        double min = temperaturas[0];

        // Recorrer el array
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i]);

            // Acumular suma
            suma += temperaturas[i];

            // Buscar máxima
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }

            // Buscar mínima
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
        }

        // Calcular promedio
        double promedio = suma / temperaturas.length;

        // Imprimir resultados finales
        System.out.println("Promedio semanal: " + promedio);
        System.out.println("Temperatura más alta: " + max);
        System.out.println("Temperatura más baja: " + min);
    }
}
