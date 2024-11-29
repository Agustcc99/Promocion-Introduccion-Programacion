package juegoAdivinanza;

import java.util.Scanner;

public class InteraccionUsuario {
    private Scanner scanner;

    // Constructor que inicializa el Scanner
    public InteraccionUsuario() {
        scanner = new Scanner(System.in);
    }
    

    // Método para mostrar un mensaje al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Método para cerrar el Scanner
    public void cerrarScanner() {
        scanner.close();
    }
    // Método para obtener el intento del usuario con validación de entrada.
    public int obtenerIntento() {
        System.out.print("Introduce tu intento: ");
        while (!scanner.hasNextInt()) { // Verifica si la entrada es un entero
            System.out.println("Entrada no válida. Por favor, introduce un número entero.");
            scanner.next(); // Limpia el buffer del scanner
            System.out.print("Introduce tu intento: ");
        }
        return scanner.nextInt(); // Devuelve el intento válido del usuario
    }
}

