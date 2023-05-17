import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {

    @Test
    public void pruebaSumaAprobada() {
        int resultado = Operaciones.sumar(3, 5);
        assertEquals(8, resultado, "La suma de 3 + 5 debe ser igual a 8");
    }

    @Test
    public void pruebaSumaFallida() {
        int resultado = Operaciones.sumar(2, 4);
        assertEquals(6, resultado, "La suma de 2 + 4 debe ser igual a 6");
    }
}

