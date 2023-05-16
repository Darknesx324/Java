import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoRaices {
  /**
    * Método que calcula las raíces de una ecuación cuadrática de la forma
    * ax^2 + bx + c = 0. Si los coeficientes ingresados no son correctos se
    * generan las excepciones correspondientes.
    * @param a Coeficiente de x^2
    * @param b Coeficiente de x
    * @param c Término independiente
    * @throws ArithmeticException Excepción aritmética que indica
    * que el coeficiente a debe ser diferente de cero
    * @throws InputMismatchException Excepción que indica que los
    * coeficientes ingresados deben ser numéricos
    * @throws Exception Excepción general en caso de errores no previstos
    */
    static void calcularRaices(double a, double b, double c) {
        try {
            if (a == 0) {
                // Si el coeficiente a es cero, se genera una excepción aritmética
                throw new ArithmeticException("El coeficiente a debe ser diferente de cero");
            }
            double discriminante = Math.pow(b, 2) - 4 * a * c;
            if (discriminante < 0) {
                // Si el discriminante es negativo, se genera una excepción aritmética
                throw new ArithmeticException("La ecuación no tiene raíces reales");
            }
            double raizDiscriminante = Math.sqrt(discriminante);
            double x1 = (-b + raizDiscriminante) / (2 * a);
            double x2 = (-b - raizDiscriminante) / (2 * a);
            System.out.println("Las raíces de la ecuación son x1 = " + x1 + " y x2 = " + x2);
        } catch (ArithmeticException e) {
            /* Si ocurre una excepción aritmética, se muestra un mensaje de error */
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            /* Si los coeficientes ingresados no son numéricos, se muestra un mensaje de error */
            System.out.println("Los coeficientes deben ser numéricos");
        } catch (Exception e) {
            /* Si ocurre una excepción no prevista, se muestra un mensaje de error general */
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
  }
