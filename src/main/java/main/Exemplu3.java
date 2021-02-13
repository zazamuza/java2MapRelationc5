package main;

import db.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Exemplu3 {
    public static void main(String[] args) {
        var emf= Persistence.createEntityManagerFactory("java2c5PU");
        EntityManager em = emf.createEntityManager();

        Persoana persoana = em.find(Persoana.class, 1);

        System.out.println(persoana);
    }
}
