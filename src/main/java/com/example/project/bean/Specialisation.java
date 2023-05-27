package com.example.project.bean;
import jakarta.persistence.*;

@Entity
@Table(name="Specialisation")
public class Specialisation {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name="id")
    private Integer id;

    @Column(name = "specialisation", nullable = false)
    private String specialisation;

    public Specialisation() { super();
    }

    public Specialisation(String specialisation) {
        super();
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
