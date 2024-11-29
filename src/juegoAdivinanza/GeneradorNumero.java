package juegoAdivinanza;

import java.util.Random;

public class GeneradorNumero {
    private int numeroAleatorio;

    // Constructor que acepta un parámetro de rango
    public GeneradorNumero(int rango) {
        Random rand = new Random();
        // Genera un número aleatorio entre 1 y rango
        this.numeroAleatorio = rand.nextInt(rango) ;
    }

    // Método para obtener el número aleatorio generado.
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }
}
