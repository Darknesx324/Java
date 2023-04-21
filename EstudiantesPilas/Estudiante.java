class Estudiante {
    private String nombre;
    private String nota;

    public Estudiante(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNota() {
        return nota;
    }

    public String toString() {
        return nombre + ": " + nota;
    }
}