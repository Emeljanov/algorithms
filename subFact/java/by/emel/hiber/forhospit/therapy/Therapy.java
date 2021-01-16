package by.emel.hiber.forhospit.therapy;

import by.emel.hiber.forhospit.patients.Patient;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Therapy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String description;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;

//    private int idPatient;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id",nullable = false)
    private Patient patient;


    public Therapy() {
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
