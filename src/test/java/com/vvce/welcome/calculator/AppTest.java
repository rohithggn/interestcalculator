
package com.vvce.welcome.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSimpleInterest() {
        assertEquals(500, App.simpleInterest(5000, 10, 1), 0.01);
    }

    @Test
    public void testSimpleInterestForDifferentValues() {
        assertEquals(2000, App.simpleInterest(10000, 10, 2), 0.01);
    }

    @Test
    public void testCompoundInterest() {
        assertEquals(2100, App.compoundInterest(10000, 10, 2), 0.01);
    }

    @Test
    public void testCompoundInterestForOneYear() {
        assertEquals(500, App.compoundInterest(5000, 10, 1), 0.01);
    }

    @Test
    public void testTotalAmount() {
        assertEquals(5500, App.totalAmount(5000, 10, 1), 0.01);
    }

    @Test
    public void testCompoundAmount() {
        assertEquals(12100, App.compoundAmount(10000, 10, 2), 0.01);
    }

    @Test
    public void testZeroInterestRate() {
        assertEquals(0, App.simpleInterest(10000, 0, 5), 0.01);
        assertEquals(0, App.compoundInterest(10000, 0, 5), 0.01);
    }
}
