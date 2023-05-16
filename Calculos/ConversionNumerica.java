

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionNumerica {
/**
* Método que convierte un número en base 10 a un número en base b.
* Si el valor pasado como parámetro no es correcto se genera la
* excepción correspondiente
* @param valor Parámetro que define el valor al cual se le calculará
* el logaritmo neperiano
* @param base Parámetro que define la base en la que se quiere convertir el número
* @throws IllegalArgumentException Excepción que indica que la base debe ser mayor o igual a 2
* @throws InputMismatchException Excepción que indica que el
* valor ingresado debe ser numérico
*/
static void convertirNumero(double valor, int base) {
try {
if (base < 2) {
// Si la base es menor que 2, se genera una excepción
throw new IllegalArgumentException("La base debe ser mayor o igual a 2");
}
String resultado = "";
while (valor > 0) {
double resto = valor % base;
resultado = resto + resultado;
valor = valor / base;
}
     System.out.println("Resultado en base " + base + " = " + resultado);
    } catch (IllegalArgumentException e) {
        /* Si la base es menor que 2, se muestra un mensaje de error */
        System.out.println("La base debe ser mayor o igual a 2 para realizar la conversión");
    } catch (InputMismatchException e) {
        /* Si el valor a convertir no es numérico, se muestra un mensaje de error */
        System.out.println("El valor debe ser numérico para realizar la conversión");
    }
}
}
