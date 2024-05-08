package org.daria.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JobApplicationTest {
    @Test
    public void testGetJob() {
        Job job = new Job("Software Engineer", "Developing software applications");
        Applicant applicant = new Applicant("John Doe", "john@example.com", "Resume");
        JobApplication application = new JobApplication(job, applicant);
        assertEquals(job, application.getJob());
    }

    @Test
    public void testGetApplicant() {
        Job job = new Job("Software Engineer", "Developing software applications");
        Applicant applicant = new Applicant("John Doe", "john@example.com", "Resume");
        JobApplication application = new JobApplication(job, applicant);
        assertEquals(applicant, application.getApplicant());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullJob() {
        Applicant applicant = new Applicant("John Doe", "john@example.com", "Resume");
        new JobApplication(null, applicant);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullApplicant() {
        Job job = new Job("Software Engineer", "Developing software applications");
        new JobApplication(job, null);
    }

    @Test
    public void testConstructorWithValidArguments() {
        Job job = new Job("Software Engineer", "Developing software applications");
        Applicant applicant = new Applicant("John Doe", "john@example.com", "Resume");
        JobApplication application = new JobApplication(job, applicant);
        assertNotNull(application);
    }
}
