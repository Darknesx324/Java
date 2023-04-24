import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Test;

public class PoligonoTest {

  @Test
  public void testConstructor() {
    ArrayList<Punto> puntos = new ArrayList<>();
    puntos.add(new Punto(0, 0));
    puntos.add(new Punto(0, 5));
    puntos.add(new Punto(5, 0));
    Poligono p = new Poligono("Triangulo", puntos);
    assertEquals("Triangulo", p.nombre);
    assertEquals(3, p.puntos.size());
  }

  @Test(expected = IllegalArgumentException.class)
    public void testConstructorFail() {
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(new Punto(0, 0));
        Poligono p = new Poligono("Linea", puntos);
    }

@Test
public void testCalcularArea() {
    // Definimos los puntos del triángulo
    Punto p1 = new Punto(1,1);
    Punto p2 = new Punto(1,4);
    Punto p3 = new Punto(4,1);

    // Creamos el polígono
    ArrayList<Punto> puntos = new ArrayList<>();
    puntos.add(p1);
    puntos.add(p2);
    puntos.add(p3);
    Poligono triangulo = new Poligono("Triángulo", puntos);

    // Verificamos que el área calculada sea la esperada
    double areaEsperada = 4.5;
    double areaCalculada = triangulo.calcularArea();
    assertEquals(areaEsperada, areaCalculada, 0.01);
}

@Test
public void testCalcularPendientes() {
  // Definimos los puntos de la recta
  Punto p1 = new Punto(1, 1);
  Punto p2 = new Punto(4, 4);

  // Creamos la recta
  Recta recta = new Recta(p1, p2);

  // Redirigimos la salida estándar a un stream para poder capturarla
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  System.setOut(new PrintStream(outContent));

  // Ejecutamos el método calcularPendientes()
  recta.getPendiente();

  // Verificamos que las pendientes calculadas sean las esperadas
  String pendientesEsperadas = "Pendiente entre los puntos 0 y 1 es 1.0\n";
  assertEquals(pendientesEsperadas, outContent.toString());
}



}