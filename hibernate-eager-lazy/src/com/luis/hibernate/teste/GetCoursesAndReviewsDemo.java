package com.luis.hibernate.teste;
import com.luis.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class GetCoursesAndReviewsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			//int theId = 1;
			// start a transaction
			session.beginTransaction();
			
			Course tempCourse = new Course("curso de lssetras");
			Review tempreview = new Review("super daora");
			tempCourse.add(tempreview);
			tempCourse.add(new Review("massa demais"));
			tempCourse.add(new Review("nota 10"));
			
			session.save(tempCourse);
			
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





