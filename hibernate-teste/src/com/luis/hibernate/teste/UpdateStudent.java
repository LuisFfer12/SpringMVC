package com.luis.hibernate.teste;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.entity.Student;

public class UpdateStudent {
	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
			.buildSessionFactory();

	Session session = factory.getCurrentSession();

	try{
		int studentId= 1;
		session.beginTransaction();
		Student myStudent = session.get(Student.class, studentId);	
		
		myStudent.setFirstName("JoaozinMEquetrefi");
		//session.createQuery("Update Student set email='foo@gmail.com'").executeUpdate();
		//session.delete(myStudent)
		//session.createQuery("delete from Student where id=2).executeUpdate();
		
		List<Student> theStudents = session.createQuery("from Student").getResultList();
		
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

