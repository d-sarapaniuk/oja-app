package org.daria.models;

public class JobApplication {
    private Job job;
    private Applicant applicant;
    private String resume;

    public JobApplication(Job job, Applicant applicant, String resume) {
        this.job = job;
        this.applicant = applicant;
        this.resume = resume;
    }

    public Job getJob() {
        return job;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public String getResume() {
        return resume;
    }
}
