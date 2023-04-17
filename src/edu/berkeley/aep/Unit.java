package edu.berkeley.aep;

public enum Unit {
    INCH(1), FOOT(12), YARD(36), MILE(1760 * 36),

    CELSIUS(1,0), FAHRENHEIT(1,32);

    private final int factor;
    private final int offset;

    Unit(int factor) {
        this.factor = factor;
        this.offset = 0;
    }

    Unit(int factor, int offset) {
        this.factor = factor;
        this.offset = offset;
    }

    public int convertTo(Unit unit, int magnitude) {
        return magnitude * factor / unit.factor;
    }
}
