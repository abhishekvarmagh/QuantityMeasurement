package quantitymeasurement;

public class QuantityMeasurement {

    private Unit unit;
    private double value;

    public QuantityMeasurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double getValue(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.unit.conversionValue * quantityMeasurement.value;
    }

    public boolean compare(QuantityMeasurement that) {
        if (this.unit.unitType.equals(that.unit.unitType)) {
            Double firstValue = getValue(this);
            Double secondValue = getValue(that);
            return firstValue.equals(secondValue);
        }
        return  false;
    }

    public double add(QuantityMeasurement that) {
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
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                unit == quantityMeasurement.unit;
    }
}
