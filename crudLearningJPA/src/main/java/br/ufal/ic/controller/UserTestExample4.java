package br.ufal.ic.controller;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.dao.CRUDImpl;
import br.ufal.ic.model.Adress;
import br.ufal.ic.model.Status;
import br.ufal.ic.model.User;

//Example get All Objects
public class UserTestExample4 {

	public static void main(String[] args) {

		// Criando Novo Usuário
		User user = new User();

		// Generation Automatic
		// user.setId(3);

		user.setName("Baldoino Neto Junior");
		user.setAge(20);
		user.setLogUser(Calendar.getInstance());
		user.setStatus(Status.activate);

		Adress adress = new Adress();
		adress.setNumber(123);
		adress.setState("alagoas");
		adress.setStreet("Beijo");

		// user.setAdress(adress);

		Adress adress2 = new Adress();
		adress2.setNumber(123);
		adress2.setState("pernambuco");
		adress2.setStreet("Brazil");

		// user.getAdressList().add(adress);
		// user.getAdressList().add(adress2);

		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();

		session.close();

		CRUDImpl crudImpl = CRUDImpl.getInstance();

		for (User u : crudImpl.getAllInstances()) {
			System.out.println(u.getName());
		}

	}

}
