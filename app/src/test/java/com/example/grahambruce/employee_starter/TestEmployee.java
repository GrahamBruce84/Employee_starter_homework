package com.example.grahambruce.employee_starter;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * Created by grahambruce on 20/06/2017.
 */

public class TestEmployee {

    Employee employee;

    @Before
    public void before() {
       employee = new Employee(33, "Graham Bruce", "ABCDE", 20000);
    }

    @Test
    public void checkRaiseSalary() {
        assertEquals(25000, employee.raiseSalary(5000), 0.01);
    }

    @Test
    public void hasName(){
        assertEquals("Graham Bruce", employee.getName());
    }

    @Test
    public void changeName() {
        assertEquals("Bob", employee.setName("Bob"));
    }



}
