package pk01;

public class Empleado {

    private String nombre;
    private int codigo;
    private int edad;

    public Empleado() {
        this.nombre = "";
        this.codigo = 0;
        this.edad=0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void validarEdad() {
        if (edad < 0) {
            edad = Math.abs(edad);
        }
        if (edad > 100) {
            edad = 100;
        }
    }

}
