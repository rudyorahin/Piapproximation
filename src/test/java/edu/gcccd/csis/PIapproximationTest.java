package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

public class PIapproximationTest {

    @Test
    public void main() {
        double d = PIapproximation.approx(1000000000);
        double marginOfError = 0.001;
        double actualError = Math.PI - d;
        System.out.println(d);
        assertTrue(Math.abs(actualError) <= marginOfError);

    }
}