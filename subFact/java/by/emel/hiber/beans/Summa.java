//package by.emel.hiber.beans;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table
//public class Summa {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToMany
//    @JoinTable(name = "summa_many",
//            joinColumns = @JoinColumn(name = "summa_id",referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "many_id",referencedColumnName = "id")
//    )
//    private List<Many> manyList;
//
//
//    public Summa() {
//    }
//
//    public List<Many> getManyList() {
//        return manyList;
//    }
//
//    public void setManyList(List<Many> manyList) {
//        this.manyList = manyList;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}
