package by.emel.hiber;


import by.emel.hiber.forhospit.doctors.Doctor;
import by.emel.hiber.forhospit.patients.Patient;
import by.emel.hiber.forhospit.therapy.OrdinaryTherapy;
import by.emel.hiber.forhospit.therapy.Therapy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
@Transactional
public class Runner implements CommandLineRunner {

  /*  @Autowired
    private UserDao userDao;*/
    @Autowired
    private EntityManager entityManager;

    public static void main(String[] args) {


        SpringApplication.run(Runner.class,args);

    }



    @Override
    public void run(String... args) throws Exception {
       /* Therapy therapy = new OrdinaryTherapy();
        therapy.setEndDate(LocalDate.of(2030,01,01));
        therapy.setStartDate(LocalDate.of(2021,02,02));
        therapy.setDescription("Eat some food11111111111");

        therapy.setPatient(entityManager.getReference(Patient.class,6));
        entityManager.persist(therapy);*/

//        entityManager.remove(entityManager.getReference(Therapy.class,4));


        entityManager.remove(entityManager.getReference(Patient.class,6));



    }
}
