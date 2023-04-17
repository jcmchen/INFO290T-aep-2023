package edu.berkeley.aep;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class Airport3Test{
    static Airport3 a = new Airport3();
    static Airport3 b = new Airport3();
    static Airport3 c = new Airport3();
    static Airport3 d = new Airport3();
    static Airport3 e = new Airport3();
    static Airport3 f= new Airport3();
    static Airport3 g = new Airport3();
    static Airport3 h = new Airport3();
    static Set<Airport3> setA = new HashSet<>();



    static {
        h.addRoute(b);
        b.addRoute(a);
        a.addRoute(f);
        b.addRoute(c);
        c.addRoute(d);
        c.addRoute(e);
        c.addRoute(e);
        e.addRoute(b);
    }

    @Test
    public void aCanReachA() {
        assertTrue(a.ifConnected(a));
    }

    @Test
    public void hCanReachB() {
        assertTrue(h.ifConnected(b));
    }

    @Test
    public void bCanReachC() {
        assertTrue(b.ifConnected(c));
    }

    @Test
    public void bCanReachA() {
        assertTrue(c.ifConnected(d));
    }
    @Test
    public void hCanReachD() {
        assertTrue(h.ifConnected(d));
    }
//    @Test
//    public void aToANumOfHopsShouldBe0() {
//        assertEquals(0, a.getMinHops(a));
//    }
//    @Test
//    public void hToBNumOfHopsShouldBe1() {
//        assertEquals(1, h.getMinHops(b));
//    }
//    @Test
//    public void bToDNumOfHopsShouldBe2() {
//        assertEquals(2, b.getMinHops(d));
//    }
//    @Test
//    public void hToENumOfHopsShouldBe3() {
//        assertEquals(3, h.getMinHops(e));
//    }
//    @Test
//    public void eToFNumOfHopsShouldBe3() {
//        assertEquals(3, h.getMinHops(e));
//    }
//
//    @Test
//    public void cToBNumOfHopsShouldBe2() {
//        assertEquals(2, c.getMinHops(b));
//    }

}
