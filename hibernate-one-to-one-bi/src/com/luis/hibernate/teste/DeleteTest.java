package com.luis.hibernate.teste;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.entity.Instructor;
import com.luis.entity.InstructorDetail;

public class DeleteTest {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			int theId= 1;
			session.beginTransaction();
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			session.delete(tempInstructor);
			
			
			session.getTransaction().commit();
			
					
		}
		finally {
			factory.close();
		}

	}
	private static void displayInstructors(List<Instructor> theInstructors) {
		for(Instructor tempStudent : theInstructors) {
			System.out.println(tempStudent);
		}

	}

}
