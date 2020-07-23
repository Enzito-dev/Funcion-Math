
package ejemplos.numerosAleatorios;


public class Clase_uno {
    public static void main(String[] args) {
        int aleatorio = 0 ;
        aleatorio = (int) (Math.random() * 100); //devuelve double la funcion math pero necesito un entero
        //---------->esta convirtiendo de double a int
        // el 100 indica el rando maximo del numero aleatorio
        System.out.println("El numero aleatorio es: " + aleatorio );
        
        
    }
}
