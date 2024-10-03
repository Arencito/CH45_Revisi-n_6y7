public class Codigo6 {
  
    // Corregí la creación del arreglo de 20 elementos
    int[] n = new int[20]; {

    // Corregí el ciclo para que incremente correctamente y llene el arreglo
    for (int i = 0; i < 20; i++) {
        n[i] = (int)(Math.random() * 381) + 20; 
        // Corregí el método de impresión para mostrar los números
        System.out.print(n[i] + " "); 
    }

    // Corregí el texto y la estructura para preguntar al usuario qué resaltar
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

    // Corregí la lectura de la opción del usuario
    int opcion = Integer.parseInt(System.console().readLine()); 

    // Corregí la selección de múltiplos entre 5 y 7 según la opción elegida
    int multiplo = (opcion == 1) ? 5 : 7; 

    // Corregí el bucle para que recorra correctamente el arreglo
    for (int e : n) { 
        // Corregí la condición para resaltar los múltiplos entre corchetes
        if (e % multiplo == 0) {
            System.out.print("[" + e + "] ");
        } else {
            // Corregí la impresión para los números que no son múltiplos
            System.out.print(e + " "); 
        }
    }
}
}
