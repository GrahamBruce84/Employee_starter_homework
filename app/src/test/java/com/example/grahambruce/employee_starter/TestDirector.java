package com.example.grahambruce.employee_starter;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Created by grahambruce on 20/06/2017.
 */

public class TestDirector {

    Director director;

    @Before
    public void before() {
        director = new Director(12, "Chris Burn", "EDCBA", 10000, "Hard Knox", 15000);
    }

    @Test
    public void hasName() {
        assertEquals("Chris Burn", director.getName());
    }

    @Test
    public void checkRaiseSalary() {
        assertEquals(15000, director.raiseSalary(5000), 0.01);
    }
}
