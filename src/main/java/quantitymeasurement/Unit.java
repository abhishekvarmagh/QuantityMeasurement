package quantitymeasurement;

public enum Unit {
    FEET(12), INCH(1), YARD(36), CM(1/2.5);

    public final double conversionValue;

    Unit(double conversionValue) {
        this.conversionValue = conversionValue;
    }

}
