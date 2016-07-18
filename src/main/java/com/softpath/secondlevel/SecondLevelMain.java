package com.softpath.secondlevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Alumno alumn = (Alumno) session.get(Alumno.class, 2);
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		Alumno alumn2 = (Alumno) session2.get(Alumno.class, 2);
		session2.getTransaction().commit();
		session2.close();
		
		/*for(int i=1; i<10;i++){
			Alumno alumno = new Alumno();
			alumno.setNombreAlumno("Alumno "+i);
			alumno.setSalonAlumno("Salon "+i);
			session.save(alumno);
		}*/
		
	}
}
