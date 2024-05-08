package org.daria.models;

public class JobApplication {
    private Job job;
    private Applicant applicant;

    public JobApplication(Job job, Applicant applicant) {
        if (job == null || applicant == null)
            throw new NullPointerException("Job cannot be null");
        this.job = job;
        this.applicant = applicant;
    }

    public Job getJob() {
        return job;
    }

    public Applicant getApplicant() {
        return applicant;
    }
}
