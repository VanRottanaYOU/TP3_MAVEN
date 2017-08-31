package fr.codevalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RechercheNomCommune {

	public static void main(String[] args) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation");
		  EntityManager entityManager =emf.createEntityManager();;
		  TypedQuery<Mairie> query = entityManager.createQuery("from Mairie", Mairie.class);
		  System.out.println(query.getResultList().size());
		  entityManager.close();
		  System.exit(0);

}
}
