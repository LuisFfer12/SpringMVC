package com.luis.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.entity.Student;

public class StudentTest {
	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
			.buildSessionFactory();

	Session session = factory.getCurrentSession();

	try{
		Student tempStudent = new Student("Paul", "Wall", "asd@hotmail.com");
		session.beginTransaction();
		session.save(tempStudent);
		session.getTransaction().commit();
	}
	finally{
		factory.close();
	}

}
}

