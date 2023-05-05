package PK01;

import java.util.Scanner;

public class IO {

    public static int leerEntero(String mensaje) {
        Scanner lectura = new Scanner(System.in);
        int numero = 0;
        System.out.println(mensaje);
        numero = lectura.nextInt();
        return numero;
    }

    public static double leerDecimal(String mensaje) {
        Scanner lectura = new Scanner(System.in);
        double numero = 0.0;
        System.out.println(mensaje);
        numero = lectura.nextDouble();
        return numero;
    }

    public static String leerPalabra(String mensaje) {
        Scanner lectura = new Scanner(System.in);
        String palabra = "";
        System.out.println(mensaje);
        palabra = lectura.nextLine();
        return palabra;
    }

    public static char leerCaracter(String mensaje) {
        Scanner lectura = new Scanner(System.in);
        char letra = ' ';
        System.out.println(mensaje);
        letra = lectura.nextLine().charAt(0);
        return letra;
    }

    public static void escribir(String object) {
        System.out.println(object);
    }

}