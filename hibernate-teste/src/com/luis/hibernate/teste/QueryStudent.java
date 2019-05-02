package com.luis.hibernate.teste;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.entity.Student;

public class QueryStudent {
	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
			.buildSessionFactory();

	Session session = factory.getCurrentSession();

	try{
		
		session.beginTransaction();
	
		List<Student> theStudents = session.createQuery("from Student").getResultList();
		
		displayStudents(theStudents);
		
		theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
		
		displayStudents(theStudents);
		
		session.getTransaction().commit();
	}
	finally{
		factory.close();
	}

}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
}

