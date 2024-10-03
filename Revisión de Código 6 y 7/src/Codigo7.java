import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

    public static void main(String[] args) {
        // Corregí la creación del Scanner
        Scanner s = new Scanner(System.in);  

        // Corregí el tipo de HashMap para almacenar países y capitales
        HashMap<String, String> ca = new HashMap<>();  

        // Corregí la inserción de pares clave-valor en el HashMap
        ca.put("Canadá", "Ottawa");
        ca.put("Estados Unidos", "Washington DC");
        ca.put("México", "Ciudad de México");
        ca.put("Belice", "Belmopán");
        ca.put("Costa Rica", "San José");
        ca.put("El Salvador", "San Salvador"); // Corregí el nombre de la capital
        ca.put("Guatemala", "Ciudad de Guatemala");
        ca.put("Honduras", "Tegucigalpa");
        ca.put("Nicaragua", "Managua");
        ca.put("Panamá", "Panamá");

        // Corregí el tipo de dato y la inicialización de la variable c
        String c = "";

        // Corregí el ciclo do-while para preguntar sobre países
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine();  // Corregí para que lea una cadena

            // Condición para salir del ciclo
            if (!c.equals("salir")) {
                // Corregí para comprobar si el país está en el HashMap
                if (ca.containsKey(c)) {
                    // Corregí la impresión de la capital del país
                    System.out.println("La capital de " + c + " es " + ca.get(c));
                } else {
                    // Mensaje cuando el país no está en el HashMap
                    System.out.print("No conozco la respuesta. ");
                    System.out.print("¿Cuál es la capital de " + c + "?: ");
                    String capitalNueva = s.nextLine();  // Corregí para que lea la nueva capital
                    ca.put(c, capitalNueva);  // Corregí la inserción de la nueva capital
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        // Corregí la condición del ciclo while
        } while (!c.equals("salir"));

        // Cerré el Scanner para evitar fugas de recursos
        s.close();
    }
}