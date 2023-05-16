import java.util.InputMismatchException;

public class CalculoPuntoMedioRecta {

  /**
   * Método que calcula el punto medio de una recta a partir de dos puntos.
   * Si los valores ingresados no son correctos, se generan las excepciones
   * correspondientes.
   *
   * @param x1 Coordenada x del primer punto
   * @param y1 Coordenada y del primer punto
   * @param x2 Coordenada x del segundo punto
   * @param y2 Coordenada y del segundo punto
   * @return Punto medio de la recta
   * @throws InputMismatchException Excepción que indica que los valores
   *                                ingresados deben ser numéricos
   */
  public static double[] calcularPuntoMedio(double x1, double y1, double x2, double y2) {
    try {
      double puntoMedioX = (x1 + x2) / 2;
      double puntoMedioY = (y1 + y2) / 2;
      return new double[] { puntoMedioX, puntoMedioY };
    } catch (InputMismatchException e) {
      System.out.println("Los valores ingresados deben ser numéricos");
    }
    return null;
  }
}
