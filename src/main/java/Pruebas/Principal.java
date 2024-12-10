package Pruebas;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Crear el departamento
        Departamento dpto1 = new Departamento();

        // Crear empleados
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();

        // Configurar el departamento
        dpto1.setId(1);
        dpto1.setNombre("DPTO 1");

        // Configurar los empleados y asignarlos al departamento
        e1.setId(1);
        e1.setNombre("Emp1");
        e1.setDepartamento(dpto1);

        e2.setId(2);
        e2.setNombre("Emp2");
        e2.setDepartamento(dpto1);

        // Crear y asignar la lista de empleados al departamento
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        dpto1.setListaEmpleados(listaEmpleados);

        // Mostrar información del departamento usando toString
        System.out.println(dpto1.toString());
    }
}
