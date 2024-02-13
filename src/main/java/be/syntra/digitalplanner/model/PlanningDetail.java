package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "planning_detail")
public class PlanningDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long planningDetailId;

    @ManyToOne
    @JoinColumn(name = "planningId", nullable = false, unique = true)
    private Planning planning;

    @ManyToOne
    @JoinColumn(name = "staffId", nullable = false, unique = true)
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "availabilityId", nullable = false)
    private Availability availability;

    @Column(name = "start_time")
    private Time startTime;

    @Column(name = "end_time")
    private Time endTime;
}
