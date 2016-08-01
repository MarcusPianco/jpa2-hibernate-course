package br.ufal.ic.controller;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.ufal.ic.model.Status;
import br.ufal.ic.model.User;

//Example @Entity
public class UserTestExample1 {

	public static void main(String[] args) {
		
		// Criando Novo Usuário
		User user = new User();

		user.setId(1);

		user.setName("Baldoino Neto");
		user.setAge(20);
		user.setLogUser(Calendar.getInstance());
		user.setStatus(Status.activate);
		
		// Cria uma Sessão de Comunicação com o Banco
				SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml").buildSessionFactory();

				//Abrindo uma sessão junto ao Banco ed Dados
				Session session = sessionFactory.openSession();

				session.beginTransaction();
				
				//Salvar no Banco
				session.save(user);
				
				//Enviar a sessão para o banco 
				session.getTransaction().commit();
				
				//Fecha a sessão com o banco
				session.close();
	
	
	}

}
