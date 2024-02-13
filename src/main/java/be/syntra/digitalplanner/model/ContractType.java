package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contract_type")
public class ContractType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long contractTypeId;

    @Column(name = "contract_type_name", unique = true, nullable = false)
    private String contractTypeName;

    @Column(name = "hours_per_week", nullable = false)
    private int hoursPerWeek;
}
