package ejemplos.numerosAleatorios;

import java.util.Random; // trabaja con double es necesario hacer un sating si utilizamos int

public class Clase_dos {

    public static void main(String[] args) {
        int aleatorio = 0;
        Random r = new Random();
        aleatorio = (int) (r.nextInt()* 100);
        System.out.println("El numero aleatorio es: " + aleatorio);
        
    }
}
