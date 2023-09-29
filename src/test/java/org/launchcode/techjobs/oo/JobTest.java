package org.launchcode.techjobs.oo;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;



public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"));
        Job test_job_two = new Job("Junior Web Developer", new Employer("Cozy"), new Location("Portland"), new PositionType("Web - Front End"));
        Assert.assertNotEquals(test_job, test_job_two);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //5 assertEquals Tests
        Assert.assertEquals(test_job.getName(),"Product tester");
        Assert.assertEquals(test_job.getEmployer().getValue(), "ACME");
        Assert.assertEquals(test_job.getLocation().getValue(),"Desert");
        Assert.assertEquals(test_job.getPositionType().getValue(), "Quality control");
        Assert.assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");

        // 5 assertTrue Tests
        Assert.assertTrue(test_job.getName() == "Product tester");
        Assert.assertTrue(test_job.getEmployer() instanceof Employer);
        Assert.assertTrue(test_job.getLocation() instanceof Location);
        Assert.assertTrue(test_job.getPositionType() instanceof PositionType);
        Assert.assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse((test_job.equals(test_job_two)));
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = "\n";
        boolean startString = test_job.toString().startsWith(newLine);
        boolean endString = test_job.toString().endsWith(newLine);
        Assert.assertEquals(true, startString);
        Assert.assertEquals(true, endString);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals("\n" +
                "ID: " + test_job.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n", test_job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job_empty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        Assert.assertEquals("\n" +
                "ID: " + test_job_empty.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n", test_job_empty.toString());
    }

    }

