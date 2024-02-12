package be.syntra.digitalplanner.model;

import jakarta.persistence.*;


@Entity
@Table(name ="Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long companyId;


    @Column(nullable = false, unique = true, name = "company_name")
    private String name;
}
