package com.example.spring_practise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    private String name;
    private String language;
    private String framework;
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
