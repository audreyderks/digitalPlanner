package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name="availability")
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long availabilityId;

    @Enumerated(EnumType.STRING)
    private AvailabilityType availabilityType;
}
