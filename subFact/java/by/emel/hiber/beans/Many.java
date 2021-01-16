/*
package by.emel.hiber.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Many {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "manyList")
@ManyToMany
@JoinTable(name = "summa_many",
        joinColumns = @JoinColumn(name = "many_id",referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "summa_id",referencedColumnName = "id")
)
    List<Summa> summaList;


    public Many() {
    }


    public List<Summa> getSummaList() {
        return summaList;
    }

    public void setSummaList(List<Summa> summaList) {
        this.summaList = summaList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
*/
