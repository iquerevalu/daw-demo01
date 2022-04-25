package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	public static void main(String[] args) {
		//registra un nuevo usuario
		
		//Fabrica de acceso de datos (mysql es el nombre de la unidad de persistencia)
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	
		//Manejador de entidad
		EntityManager em = fabrica.createEntityManager();
	
		//empezar los procesos --> registrar, act, elimi
		em.getTransaction().begin();
		
		//acciones
		Usuario u = new Usuario(24, "Kathia", "Ynfante", "kathiayv@gmail.com", "2345",
					"2003/07/24", 1, 1);
		//solo para registrar
		em.persist(u);
		
		//confirmación de procesis
		em.getTransaction().commit();
		
		//cerrr manejardor
		em.close();
		
	}
}
