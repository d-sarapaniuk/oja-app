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

    public void createJob(String title, String description) {
        Job job = new Job(title, description);
        jobs.add(job);
    }
    public void createJob(Job job) {
        jobs.add(job);
    }

    public void applyForJob(Job job, Applicant applicant, String resume) {
        JobApplication application = new JobApplication(job, applicant, resume);
        jobApplications.add(application);
    }

    public Job getJob(int index) {
        return jobs.get(index);
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public List<JobApplication> getJobApplications() {
        return jobApplications;
    }

    public String viewApplicationsForJob(Job job) {
        StringBuilder output = new StringBuilder();
        output.append("Applications for job: ").append(job.getTitle()).append("\n");
        for (JobApplication application : jobApplications) {
            if (application.getJob().equals(job)) {
                output.append("Applicant: ").append(application.getApplicant().getName()).append("\n");
                output.append("\tResume: ").append(application.getResume()).append("\n");
            }
        }
        return output.toString();
    }
}