package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.*;

public class Airport2Test{
    static Airport2 a = new Airport2();
    static Airport2 b = new Airport2();
    static Airport2 c = new Airport2();
    static Airport2 d = new Airport2();
    static Airport2 e = new Airport2();
    static Airport2 f = new Airport2();
    static Airport2 g = new Airport2();
    static Airport2 h = new Airport2();

    static {
        h.addRoute(b);
        b.addRoute(a);
        a.addRoute(f);
        b.addRoute(c);
        c.addRoute(d);
        c.addRoute(e);
        c.addRoute(e);
        e.addRoute(b);
//        h.addRoute(new Route (b,0));
//        b.addRoute(new Route (a,0);
//        a.addRoute(new Route (f,0));
//        b.addRoute(new Route (c,0));
//        c.addRoute(new Route (d,0));
//        c.addRoute(new Route (e,0));
//        c.addRoute(new Route (e,0));
//        e.addRoute(new Route (b,0));
    }


//    static{
//        int[][] weight = new int[8][8];
//        weight[0][1] = 179;
//        weight[0][5] = 72;
//        weight[1][0] = 179;
//        weight[1][2] = 402;
//        weight[1][4] = 312;
//        weight[1][7] = 87;
//        weight[2][1] = 402;
//        weight[2][3] = 426;
//        weight[2][4] = 749;
//        weight[2][4] = 320;
//        weight[3][2] = 426;
//        weight[3][4] = 79;
//        weight[4][1] = 312;
//        weight[4][2] = 749;
//        weight[4][2] = 320;
//        weight[4][3] = 79;
//        weight[5][0] = 72;
//        weight[7][1] = 87;
//
//    }


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
    @Test
    public void aToANumOfHopsShouldBe0() {
        assertEquals(0, a.getHops(a));
    }
    @Test
    public void hToBNumOfHopsShouldBe1() {
        assertEquals(1, h.getHops(b));
    }
    @Test
    public void bToDNumOfHopsShouldBe2() {
        assertEquals(2, b.getHops(d));
    }
    @Test
    public void hToENumOfHopsShouldBe3() {
        assertEquals(3, h.getHops(e));
    }
    @Test
    public void eToFNumOfHopsShouldBe3() {
        assertEquals(3, h.getHops(e));
    }

    @Test
    public void cToBNumOfHopsShouldBe2() {
        assertEquals(2, c.getHops(b));
    }

}
