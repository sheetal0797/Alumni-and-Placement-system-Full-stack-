package com.example.project.bean;
import jakarta.persistence.*;

@Entity
@Table(name="Domain")
public class Domain {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name="id")
    private  Integer id;

    @Column(name = "domain", nullable = false)
    private String domain;


    public Domain() {
        super();
    }

    public Domain(String domain) {
        super();
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
