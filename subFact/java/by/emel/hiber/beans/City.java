package by.emel.hiber.beans;

import javax.persistence.*;
/*

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class City  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_city")
    private int id;

    @Column
    private String name;

    @OneToOne(mappedBy = "city", cascade = CascadeType.ALL)
    private UserTest userTest;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserTest getUser() {
        return userTest;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(UserTest userTest) {
        this.userTest = userTest;
    }

    @Override
    public String toString() {
        return "\nCity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + userTest +
                '}';
    }
}
*/
