package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name ="WorkingDay")
public class WorkingDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workingDayId;

    @ManyToOne
    @JoinColumn(name="planning_id", nullable=false,unique = true)
    private Planning planning;

    @ManyToOne
    @JoinColumn(name="company_id", nullable=false,unique = true)
    private Company companyId;

    @Column(nullable = false, unique = true, name = "date")
    private Date date;

    @Column(nullable = false, name = "open")
    private boolean open;

    @Column(nullable = false, name = "start_time")
    private Time startTime;

    @Column(nullable = false, name = "end_time")
    private Time endTime;



}
