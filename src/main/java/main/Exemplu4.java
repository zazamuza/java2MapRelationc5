package main;

import db.Adresa;
import db.Organizatie;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Map;

public class Exemplu4 {
    public static void main(String[] args) {
        var emf= Persistence.createEntityManagerFactory("java2c5PU");
        EntityManager em = emf.createEntityManager();

        var a=new Adresa();
        a.setStrada("Drumul Taberei");
        a.setNumar(9);
        var o=new Organizatie();
        o.setStraziAdrese(Map.of(a,a.getStrada()));

        em.getTransaction().begin();
        em.persist(a);
        em.persist(o);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
