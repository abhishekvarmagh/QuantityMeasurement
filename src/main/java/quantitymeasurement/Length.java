package quantitymeasurement;

import java.util.Objects;

public class Length {

    enum Unit{
        FEET, INCH;
    }

    private Unit unit;
    private double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
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