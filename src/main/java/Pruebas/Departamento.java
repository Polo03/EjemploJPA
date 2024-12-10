package Pruebas;

import java.util.ArrayList;

public class Departamento {

    private int id;
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Departamento() {}

    public Departamento(int id, String nombre, ArrayList<Empleado> listaEmpleados) {
        this.id = id;
        this.nombre = nombre;
        this.listaEmpleados=listaEmpleados;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return this.listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString(){
        StringBuilder empleadosStr = new StringBuilder();
        if (listaEmpleados != null) {
            for (Empleado emp : listaEmpleados) {
                empleadosStr.append("[id=").append(emp.getId()).append(", nombre=").append(emp.getNombre()).append("], ");
            }
        }
        return "Departamento{id=" + id + ", nombre='" + nombre + '\'' +
                ", listaEmpleados=" + empleadosStr + '}';
    }
}
