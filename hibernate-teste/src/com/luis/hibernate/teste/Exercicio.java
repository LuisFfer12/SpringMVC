package com.luis.hibernate.teste;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.entity.Student;

public class Exercicio {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			int studentId = 1;
			Student tempStudent = new Student("Ricardo", "Millos","AGORA");
			session.beginTransaction();
			session.save(tempStudent);
			//session.getTransaction().commit();
			
			//Session session = factory.getCurrentSession();
			//session.beginTransaction();
			Student myStudent = session.get(Student.class, studentId);
			
			List<Student> theStudentsCompany = session.createQuery("from Student s where s.company = 'uber'").getResultList();
			displayStudents(theStudentsCompany);
			session.delete(myStudent);
			
			
			System.out.println(myStudent);
			session.getTransaction().commit();
			
			
			
		}
		finally {
			factory.close();
		}

	}
	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}


	}}
