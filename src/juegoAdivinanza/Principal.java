package juegoAdivinanza;

public class Principal {
    // Atributos de la clase Principal
    private GeneradorNumero generadorNumero;
    private InteraccionUsuario interaccionUsuario;
    private int intentosRestantes;
    private static final int MAX_INTENTOS = 5;

    public static void main(String[] args) {
        // Crea una Objeto de la clase Principal con un rango de 100
        Principal juego = new Principal(100);
        // Llama al método iniciarJuego para comenzar el juego
        juego.iniciarJuego();
    }

    // Constructor que acepta un rango
    public Principal(int rango) {
        generadorNumero = new GeneradorNumero(rango); // Inicializa generadorNumero con el rango
        interaccionUsuario = new InteraccionUsuario(); // Inicializa interaccionUsuario
        intentosRestantes = MAX_INTENTOS; // Inicializa intentosRestantes con el número máximo de intentos
    }

    // Método para iniciar el juego
    public void iniciarJuego() {
        boolean adivinado = false;
        // Llama al método getNumeroAleatorio para obtener el número aleatorio generado
        int numeroAleatorio = generadorNumero.getNumeroAleatorio();

        interaccionUsuario.mostrarMensaje("¡Bienvenido al juego de adivinar el número!");
        interaccionUsuario.mostrarMensaje("Tienes " + MAX_INTENTOS + " intentos para adivinar el número entre 1 y 100.");
        // Bucle principal
        while (intentosRestantes > 0 && !adivinado) { // Continúa el bucle mientras haya intentos restantes

            int intento = interaccionUsuario.obtenerIntento(); // Solicita un intento al usuario con validación usando hasNextInt()

            if (intento == numeroAleatorio) { // Verifica si el número no ha sido adivinado
                adivinado = true;
            } else if (intento < numeroAleatorio) {
                interaccionUsuario.mostrarMensaje("Demasiado bajo.");
            } else {
                interaccionUsuario.mostrarMensaje("Demasiado alto.");
            }

            intentosRestantes--; // Decrementa el contador de intentos restantes.
        }

        if (adivinado) {
            interaccionUsuario.mostrarMensaje("¡Felicidades! Has adivinado el número.");
        } else {
            interaccionUsuario.mostrarMensaje("Lo siento, te has quedado sin intentos. El número era: " + numeroAleatorio);
        }

        interaccionUsuario.cerrarScanner(); // Cierra el Scanner al final del juego
    }

}
