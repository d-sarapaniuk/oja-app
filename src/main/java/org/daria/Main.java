package org.daria;

import org.daria.models.Applicant;
import org.daria.service.JobApplicationSystem;

public class Main {
    public static void main(String[] args) {
        JobApplicationSystem jobSystem = new JobApplicationSystem();
        // Create some jobs
        jobSystem.createJob("Software Engineer", "Develop software applications");
        jobSystem.createJob("Data Scientist", "Analyze and interpret complex data");

        // Create some applicants
        Applicant applicant1 = new Applicant("Hanna Kuz", "starosta@gmail.com", "Software engineer with 5 years of experience");
        Applicant applicant2 = new Applicant("Oksana Demchuk", "oksanka2009@ukr.net", "Recent graduate with strong programming skills. Experienced data analyst with machine learning expertise");

        // Apply for jobs
        jobSystem.applyForJob(jobSystem.getJob(0), applicant1);
        jobSystem.applyForJob(jobSystem.getJob(0), applicant2);

        jobSystem.applyForJob(jobSystem.getJob(1), applicant2);

        // View applications for a job

        System.out.println(jobSystem.viewApplicationsForJob(jobSystem.getJob(0)));
        System.out.println();
        System.out.println(jobSystem.viewApplicationsForJob(jobSystem.getJob(1)));
    }
}