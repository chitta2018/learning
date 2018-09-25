package Jpa.Exampleajpa;
import javax.persistence.*;  

public class FinalClass {

	public static void main(String[] args) {
		EntityManagerFactory em= Persistence.createEntityManagerFactory("StudentDetails");
		EntityManager cs=em.createEntityManager();
		
		
		Student s= cs.find(Student.class, 101);
		s.getHeight();
		s.getName();
		}
}
