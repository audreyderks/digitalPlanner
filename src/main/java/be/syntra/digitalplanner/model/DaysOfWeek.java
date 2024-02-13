package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "days_of_week")
public class DaysOfWeek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long daysOfWeekId;

    @Column(name = "description")
    private String description;
}
