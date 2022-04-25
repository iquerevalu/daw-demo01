package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {
	public static void main(String[] args) {
		//eliminar un usuario
		//Fabrica de acceso de datos (mysql es el nombre de la unidad de persistencia)
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
			
				//Manejador de entidad
				EntityManager em = fabrica.createEntityManager();
			
				//empezar los procesos --> registrar, act, elimi
				em.getTransaction().begin();
				
				//acciones
				//delete ... where codigo
				Usuario u = new Usuario();
				//seteamos
				u.setCodigo(55);
				
				em.merge(u);
				
				//confirmación de procesis
				em.getTransaction().commit();
				
				//cerrr manejar
				em.close();
	}
}
