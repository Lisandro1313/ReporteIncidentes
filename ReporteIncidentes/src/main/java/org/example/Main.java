pimport javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Crear el EntityManagerFactory y el EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-veterinaria");
        EntityManager em = emf.createEntityManager();

        try {
            // Iniciar una transacción
            em.getTransaction().begin();

            // Crear especialidades
            Especialidad perros = new Especialidad("Perros");
            Especialidad gatos = new Especialidad("Gatos");

            em.persist(perros);
            em.persist(gatos);

            // Crear técnicos
            Tecnico tecnico1 = new Tecnico("Juan Técnico", "Email", Arrays.asList(perros, gatos), null);
            Tecnico tecnico2 = new Tecnico("Ana Técnica", "WhatsApp", Arrays.asList(gatos), null);

            em.persist(tecnico1);
            em.persist(tecnico2);

            // Crear un cliente
            Cliente cliente = new Cliente("Cliente Ejemplo", "123456789", null);
            em.persist(cliente);

            // Crear un contrato asociado al cliente y a una especialidad
            Contrato contrato = new Contrato(cliente, perros, null);
            em.persist(contrato);

            // Crear un incidente asociado al contrato y al técnico
            Incidente incidente = new Incidente("Consulta general", contrato, tecnico1, LocalDateTime.now(), false, null);
            em.persist(incidente);

            // Confirmar la transacción
            em.getTransaction().commit();

        } finally {
            // Cerrar el EntityManager y el EntityManagerFactory al finalizar
            em.close();
            emf.close();
        }
    }
}
