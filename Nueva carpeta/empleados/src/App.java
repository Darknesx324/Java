import java.time.LocalTime;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       


        int rows, cols;
        rows = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de filas de la matriz: "));
        cols = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de columnas de la matriz: "));

        

        Empleado[][] empleados = new Empleado[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String nombre;
                double salario;
                JOptionPane.showMessageDialog(null, "Ingrese los datos del empleado para la posición [" + i + "][" + j + "]");
                nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));

                LocalTime horaIngreso = LocalTime.now(); 

                empleados[i][j] = new Empleado(nombre, salario, horaIngreso);

                if (salario < 0) {
                    JOptionPane.showMessageDialog(null, "El salario no puede ser negativo. Intente nuevamente.");
                    j--;
                }
            }
        }

      
        double sumaSalarios = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) { 
                    sumaSalarios += empleados[i][j].getSalario();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de los salarios de los empleados en casillas verdes es: " + sumaSalarios);

        
        Empleado empleadoMayorSalario = null;
        double mayorSalario = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) { 
                    if (empleados[i][j].getSalario() > mayorSalario) {
                        mayorSalario = empleados[i][j].getSalario();
                        empleadoMayorSalario = empleados[i][j];
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El empleado con el mayor salario en casillas verdes es: " + empleadoMayorSalario);
    }
}

