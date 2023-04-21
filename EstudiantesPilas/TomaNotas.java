import java.util.Stack;

import javax.swing.JOptionPane;

public class TomaNotas {

  public static void main(String[] args) {

    Stack<Estudiante> notasPendientes = new Stack<Estudiante>();

    while (true) {
      String opcion = JOptionPane.showInputDialog(null,
          "Ingrese una opción:\n1. Agregar nota\n2. Tomar nota\n3. Mostrar notas pendientes\n4. Salir",
          "Toma de notas", JOptionPane.PLAIN_MESSAGE);

      if (opcion == null || opcion.equals("4")) {
        break;
      }

      switch (opcion) {
        case "1":
          String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante", "Toma de notas",
              JOptionPane.PLAIN_MESSAGE);
          String notaNueva = JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante", "Toma de notas",
              JOptionPane.PLAIN_MESSAGE);
          Estudiante nuevoEstudiante = new Estudiante(nombre, notaNueva);
          notasPendientes.push(nuevoEstudiante);
          JOptionPane.showMessageDialog(null, "Se agregó la nota de " + nuevoEstudiante.getNombre(), "Toma de notas",
              JOptionPane.INFORMATION_MESSAGE);
          break;
        case "2":
          if (notasPendientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay notas pendientes", "Toma de notas",
                JOptionPane.INFORMATION_MESSAGE);
          } else {
            Estudiante estudianteTomado = notasPendientes.pop();
            JOptionPane.showMessageDialog(null, "Se tomó la nota de " + estudianteTomado.getNombre(), "Toma de notas",
                JOptionPane.INFORMATION_MESSAGE);
          }
          break;
        case "3":
          if (notasPendientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay notas pendientes", "Toma de notas",
                JOptionPane.INFORMATION_MESSAGE);
          } else {
            StringBuilder notas = new StringBuilder();
            for (Estudiante estudiante : notasPendientes) {
              notas.append(estudiante.toString() + "\n");
            }
            JOptionPane.showMessageDialog(null, notas.toString(), "Notas pendientes",
                JOptionPane.PLAIN_MESSAGE);
          }
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
          break;
      }
    }
  }
}