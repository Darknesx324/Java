package PK01;

public class circulo {
    int radio;
    double area;
    double perimetro;
    int x;
    int y;

    public circulo(int radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double calcularPerimetro(){

        perimetro = 2*3.1416*radio;
        return perimetro;

    }

    

    public double  calcularArea(){

        area = 3.1416*radio*radio;
        return area;

    }

    public void dibujarCirculo(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
