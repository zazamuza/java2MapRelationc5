package db;

import javax.persistence.Embeddable;

@Embeddable
public class Departament {

    private String nume;

    private int numarAngati;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAngati() {
        return numarAngati;
    }

    public void setNumarAngati(int numarAngati) {
        this.numarAngati = numarAngati;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + nume + '\'' +
                ", numarAngati=" + numarAngati +
                '}';
    }
}
