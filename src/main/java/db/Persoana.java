package db;

import javax.persistence.*;
import java.util.Map;

@Entity
@Cacheable
public class Persoana {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.PERSIST)
    @MapKey(name = "strada")
    private Map<String,Adresa> adrese;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Adresa> getAdrese() {
        return adrese;
    }

    public void setAdrese(Map<String, Adresa> adrese) {
        this.adrese = adrese;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", adrese=" + adrese +
                '}';
    }
}
