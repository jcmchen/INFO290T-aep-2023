package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void rectangleWithSideSixShouldHaveAreaThirtySix()
    {
        Rectangle rectangle = new Rectangle(6,6);
        assertEquals(36, rectangle.area());
    }


}