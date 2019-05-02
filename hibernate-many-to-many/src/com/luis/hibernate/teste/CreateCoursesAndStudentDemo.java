package com.luis.hibernate.teste;
import com.luis.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CreateCoursesAndStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			//int theId = 12;
			// start a transaction
			session.beginTransaction();
			Course tempCourse = new Course("cuasrso cerbcvbto para vaasdassdoce");
			session.save(tempCourse);
			
			Student tempStudent = new Student("tereza","Arruda","ja@gmail.com");
			Student tempStudent2 = new Student("lucas","aparecida","ma@gmail.com");
			
			
			
			tempCourse.addStudents(tempStudent);
			tempCourse.addStudents(tempStudent2);
			
			session.save(tempStudent);
			session.save(tempStudent2);
			
			
			System.out.println("saved Students" + tempCourse.getStudents());
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
		
	}

}





