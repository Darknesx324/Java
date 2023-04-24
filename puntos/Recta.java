public class Recta {
  Punto p1;
  Punto p2;

  public Recta(Punto p1, Punto p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public double getPendiente() {
    double dx = p2.getX() - p1.getX();
    double dy = p2.getY() - p1.getY();
    if (dx == 0) {
      return Double.POSITIVE_INFINITY;
    } else {
      return dy / dx;
    }
  }

  public double getLongitud() {
    double dx = p2.getX() - p1.getX();
    double dy = p2.getY() - p1.getY();
    return Math.sqrt(dx * dx + dy * dy);
  }
}
