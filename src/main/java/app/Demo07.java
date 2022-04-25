package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo07 {
	public static void main(String[] args) {
		// listado de los usuarios por tipo

		// listado de la tabla usuario
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();

		// acciones
		TypedQuery<Usuario> consulta = em.createQuery("select u from Usuario u where u.tipo = :xtipo", Usuario.class);
		consulta.setParameter("xtipo",2);
		
		List<Usuario> lstUsuario = consulta.getResultList();

		//
		for (Usuario u : lstUsuario) {
			System.out.println(u);
		}
		em.close();

	}
}
