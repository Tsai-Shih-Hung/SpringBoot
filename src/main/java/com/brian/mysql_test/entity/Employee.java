package com.brian.mysql_test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long personid;
    private String personName;
    
    public Employee(Long personid, String personName, float employeeSalary) {
        this.personid = personid;
        this.personName = personName;
    }

    public Employee() {
    }

    public void setpersonid(Long personid) {
        this.personid = personid;
    }

    public void setpersonName(String personName) {
        this.personName = personName;
    }

    public Long getpersonid() {
        return personid;
    }

    public String getpersonName() {
        return personName;
    }

}
