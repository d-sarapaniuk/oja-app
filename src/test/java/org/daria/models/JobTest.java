package org.daria.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JobTest {


    @Test
    public void testGetTitle() {
        Job job = new Job("Software Engineer", "Developing software applications");
        assertEquals("Software Engineer", job.getTitle());
    }

    @Test
    public void testGetDescription() {
        Job job = new Job("Software Engineer", "Developing software applications");
        assertEquals("Developing software applications", job.getDescription());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullTitle() {
        new Job(null, "Description");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyTitle() {
        new Job("", "Description");
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullDescription() {
        new Job("Title", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyDescription() {
        new Job("Title", "");
    }



    @Test
    public void testConstructorWithValidArguments() {
        Job job = new Job("Title", "Description");
        assertNotNull(job);
    }
}
