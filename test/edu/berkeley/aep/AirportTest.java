package edu.berkeley.aep;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportTest {

    @Test
    public void bCanReachB() {
        Airport airportB = new Airport();
        assertTrue(airportB.ifConnected(airportB));
    }

    @Test
    public void hCanReachB() {
        Airport airportB = new Airport();
        Airport airportH = new Airport(airportB);
        assertTrue(airportH.ifConnected(airportB));
    }

    @Test
    public void bCanReachC(){
        Airport airportA = new Airport();
        Airport airportC = new Airport();
        List<Airport> neighbors = new ArrayList<>(Arrays.asList(airportA, airportC));
        Airport airportB = new Airport(neighbors);
        assertTrue(airportB.ifConnected(airportC));
    }

    @Test
    public void hCanReachF(){
        Airport airportF = new Airport();
        Airport airportA = new Airport(airportF);
        Airport airportC = new Airport();
        List<Airport> neighbors = new ArrayList<>(Arrays.asList(airportA, airportC));
        Airport airportB = new Airport(neighbors);
        Airport airportH = new Airport(airportB);

        assertTrue(airportH.ifConnected(airportF));
    }

    @Test
    public void hCannotReachG(){
        Airport airportF = new Airport();
        Airport airportA = new Airport(airportF);
        Airport airportC = new Airport();
        List<Airport> neighbors = new ArrayList<>(Arrays.asList(airportA, airportC));
        Airport airportB = new Airport(neighbors);
        Airport airportH = new Airport(airportB);
        Airport airportG = new Airport();

        assertFalse(airportH.ifConnected(airportG));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addNeighborShouldNotWork() {
        Airport airportA = new Airport();
        Airport airportB = new Airport();
        airportA.addNeighbor(airportB);
    }

}
