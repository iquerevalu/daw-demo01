package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {

	public static void main(String[] args) {
		//actualizar un usuario
		
		//Fabrica de acceso de datos (mysql es el nombre de la unidad de persistencia)
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			
				//Manejador de entidad
				EntityManager em = fabrica.createEntityManager();
			
				//empezar los procesos --> registrar, act, elimi
				em.getTransaction().begin();
				
				//acciones
				Usuario u = new Usuario(55, "Inés", "Querevalú", "inesviviana@gmail.com", "5432",
							"2003/08/23", 2, 1);
				//para actualizar
				em.merge(u); //si existe el código lo actualiza/ sino existe --> lo crea
				
				//confirmación de procesis
				em.getTransaction().commit();
				
				//cerrr manejar
				em.close();
	}
}
