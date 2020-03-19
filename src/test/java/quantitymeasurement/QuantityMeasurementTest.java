package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length length1 = new Length(LengthUnit.UnitType.FEET,0.0);
        Length length2 = new Length(LengthUnit.UnitType.FEET,0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length length1 = new Length(LengthUnit.UnitType.FEET,0.0);
        Length length2 = new Length(LengthUnit.UnitType.FEET,1.0);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenReferenceForFeet_ShouldReturnEqual() {
        Length length1 = new Length(LengthUnit.UnitType.FEET,0.0);
        Length length2 = length1;
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenNullForFeet_ShouldReturnFalse() {
        Length length1 = new Length(LengthUnit.UnitType.FEET,0.0);
        Length length2 = null;
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(LengthUnit.UnitType.INCH,0.0);
        Length inch2 = new Length(LengthUnit.UnitType.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(LengthUnit.UnitType.INCH,0.0);
        Length inch2 = new Length(LengthUnit.UnitType.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenReferenceForInch_ShouldReturnEqual() {
        Length inch1 = new Length(LengthUnit.UnitType.INCH,0.0);
        Length inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenNullForInch_ShouldReturnFalse() {
        Length inch1 = new Length(LengthUnit.UnitType.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given0FeetAndOInch_ShouldReturnEqual() {
        Length feet = new Length(LengthUnit.UnitType.FEET,0.0);
        Length inch = new Length(LengthUnit.UnitType.INCH,0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(LengthUnit.UnitType.FEET,1.0);
        Length inch = new Length(LengthUnit.UnitType.INCH,1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(LengthUnit.UnitType.FEET,1.0);
        Length feet2 = new Length(LengthUnit.UnitType.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(LengthUnit.UnitType.INCH,1.0);
        Length inch2 = new Length(LengthUnit.UnitType.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        Length feet = new Length(LengthUnit.UnitType.FEET,1.0);
        Length inch = new Length(LengthUnit.UnitType.INCH,12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        Length inch = new Length(LengthUnit.UnitType.INCH,12.0);
        Length feet = new Length(LengthUnit.UnitType.FEET,1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

}
