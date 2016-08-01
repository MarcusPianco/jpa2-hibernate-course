package br.ufal.ic.controller;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.model.Status;
import br.ufal.ic.model.User;

//Example @Id com generation
public class UserTestExample2 {

	public static void main(String[] args) {
		// Criando Novo Usuário
		User user = new User();

		// Generation Automatic
		// user.setId(1);

		user.setName("Baldoino Neto");
		user.setAge(20);
		user.setLogUser(Calendar.getInstance());
		user.setStatus(Status.activate);

		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();

		session.close();
	}

}
