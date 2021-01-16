package by.emel.hiber.forhospit.doctors;

import by.emel.hiber.forhospit.patients.Patient;
import by.emel.hiber.forhospit.users.User;
import by.emel.hiber.forhospit.users.UserType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Doctor extends User {

    public Doctor() {
        setUserType(UserType.DOCTOR);
    }
//    private List<Integer> patientsId = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "doctor")
    private List<Patient> patients;

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Doctor{" + getName() + " " + getUserType() + " " +
                "patients=" + patients.stream().map(Patient::getId).collect(Collectors.toList()) +
                "}";
    }
}
