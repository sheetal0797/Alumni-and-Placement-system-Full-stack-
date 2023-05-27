package com.example.project.bean;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Placement")
public class Placement implements Serializable {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name="id")
    private Integer id;
    @Column(name = "organisation", nullable = false)
    private String organisation;
    @Column(name = "profile", nullable = false)
    private String profile;
    @Column(name = "description")
    private String description;
    @Column(name = "intake", nullable = false)
    private String intake;
    @Column(name = "minimum_grade")
    private String minimum_grade;

    @OneToMany(
            targetEntity=Specialisation.class,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "placement_id")


    private List<Specialisation> specialisationList = new ArrayList<>();

    @OneToMany(
            targetEntity=Domain.class,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    @JoinColumn(name = "placement_id")
    private List<Domain> domainList = new ArrayList<>();

    public Placement() {
    }

    public Placement(String organisation, String profile, String description, String intake, String minimum_grade, List<Specialisation> specialisationList, List<Domain> domainList) {
        this.organisation = organisation;
        this.profile = profile;
        this.description = description;
        this.intake = intake;
        this.minimum_grade = minimum_grade;
        this.specialisationList = specialisationList;
        this.domainList=domainList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public String getMinimum_grade() {
        return minimum_grade;
    }

    public void setMinimum_grade(String minimum_grade) {
        this.minimum_grade = minimum_grade;
    }

    public List<Specialisation> getSpecialisationList() {
        return specialisationList;
    }

    public void setSpecialisationList(List<Specialisation> specialisationList) {
        this.specialisationList = specialisationList;
    }

    public List<Domain> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<Domain> domainList) {
        this.domainList = domainList;
    }
}