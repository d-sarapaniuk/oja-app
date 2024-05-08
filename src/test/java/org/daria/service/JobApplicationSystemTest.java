package service;

import org.daria.models.Applicant;
import org.daria.models.Job;
import org.daria.service.JobApplicationSystem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JobApplicationSystemTest {
    private JobApplicationSystem jobSystem;
    private Job job1;
    private Job job2;
    private Applicant applicant1;
    private Applicant applicant2;

    @Before
    public void setUp() {
        jobSystem = new JobApplicationSystem();
        job1 = new Job("Software Engineer", "Developing software applications");
        job2 = new Job("Data Analyst", "Analyzing and interpreting data");
        jobSystem.createJob(job1);
        jobSystem.createJob(job2);
        applicant1 = new Applicant("Applicant1", "app1@example.com", "Resume for Applicant1");
        applicant2 = new Applicant("Applicant2", "app2@example.com", "Resume for Applicant2");
    }

    @Test
    public void testCreateJob() {
        assertEquals(2, jobSystem.getJobs().size());
        assertEquals("Software Engineer", jobSystem.getJobs().get(0).getTitle());
        assertEquals("Data Analyst", jobSystem.getJobs().get(1).getTitle());
    }

    @Test
    public void testApplyForJob() {
        jobSystem.applyForJob(job1, applicant1);
        jobSystem.applyForJob(job2, applicant2);
        assertEquals(2, jobSystem.getJobApplications().size());
        assertEquals("Applicant1", jobSystem.getJobApplications().get(0).getApplicant().getName());
        assertEquals("Applicant2", jobSystem.getJobApplications().get(1).getApplicant().getName());
    }

    @Test
    public void testViewApplicationsForJob() {
        jobSystem.applyForJob(job1, applicant1);
        jobSystem.applyForJob(job1, applicant2);
        jobSystem.applyForJob(job2, applicant1);
        String expectedOutput = "Applications for job: Software Engineer\n" +
                "Applicant: Applicant1\n" +
                "\tResume: Resume for Applicant1\n" +
                "Applicant: Applicant2\n" +
                "\tResume: Resume for Applicant2\n";
        
        assertEquals(expectedOutput, jobSystem.viewApplicationsForJob(job1));
    }
}
