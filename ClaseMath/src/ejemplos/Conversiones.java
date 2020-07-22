package ejemplos;

import java.util.Scanner;

public class Conversiones {

    public static void main(String[] args) {
        int select;
        System.out.println("escriba 1 para convertir de grados a radianes");
        System.out.println("escriba 2 para convertir de radianes a grados");
        System.out.print("Su eleccion es :");
        Scanner seleccion = new Scanner(System.in);
        select = seleccion.nextInt();
        if (select == 1) {
            // convierte angulo a radianes
            double grados;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese angulo en grados: ");
            grados = entrada.nextDouble();
            double radianes = Math.toRadians(grados);
            System.out.println("Los " + grados + "°" + " en radianes es: " + radianes + "rad");
        } else {
            if (select == 2) {
                double radianes;
                System.out.print("ingrese angulo en radianes : ");
                Scanner entrada = new Scanner(System.in);
                radianes = entrada.nextDouble();
                double grados = Math.toDegrees(radianes);
                System.out.println("Los " + radianes + " rad" + " en grados es: " + grados + "°");

            } else {
                System.out.println("intente nuevamente, y seleccione 1 o 2");
            }
        }
        /*
        switch (select) {

            case 1:
                // Codigo 
                break;

            case 2:
                // Codigo 2 
                break;

            default:
                // Codigo que se ejecuta si select vale cualquier otra cosa 
                break;
        }
         */
    }
}
