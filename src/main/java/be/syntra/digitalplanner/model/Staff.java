package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffId;

    @ManyToOne
    @JoinColumn(name = "staffFunctionId", nullable = false)
    private StaffFunction staffFunction;

    @ManyToOne
    @JoinColumn(name = "departmentId", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "companyId", nullable = false)
    private Company company;

    @Column(name = "staff_name", nullable = false)
    private String staffName;

    @Column(name = "staff_details", nullable = false)
    private String staffDetails;

    @ManyToOne
    @JoinColumn(name = "contract_type", nullable = false)
    private ContractType contractType;

    @ManyToOne
    @JoinColumn(name = "personResonsibleId", nullable = false)
    private Staff personResonsible;

    @OneToOne(mappedBy = "staff")
    private UserLogin userLogin;

}
