package br.ufal.ic.controller;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.model.Machine;
import br.ufal.ic.model.Status;
import br.ufal.ic.model.User;

//cascade and @JoinColumn @onetoone
public class UserTestExample5 {

	public static void main(String[] args) {

		// Criando Novo Usuário
		User user = new User();

		// Generation Automatic
		// user.setId(3);

		user.setName("Baldoino Neto");
		user.setAge(20);
		user.setLogUser(Calendar.getInstance());
		user.setStatus(Status.activate);
		//
//		 Machine machine = new Machine();
//		 machine.setMarca("Dell");
//		 machine.setModelo("15 r 7520");

		 //user.setMachine(machine);

		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);
		//session.save(machine);

		session.getTransaction().commit();

		session.close();

	}

}
