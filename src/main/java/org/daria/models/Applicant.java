package org.daria.models;

public class Applicant {
    private String name;
    private String email;

    public Applicant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}