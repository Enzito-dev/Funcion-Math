package ejemplos.matrices;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int resultado[][] = new int[3][3];
        int select;
        String caracter = "";//guardo el simbolo del caso resuelto 
        Scanner entrada = new Scanner(System.in);

        //llenado matriz uno
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 9);
            }
        }

        //llenado segunda matriz
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 9);
            }
        }
        System.out.println("presione: 1 para sumar matrices - 2 para restar matrices: ");
        // suma y resta
        select = entrada.nextInt();
        switch (select) {

            case 1:
                caracter = "+";
                for (int i = 0; i < matriz_uno.length; i++) {
                    for (int j = 0; j < matriz_uno.length; j++) {
                        resultado[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                    }
                }

                break;

            case 2:
                caracter = "-";
                for (int i = 0; i < matriz_uno.length; i++) {
                    for (int j = 0; j < matriz_uno.length; j++) {
                        resultado[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
                    }
                }

                break;

            default:
                System.out.println("Ingreso erroneo, por favor vuelva a ingresar un numero");
                System.out.println("arreglar esta parte");
                break;

        }

        // imprimo matrices
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {//matriz uno
                System.out.print("[" + matriz_uno[i][j] + "]");
            }
            if (i == 1) {
                System.out.print("  " + caracter + "  ");
            } else {
                System.out.print("     ");
            }
            for (int j = 0; j < matriz_dos.length; j++) {//matriz dos
                System.out.print("[" + matriz_dos[i][j] + "]");
            }

            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }

            for (int j = 0; j < resultado.length; j++) {//matriz resultado
                System.out.print("[" + resultado[i][j] + "]");
            }

           System.out.println("");// para que de un salto de linea

        }

    }
}
