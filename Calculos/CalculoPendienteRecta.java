import java.util.InputMismatchException;

public class CalculoPendienteRecta {

  /**
   * Método que calcula la pendiente de una recta a partir de dos puntos.
   * Si los valores ingresados no son correctos, se generan las excepciones
   * correspondientes.
   *
   * @param x1 Coordenada x del primer punto
   * @param y1 Coordenada y del primer punto
   * @param x2 Coordenada x del segundo punto
   * @param y2 Coordenada y del segundo punto
   * @return Pendiente de la recta
   * @throws ArithmeticException    Excepción aritmética que indica que el
   *                                denominador debe ser distinto de cero
   * @throws InputMismatchException Excepción que indica que los valores
   *                                ingresados deben ser numéricos
   */
  public static double calcularPendiente(double x1, double y1, double x2, double y2) {
    try {
      if (x2 - x1 == 0) {
        throw new ArithmeticException("El denominador no puede ser cero");
      }
      double pendiente = (y2 - y1) / (x2 - x1);
      return pendiente;
    } catch (ArithmeticException e) {
      System.out.println("Error al calcular la pendiente: " + e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Los valores ingresados deben ser numéricos");
    }
    return Double.NaN;
  }
}
