package org.daria.service;

import org.daria.models.Applicant;
import org.daria.models.Job;
import org.daria.models.JobApplication;

import java.util.List;
import java.util.ArrayList;

public class JobApplicationSystem {

    private final List<Job> jobs;
    private final List<JobApplication> jobApplications;

    public JobApplicationSystem() {
        this.jobs = new ArrayList<>();
        this.jobApplications = new ArrayList<>();
    }

    public void createJob(int jobID, String title, String description) {
        Job job = new Job(jobID, title, description);
        jobs.add(job);
    }

    public void applyForJob(Job job, Applicant applicant, String resume) {
        JobApplication application = new JobApplication(job, applicant, resume);
        jobApplications.add(application);
    }

    public Job getJob(int index) {
        return jobs.get(index);
    }

    public void viewApplicationsForJob(Job job) {
        System.out.println("Applications for job: " + job.getTitle());
        for (JobApplication application : jobApplications) {
            if (application.getJob().equals(job)) {
                System.out.println("Applicant: " + application.getApplicant().getName());
                System.out.println("\tResume: " + application.getResume());
            }
        }
    }
}