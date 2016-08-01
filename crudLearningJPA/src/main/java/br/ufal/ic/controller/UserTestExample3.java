package br.ufal.ic.controller;

import java.util.Calendar;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.model.Adress;
import br.ufal.ic.model.Status;
import br.ufal.ic.model.User;

//Endereço junto a tabela do User @Embeddable e @ElementCollection
public class UserTestExample3 {

	public static void main(String[] args) {

		// Criando Novo Usuário
		User user = new User();

		// Generation Automatic
		// user.setId(3);

		user.setName("Baldoino Neto");
		user.setAge(20);
		user.setLogUser(Calendar.getInstance());
		user.setStatus(Status.activate);

		Adress adress = new Adress();
		adress.setNumber(123);
		adress.setState("alagoas");
		adress.setStreet("Beijo");

		// user.setAdress(adress);

		// Adress adress2 = new Adress();
		// adress2.setNumber(123);
		// adress2.setState("alagoas");
		// adress2.setStreet("Beijo");
		//
		// user.getAdressList().add(adress);
		// user.getAdressList().add(adress2);
		

		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();

		session.close();

	}

}
