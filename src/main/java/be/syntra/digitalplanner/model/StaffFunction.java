package be.syntra.digitalplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "staff_function")
public class StaffFunction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffFunctionId;

    @Column(name = "staff_function_name", unique = true)
    private String staffFunctionName;

    @Column(name = "staff_function_description", unique = true)
    private String staffFunctionDescription;


}
