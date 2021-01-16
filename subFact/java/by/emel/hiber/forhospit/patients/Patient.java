package by.emel.hiber.forhospit.patients;

import by.emel.hiber.forhospit.doctors.Doctor;
import by.emel.hiber.forhospit.therapy.Therapy;
import by.emel.hiber.forhospit.users.User;
import by.emel.hiber.forhospit.users.UserType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public  class Patient extends User {

//    private int doctorId = 0;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

//    private List<Integer> therapies = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "patient", cascade = CascadeType.REMOVE)
    private List<Therapy> therapies;

    public Patient() {
        setUserType(UserType.PATIENT);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public List<Therapy> getTherapies() {
        return therapies;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setTherapies(List<Therapy> therapies) {
        this.therapies = therapies;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor.getId() +
                ", therapies=" + therapies.stream().map(Therapy::getDescription).collect(Collectors.toList()) +
                '}';
    }
}
