package main;

import db.Adresa;
import db.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Map;

public class Exemplu2 {

    public static void main(String[] args) {
        var emf= Persistence.createEntityManagerFactory("java2c5PU");
        EntityManager em = emf.createEntityManager();

        var a1=new Adresa();
        a1.setNumar(4);
        a1.setStrada("Timisoara");
     var   a2=new Adresa();
     a2.setNumar(7);
     a2.setStrada("Bd. 1 Mai");

     var p=new Persoana();
     p.setAdrese(Map.of(a1.getStrada(),a1,
             a2.getStrada(),a2));

     em.getTransaction().begin();
     em.persist(p);
     em.getTransaction().commit();
    }
}
