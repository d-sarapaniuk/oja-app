package org.daria.models;

public class Applicant {
    private String name;
    private String email;
    private String resume;

    public Applicant(String name, String email, String resume) {
        if (name == null || email == null || resume == null) {
            throw new NullPointerException("Name and email cannot be null");
        }
        else if (name.isEmpty() || email.isEmpty() || resume.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.email = email;
        this.resume = resume;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getResume() {
        return resume;
    }
}