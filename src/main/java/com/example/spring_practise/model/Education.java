package com.example.spring_practise.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
     private String name;
     private String school_name;
     private String college_name;


    public Education() {
    }

    public Education(String name, String school_name, String college_name) {
        this.name = name;
        this.school_name = school_name;
        this.college_name = college_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }
}
