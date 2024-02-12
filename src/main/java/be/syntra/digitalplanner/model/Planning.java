package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name ="planning")
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long planningId;

    @OneToMany(mappedBy = "planning")
    private Set<WorkingDay> workingDays;

    @ManyToOne
    @JoinColumn(name = "planningStatusId", nullable=false,unique = true)
    private PlanningStatus planningStatus;
}
