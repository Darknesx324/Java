import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpleadoTest {

  @Test
  public void testToString() {
    Empleado empleado = new Empleado("Juan Perez", 2500, LocalTime.of(8, 0));
    String expectedOutput = "Empleado{nombre='Juan Perez', salario=2500.0, horaIngreso=08:00}";
    assertEquals(expectedOutput, empleado.toString());
  }

}

public void testSumaSalariosCasillasVerdesFail() {
    Empleado[][] empleados = new Empleado[2][2];
    empleados[0][0] = new Empleado("Empleado 1", 1000, LocalTime.now());
    empleados[0][1] = new Empleado("Empleado 2", 2000, LocalTime.now());
    empleados[1][0] = new Empleado("Empleado 3", 3000, LocalTime.now());
    empleados[1][1] = new Empleado("Empleado 4", 4000, LocalTime.now());

    double sumaSalarios = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            if ((i + j) % 2 == 0) { 
                sumaSalarios += empleados[i][j].getSalario();
            }
        }
    }

    // Comprobamos que la suma sea diferente de 5000, que es el valor esperado para las casillas verdes.
    assertNotEquals(5000, sumaSalarios);
}
