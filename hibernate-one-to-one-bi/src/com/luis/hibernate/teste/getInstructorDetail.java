package com.luis.hibernate.teste;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.entity.Instructor;
import com.luis.entity.InstructorDetail;

public class getInstructorDetail {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			int theId= 2;
			session.beginTransaction();
			InstructorDetail tid = session.get(InstructorDetail.class, theId);
			System.out.println(tid);
			//System.out.println(tid.getInstructor());
			//session.delete(tid);
 			
			
			
			session.getTransaction().commit();			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}

	}
	private static void displayInstructors(List<Instructor> theInstructors) {
		for(Instructor tempStudent : theInstructors) {
			System.out.println(tempStudent);
		}

	}

}
