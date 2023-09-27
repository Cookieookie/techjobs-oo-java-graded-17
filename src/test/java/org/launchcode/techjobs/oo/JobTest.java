package org.launchcode.techjobs.oo;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs.oo.Job;
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
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"));
        Job test_job_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"));
        Assert.assertFalse((test_job.equals(test_job_two)));
    }

    }

