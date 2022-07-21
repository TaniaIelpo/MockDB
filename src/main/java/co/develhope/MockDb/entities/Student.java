package co.develhope.MockDb.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Tania Ielpo
 */

@Entity
@Data
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idStudent", nullable = false)
    private Long id;

    @Column(name="name")
    private String firstName;

    @Column(name="surname")
    private String lastName;

    @Column(unique = true, nullable = false,name="sudentEmail")
    private String email;
}
