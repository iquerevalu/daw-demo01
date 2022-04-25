package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {
	public static void main(String[] args) {
		//obtener un objeto ususario seg�n el c�digo o id (buscar)

		//Fabrica de acceso de datos--> DAO
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();

		
		//acciones
		Usuario u = em.find(Usuario.class, 85); //Si exite el ID -> devuelve el objeto
												//sino existe -> null
		//validaci�n simple
		if (u != null)
			System.out.println(u);
		else 
			System.out.println("C�digo no existe");
		
		
		em.remove(u);
		
		em.close();
	}
}
