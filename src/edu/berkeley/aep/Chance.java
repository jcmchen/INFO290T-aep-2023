package edu.berkeley.aep;

public class Chance {
    private final double probability;

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Chance)) return false;
        return Double.compare(((Chance) other).probability, probability) == 0;
    }


    @Override
    public int hashCode() {
        return Double.hashCode(probability);
    }


    public Chance(double probability) {
        this.probability = probability;
    }


    public Chance not() {
        return new Chance(1-probability);
    }


    public Chance and( Chance anotherChance) {
        return new Chance(anotherChance.probability * probability);
    }


    // P(a||b) = P(a) + P(b) - P(a) * P(b)
    public Chance or( Chance anotherChance) {
        return new Chance(anotherChance.probability + probability - anotherChance.probability * probability);
    }


    // P(a||b) = !(!P(a) && !P(b))
    public Chance anotherOr( Chance anotherChance) {
        // !(!P(a) && !P(b)) DeMorgan's Law
        return new Chance(anotherChance.not().and(this.not()).not().probability);
    }
}



