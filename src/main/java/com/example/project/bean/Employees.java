package com.example.project.bean;
import jakarta.persistence.*;

@Entity
@Table(name = "Employees")
public class Employees {

    @Id
    @Column(name="employee_id")
    private String employee_id;
    @Column(name="first_name",nullable = false)
    private  String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="email",nullable = false,unique = true)
    private String email;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "department")
    private String department;
    @Column(name="photograph_path")
    private String photograph_path;

    public Employees(){}
    public Employees(String employee_id, String first_name, String last_name, String email,String password, String department, String path) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.department = department;
        this.photograph_path = photograph_path;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhotograph_path() {
        return photograph_path;
    }

    public void setPhotograph_path(String photograph_path) {
        this.photograph_path = photograph_path;
    }

}
