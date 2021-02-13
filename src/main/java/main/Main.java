package main;

import db.Departament;
import db.Magazin;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var emf= Persistence.createEntityManagerFactory("java2c5PU");
        EntityManager em = emf.createEntityManager();

       var m=new Magazin();

       m.setDepartamente(Map.of(10,"Vanzari",
              20,"Suport"
              ));

        em.getTransaction().begin();

        em.persist(m);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
