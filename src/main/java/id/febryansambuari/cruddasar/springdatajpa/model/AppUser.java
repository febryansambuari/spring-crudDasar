package id.febryansambuari.cruddasar.springdatajpa.model;

import javax.persistence.*;
import java.util.Date;

// @Entity menandakan kalau class ini adalah JPA Entity, yang merupakan abstraksi dari table
// Anotasi @Table(name="app_user") menjelaskan kalau class ini di-mapping ke table app_user
@Entity @Table(name = "app_user")
public class AppUser {

    // Setiap @Entity harus mempunyai @Id sebagai primary key. Dan itu di-set ke properti id.
    // Selain itu kita juga mendefinisikan Generation Strategy untuk id, yaitu auto increment.
    // Sedangkan anotasi @Column dengan parameter name digunakan untuk mendefinisikan alias dari property.
    // Misal, property firstName mempunyai alias first_name di database.
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "join_date")
    private Date joinDate;

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }

    // setter & getter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
