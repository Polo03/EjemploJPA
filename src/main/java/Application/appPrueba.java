package Application;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class appPrueba {
    public static void main(String[] args) {
        // Crear el EntityManagerFactory con el nombre de la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploJPA");
        EntityManager em = emf.createEntityManager();
        Departamento departamento = new Departamento("Ejemplo");
        System.out.println("HOLA");
        try {
            em.getTransaction().begin();
            em.persist(departamento);
            em.getTransaction().commit();

            System.out.println("Departamento guardado con éxito: " + departamento);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }

    }
}
