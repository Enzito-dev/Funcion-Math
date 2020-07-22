package ejemplos;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoRaiz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese numero a calcular raiz: ");
        double numero;
        numero = entrada.nextDouble();
        double resultado;
        resultado = Math.sqrt(numero);
        //limita los decimales a 3
        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        System.out.println("El resultado es: " + bd.doubleValue());

    }
}
