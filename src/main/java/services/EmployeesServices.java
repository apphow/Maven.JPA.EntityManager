package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeesServices {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpalab");
    private EntityManager entityManager = emf.createEntityManager();
    private EntityTransaction trans = entityManager.getTransaction();


}