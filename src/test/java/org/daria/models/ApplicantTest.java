package org.daria.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ApplicantTest {
    @Test
    public void testGetName() {
        Applicant applicant = new Applicant("Applicant1", "app@gmail.com", "Resume");
        assertEquals("Applicant1", applicant.getName());
    }

    @Test
    public void testGetEmail() {
        Applicant applicant = new Applicant("Applicant1", "app@gmail.com", "Resume");
        assertEquals("app@gmail.com", applicant.getEmail());
    }

    @Test
    public void testGetResume() {
        Applicant applicant = new Applicant("Applicant1", "app@gmail.com", "Resume");
        assertEquals("Resume", applicant.getResume());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullName() {
        new Applicant(null, "app@gmail.com", "Resume");
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullEmail() {
        new Applicant("Applicant1", null, "Resume");
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullResume() {
        new Applicant("Applicant1", "app@gmail.com", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyName() {
        new Applicant("", "app@gmail.com", "Resume");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyEmail() {
        new Applicant("Applicant1", "", "Resume");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyResume() {
        new Applicant("Applicant1", "app@gmail.com", "");
    }

    @Test
    public void testConstructorWithValidArguments() {
        Applicant applicant = new Applicant("Applicant1", "app@gmail.com", "Resume");
        assertNotNull(applicant);
    }
}
