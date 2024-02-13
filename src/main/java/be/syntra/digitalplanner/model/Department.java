package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;

    @Column(name = "department_name", unique = true, nullable = false)
    private String departmentName;
}
