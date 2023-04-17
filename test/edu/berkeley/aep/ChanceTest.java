package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {
    @Test
    public void shouldWork() {
        Chance chance = new Chance(0.5);
        assertEquals(chance, chance);
    }

    @Test
    public void coinTossShouldBeACoinToss() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        assertEquals(coinToss, anotherCoinToss);
    }


    @Test
    public void notOfCoinTossShouldBeACoinToss() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        assertEquals(anotherCoinToss, coinToss.not());
    }


    @Test
    public void coinTossAndHappen() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        Chance tossTwice = new Chance(0.25);
        assertEquals(tossTwice, coinToss.and(anotherCoinToss));
    }


    @Test
    public void coinTossOrHappen() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        Chance tossTwice = new Chance(0.75);
        assertEquals(tossTwice, coinToss.or(anotherCoinToss));
    }


    @Test
    public void coinTossAnotherOrHappen() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        Chance tossTwice = new Chance(0.75);
        assertEquals(tossTwice, coinToss.anotherOr(anotherCoinToss));
    }

}
