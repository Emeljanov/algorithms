/*
package by.emel.hiber.beans;

import javax.persistence.*;
import java.io.Serializable;

//@MappedSuperclass
//@Table(name = "abstractuser")
//@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Inheritance
public  class UserTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_user")
    private int id;

    @Column(nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id") //, nullable = false
    private City city;

    public UserTest() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
*/
