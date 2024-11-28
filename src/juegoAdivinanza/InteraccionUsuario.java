package juegoAdivinanza;

import java.util.Scanner;

public class InteraccionUsuario {
    private Scanner scanner;

    // Constructor que inicializa el Scanner
    public InteraccionUsuario() {
        scanner = new Scanner(System.in);
    }

    // Método para obtener el intento del usuario
    public int obtenerIntento() {
        System.out.print("Introduce tu intento: ");
        return scanner.nextInt();
    }

    // Método para mostrar un mensaje al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Método para cerrar el Scanner
    public void cerrarScanner() {
        scanner.close();
    }
}
