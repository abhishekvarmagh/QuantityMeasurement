package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length length1 = new Length(Unit.FEET, 0.0);
        Length length2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length length1 = new Length(Unit.FEET, 0.0);
        Length length2 = new Length(Unit.FEET, 1.0);
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void givenReferenceForFeet_ShouldReturnEqual() {
        Length length1 = new Length(Unit.FEET, 0.0);
        Length length2 = length1;
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenNullForFeet_ShouldReturnFalse() {
        Length length1 = new Length(Unit.FEET, 0.0);
        Length length2 = null;
        Assert.assertNotEquals(length1, length2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReferenceForInch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenNullForInch_ShouldReturnNotEquals() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAndOInch_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length inch = new Length(Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 12.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 3.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length feet = new Length(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() {
        Length inch = new Length(Unit.INCH, 36.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length inch = new Length(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0CmAnd0Cm_ShouldReturnEqual() {
        Length cm1 = new Length(Unit.CM, 0.0);
        Length cm2 = new Length(Unit.CM, 0.0);
        Assert.assertEquals(cm1, cm2);
    }

    @Test
    public void given0CmAnd1Cm_ShouldReturnNotEqual() {
        Length cm1 = new Length(Unit.CM, 0.0);
        Length cm2 = new Length(Unit.CM, 1.0);
        Assert.assertNotEquals(cm1, cm2);
    }

    @Test
    public void given2CmAnd5Cm_ShouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length cm = new Length(Unit.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        double add = inch1.add(inch2);
        Assert.assertEquals(4.0, add, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 2.0);
        double add = feet.add(inch);
        Assert.assertEquals(14.0, add, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        double add = feet1.add(feet2);
        Assert.assertEquals(24.0, add, 0.0);
    }

    @Test
    public void given2InchAndTwoAndHalfCm_WhenAdded_ShouldReturn3Inch() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length cm = new Length(Unit.CM, 2.5);
        double add = inch.add(cm);
        Assert.assertEquals(3.0, add, 0.0);
    }

    @Test
    public void given0GallonAnd0Gallon_WhenEqual_ShouldReturnTrue() {
        Length gallon1 = new Length(Unit.GALLON, 0.0);
        Length gallon2 = new Length(Unit.GALLON, 0.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0GallonAnd1Gallon_WhenNotEqual_ShouldReturnFalse() {
        Length gallon1 = new Length(Unit.GALLON, 0.0);
        Length gallon2 = new Length(Unit.GALLON, 1.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0LitreAnd0Litre_WhenEqual_ShouldReturnTrue() {
        Length litre1 = new Length(Unit.LITRE, 0.0);
        Length litre2 = new Length(Unit.LITRE, 0.0);
        boolean compareCheck = litre1.compare(litre2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0LitreAnd1Litre_WhenNotEqual_ShouldReturnFalse() {
        Length litre1 = new Length(Unit.LITRE, 0.0);
        Length litre2 = new Length(Unit.LITRE, 1.0);
        boolean compareCheck = litre1.compare(litre2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenGallonAndLitre_WhenVolumeAreEqual_ShouldReturnEqual() {
        Length gallon = new Length(Unit.GALLON, 1.0);
        Length litre = new Length(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenLitreAndMl_WhenVolumeAreEqual_ShouldReturnEqual() {
        Length litre = new Length(Unit.LITRE, 1.0);
        Length ml = new Length(Unit.ML, 1000.0);
        boolean compareCheck = litre.compare(ml);
        Assert.assertTrue(compareCheck);
    }

}
