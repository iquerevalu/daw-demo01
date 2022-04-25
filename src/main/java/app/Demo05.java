package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	public static void main(String[] args) {
		//eliminar 2.0, con los datos obtenidos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		//acciones -> lo busca entra la clase
		 Usuario u = em.find(Usuario.class, 55);
		 
		//validando
		 if (u != null) {
			 //empieza el proceso (create,delete, update, select) 
			 em.getTransaction().begin();
			 //elimina
			 em.remove(u);
			 //confirmación del proceso
			 em.getTransaction().commit();
			 System.out.println("Se eliminó");
		 } else
			 System.out.println("código no existe");
	}
}
