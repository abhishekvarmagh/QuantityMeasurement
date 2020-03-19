package quantitymeasurement;

import java.util.Objects;

public class Length {

    private LengthUnit.UnitType unit;
    private double value;

    public Length(LengthUnit.UnitType unit, double value) {
        this.unit = unit;
        this.value = value;
    }


    public boolean compare(Length that) {
        double firstValue = this.unit.getUnitValue(this.value);
        double secondValue = that.unit.getUnitValue(that.value);
        return Objects.equals(firstValue, secondValue);
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
