/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListEdD;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Palabras {
private static ArrayList<String> cadenas;

    public static void main(String[] args) {
        cadenas = new ArrayList<>();
        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    agregarPalabra();
                    break;
                case 2:
                    mostrarPalabras();
                    break;
                case 3:
                    modificarPalabra();
                    break;
                case 4:
                    eliminarPalabra();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static int menu() {
        String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n"
                + "1. Añadir palabra\n"
                + "2. Mostrar palabras\n"
                + "3. Modificar palabra\n"
                + "4. Eliminar palabra\n"
                + "5. Salir");
        return Integer.parseInt(opcion);
    }

    private static void agregarPalabra() {
        String texto, respuesta;
        do {
            texto = JOptionPane.showInputDialog("Ingrese una frase: ");
            cadenas.add(texto);
            respuesta = JOptionPane.showInputDialog("¿Desea ingresar otra frase? (SI/NO)");
        } while (respuesta.equalsIgnoreCase("SI"));
    }

    private static void mostrarPalabras() {
        JOptionPane.showMessageDialog(null, "Frases ingresadas:\n" + cadenas.toString());
    }

    private static void modificarPalabra() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la frase a modificar: "));
        String nuevaPalabra = JOptionPane.showInputDialog("Ingrese la nueva frase: ");
        cadenas.set(indice - 1, nuevaPalabra);
        JOptionPane.showMessageDialog(null, "La frase fue modificada exitosamente.");
    }

    private static void eliminarPalabra() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la frase a eliminar: "));
        cadenas.remove(indice - 1);
        JOptionPane.showMessageDialog(null, "La frase fue eliminada exitosamente.");
    }


}


