import java.util.InputMismatchException;
import java.util.Scanner;

public class CálculosNuméricos {
    /**
    * Método que calcula el logaritmo neperiano de un valor numérico.
    * Si el valor pasado como parámetro no es correcto se genera la
    * excepción correspondiente
    * @param valor Parámetro que define el valor al cual se le calculará
    * el logaritmo neperiano
    * @throws ArithmeticException Excepción aritmética que indica
    * que el número debe ser positivo
    * @throws InputMismatchException Excepción que indica que el
    * valor ingresado debe ser numérico
    */
    static void calcularLogaritmoNeperiano(double valor) {
        try {
            if (valor < 0) {
                // Si el valor es negativo, se genera una excepción aritmética
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            // Si el valor es positivo, se calcula el algoritmo neperiano
            double resultado = Math.log(valor);
            
            System.out.println("Resultado = " + resultado);
        } catch (ArithmeticException e) {
            /* Si ocurre una excepción aritmética, se muestra un mensaje
            de error */
            System.out.println("El valor debe ser un número positivo para calcular el logaritmo");
        } catch (InputMismatchException e) {
            /* Si el valor a calcular no es numérico, se muestra un mensaje de error */
            System.out.println("El valor debe ser numérico para calcular el logaritmo");
        }
    }
    /**
    * Método que calcula la raíz cuadrada de un valor numérico. Si el
    * valor pasado como parámetro no es correcto se genera la
    * excepción correspondiente
    * @param valor Parámetro que define el valor al cual se le calculará
    * la raíz cuadrada
    * @throws ArithmeticException Excepción aritmética que indica
    * que el número debe ser positivo
    * @throws InputMismatchException Excepción que indica que el
    * valor ingresado debe ser numérico
    */
    static void calcularRaízCuadrada(double valor) {
        try {
            if (valor < 0) {
                // Si el valor es negativo, se genera una excepción aritmética
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            double resultado = Math.sqrt(valor); /* Si el valor es positivo, se calcula la raíz cuadrada */
            System.out.println("Resultado = " + resultado);
        } catch (ArithmeticException e) {
            /* Si ocurre una excepción aritmética, se muestra un mensaje de error */
            System.out.println("El valor debe ser un número positivo para calcular la raíz cuadrada");
        } catch (InputMismatchException e) {
            /* Si el valor a calcular no es numérico, se muestra un mensaje de error */
            System.out.println("El valor debe ser numérico para calcular la raíz cuadrada");
        }
    }
    /**
    * Método main que solicita un valor numérico por teclado. Para
    * dicho valor se calcula el logaritmo neperiano y la raíz cuadrada. Si
    * el valor ingresado no es correcto, se generan las excepciones
    * correspondientes.
    */
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        double valor;
        double x1, y1, x2, y2;

        System.out.println("Introduce un valor para calcular el logaritmo neperiano y la raíz cuadrada:");
        try {
            valor = sc.nextDouble();
            CálculosNuméricos.calcularLogaritmoNeperiano(valor);
            CálculosNuméricos.calcularRaízCuadrada(valor);
        } catch (InputMismatchException e) {
            System.out.println("El valor debe ser numérico");
        }

        System.out.println("Introduce las coordenadas x e y del primer punto:");
        try {
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            System.out.println("Introduce las coordenadas x e y del segundo punto:");
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            double pendiente = CalculoPendienteRecta.calcularPendiente(x1, y1, x2, y2);
            System.out.println("La pendiente de la recta que pasa por los puntos (" + x1 + ", " + y1 + ") y (" + x2
                    + ", " + y2 + ") es: " + pendiente);
        } catch (InputMismatchException e) {
            System.out.println("Las coordenadas deben ser numéricas");
        }
        System.out.println("Introduce un valor para convertir a otra base:");
        try {
            valor = sc.nextDouble();
            System.out.println("Introduce la base a la que deseas convertir el número:");
            int base = sc.nextInt();
            ConversionNumerica.convertirNumero(valor, base);
        } catch (InputMismatchException e) {
            System.out.println("El valor y la base deben ser numéricos");
        }

         System.out.println("Introduce los coeficientes de la ecuación cuadrática ax^2 + bx + c = 0:");
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            CalculoRaices.calcularRaices(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Los coeficientes deben ser numéricos");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }

    }

        
    }
