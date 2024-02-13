package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fixed_day_off")
public class FixedDayOff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fixedDayOffId;

    @ManyToOne
    @JoinColumn(name = "staff_id", unique = true, nullable = false)
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "days_of_week_id", unique = true, nullable = false)
    private DaysOfWeek daysOfWeek;
}
