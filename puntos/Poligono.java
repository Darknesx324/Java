import java.util.ArrayList;

public class Poligono {
  String nombre;
  ArrayList<Punto> puntos;

  public Poligono(String nombre, ArrayList<Punto> puntos) {
    if (puntos.size() < 3) {
      throw new IllegalArgumentException("Un polígono debe tener al menos 3 puntos");
    }
    this.nombre = nombre;
    this.puntos = puntos;
  }

  public double calcularArea() {
    double area = 0.0;
    int j = puntos.size() - 1;

    for (int i = 0; i < puntos.size(); i++) {
      area += (puntos.get(j).getX() + puntos.get(i).getX())
          * (puntos.get(j).getY() - puntos.get(i).getY());
      j = i;
    }

    return Math.abs(area / 2.0);
  }

  public void agregarPunto(Punto punto) {
    puntos.add(punto);
  }

  public void calcularPendientes() {
    for (int i = 0; i < puntos.size() - 1; i++) {
      double pendiente = (double) (puntos.get(i + 1).getY() - puntos.get(i).getY()) /
          (double) (puntos.get(i + 1).getX() - puntos.get(i).getX());
      System.out.println("Pendiente entre los puntos " + i + " y " + (i + 1) + " es " + pendiente);
    }
    // Calculando pendiente entre el último y el primer punto
    double pendiente = (double) (puntos.get(0).getY() - puntos.get(puntos.size() - 1).getY()) /
        (double) (puntos.get(0).getX() - puntos.get(puntos.size() - 1).getX());
    System.out.println("Pendiente entre el último y el primer punto es " + pendiente);
  }
}
