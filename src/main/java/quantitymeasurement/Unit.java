package quantitymeasurement;

public enum Unit {
    FEET(12), INCH(1), YARD(36), CM(1 / 2.5),
    GALLON(3.78), LITRE(1), ML(1d/1000);

    public final double conversionValue;

    Unit(double conversionValue) {
        this.conversionValue = conversionValue;
    }

}
