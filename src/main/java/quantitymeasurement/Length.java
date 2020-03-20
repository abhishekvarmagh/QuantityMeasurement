package quantitymeasurement;

public class Length {

    private Unit unit;
    private double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        Double firstValue = this.unit.conversionValue * this.value;
        Double secondValue = that.unit.conversionValue * that.value;
        return firstValue.equals(secondValue);
    }

    public double add(Length that) {
        double firstValue = this.unit.conversionValue * this.value;
        double secondValue = that.unit.conversionValue * that.value;
        return firstValue + secondValue;
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
