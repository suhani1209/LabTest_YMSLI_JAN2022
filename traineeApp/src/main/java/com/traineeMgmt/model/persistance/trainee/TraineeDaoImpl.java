package com.traineeMgmt.model.persistance.trainee;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.traineeMgmt.model.persistance.factory.HibernateSessionFactory;

public class TraineeDaoImpl implements TraineeDao{

	private SessionFactory factory;

	public TraineeDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}
	
	public List<Trainee> getAll() {
		Session session = factory.openSession();
		List<Trainee> allTrainees=session
				.createQuery("select t from Trainee t", Trainee.class)
				.getResultList();
		session.close();
		return allTrainees;
	}

	public Trainee addTrainee(Trainee trainee) {
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(trainee);

			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
		}
		session.close();
		return trainee;
	}

}
