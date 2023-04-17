package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    // h -> h
    @Test
    public void reversedHSouldBeH()
    {
        Reverser reverser = new Reverser("h");
        assertEquals("h", reverser.reverse());
    }

    //hello -> olleh
    @Test
    public void reversedhelloSouldBeolleh()
    {
        Reverser reverser = new Reverser("hello");
        assertEquals("olleh", reverser.reverse());
    }
}
