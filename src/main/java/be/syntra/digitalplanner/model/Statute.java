package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "statute")
public class Statute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long statuteId;

    @Enumerated(EnumType.STRING)
    private StatuteName statuteName;
}
