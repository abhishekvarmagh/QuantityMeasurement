package quantitymeasurement;

public class LengthUnit {

    public enum UnitType {
        FEET {
            public double getUnitValue(double value) {
                return value * 12.0;
            }
        },
        INCH {
            public double getUnitValue(double value) {
                return value;
            }
        };

        public abstract double getUnitValue(double value);
    }
}
