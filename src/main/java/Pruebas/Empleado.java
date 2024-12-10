package Pruebas;

public class Empleado {
    private int id;
    private String nombre;
    private Departamento departamento;

    public Empleado(){

    }

    public Empleado(int id, String nombre, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + '\'' +
                ", departamento=" + (departamento != null ? departamento.getNombre() : "N/A") + '}';
    }

}
