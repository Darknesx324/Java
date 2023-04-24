import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CirculoTest {

  @Test
  public void testConstructor() {
    Circulo c = new Circulo(0, 0, 5);
    assertEquals(0, c.centro.getX());
    assertEquals(0, c.centro.getY());
    assertEquals(5, c.getRadio());
  }

  @Test
  public void testGetRadio() {
    Circulo c = new Circulo(0, 0, 5);
    assertEquals(5, c.getRadio());
  }

  @Test
  public void testSetRadio() {
    Circulo c = new Circulo(0, 0, 5);
    c.setRadio(10);
    assertEquals(10, c.getRadio());
  }

  @Test
  public void testImprimir() {
    // Debido a que la salida se escribe en la consola, no se puede verificar
    // directamente
    // Se verifica que la llamada al método no genere excepciones
    Circulo c = new Circulo(0, 0, 5);
    c.imprimir();
  }
}
