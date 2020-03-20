package quantitymeasurement;

public class Length {

    private Unit unit;
    private double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double getValue(Length length) {
        return length.unit.conversionValue * length.value;
    }

    public boolean compare(Length that) {
        if (this.unit.unitType.equals(that.unit.unitType)) {
            Double firstValue = getValue(this);
            Double secondValue = getValue(that);
            return firstValue.equals(secondValue);
        }
        return  false;
    }

    public double add(Length that) {
        if (this.unit.unitType.equals(that.unit.unitType)) {
            double firstValue = getValue(this);
            double secondValue = getValue(that);
            return firstValue + secondValue;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
