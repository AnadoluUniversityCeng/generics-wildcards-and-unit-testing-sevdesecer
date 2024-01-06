package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {
    @Test(timeout = 2500)
    public void testLoop() {
        // You should provide an input that causes infiniteLoop to enter an infinite loop
        double input = Double.POSITIVE_INFINITY;

        try {
            App.infiniteLoop(input);
            // If the method doesn't throw an exception, fail the test
            fail("Expected infinite loop, but the method completed successfully");
        } catch (Exception e) {
            // Test passed if an exception is thrown
        }
    }
}
