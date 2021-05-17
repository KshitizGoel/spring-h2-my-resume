package com.example.spring_practise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    @Column(name = "Name")
    private String name;

    @Column(name = "Language")
    private String language;

    @Column(name = "Framework")
    private String framework;

    @Column(name = "Experience")
    private String experience;

    public Skills() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Skills(String name, String language, String framework, String experience) {
        this.name = name;
        this.language = language;
        this.framework = framework;
        this.experience = experience;
    }
}
