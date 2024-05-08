package org.daria.models;

public class Job {
    private String title;
    private String description;

    public Job(String title, String description) throws IllegalArgumentException {
        if (title == null || description == null) {
            throw new NullPointerException("Title and description cannot be null");
        }
        else if (title.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Title and description cannot be empty");
        }
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
