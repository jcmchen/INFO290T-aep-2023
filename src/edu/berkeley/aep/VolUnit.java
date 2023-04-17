package edu.berkeley.aep;
// Understands how to compare quantities in different units
/**
public class VolUnit {

    public int final int vol;

    public int final Unit unit;

    public VolUnit(int vol, Unit unit){
        this.vol = vol;
        this.unit = unit;
    }






    public enum Unit {
        TBSP(3), TSP(1), OZ(6), CUP(48);

        private int conversionFactor;

        Unit(int conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public int convertToTSP(int vol){
            return vol*conversionFactor;
        }
    }

    //only call in class -> private
    private VolUnit convertVolUnit(Unit newUnit){
        int newVol = unit.convertToTSP(this.vol)/newUnit.convertToTSP(1);
        return new VolUnit(newVol, newUnit);
    }

    @Override
    public boolean equals(Object other){
        if (other == this) return true;
        if (!(other instanceof VolUnit volunit)) return false;
        return this.unit.convertToTSP(this.value());

    }

    @Override








}

 */
