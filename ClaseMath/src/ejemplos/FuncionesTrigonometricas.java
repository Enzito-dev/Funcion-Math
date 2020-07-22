
package ejemplos;
import  java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");//limita los decimales
        
        double resultado = 0 ;
        double grados;
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese angulo: ");
        grados = entrada.nextDouble();
        double radianes = Math.toRadians(grados);
        
        //calcular el seno
        resultado = Math.sin(radianes);
        System.out.println("El seno de: " + grados + "°" + " = " + df.format(resultado));
        resultado = Math.cos(radianes);
        System.out.println("El coseno de: " + grados + "°" + " = " + (double)Math.round(resultado * 1000d)/1000);
        resultado = Math.tan(radianes);
        System.out.println("La tangente de: " + grados + "°" + " = " + String.format("%2f", resultado));
        // el arco coseno es Math.acos igual para las otras
        
        BigDecimal bd = new BigDecimal(resultado);//formas para mostrar con un limite de decimales
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        System.out.println("La tangente de: " + grados + "°" + " = " + bd.doubleValue());
    }
    
}
