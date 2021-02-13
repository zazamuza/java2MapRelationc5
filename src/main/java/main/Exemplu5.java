package main;

import db.Persoana;

import javax.persistence.Cache;
import javax.persistence.Persistence;

public class Exemplu5 {
    public static void main(String[] args) {
        var emf= Persistence.createEntityManagerFactory("java2c5PU");
        var em1=emf.createEntityManager();
        var em2=emf.createEntityManager();


        Cache cache = emf.getCache();

        System.out.println(cache.contains(Persoana.class,1));

        Persoana p = em1.find(Persoana.class, 1);

        System.out.println(cache.contains(Persoana.class,1));

        Persoana p1 = em2.find(Persoana.class, 1);


    }
}
