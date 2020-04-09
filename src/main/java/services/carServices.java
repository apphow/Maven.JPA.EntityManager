package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class carServices {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpalab");
    private EntityManager entityManager = emf.createEntityManager();
    private EntityTransaction trans = entityManager.getTransaction();

  /*  public Car createCar(int id, String make, String model, int year, String color, int vin) {

        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.set



}
}
   */
}
