package by.emel.hiber.forhospit.users;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String login;
    @Column
    private String password;
    @Column
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @Column
    private String name;
    @Column
    private LocalDate birthday;

    public User() {
    }


    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
