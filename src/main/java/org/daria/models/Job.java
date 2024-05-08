package org.daria.models;

public class Job {
    private String title;
    private String description;

    public Job(int jobID, String title, String description) throws IllegalArgumentException{
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
