package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenReferenceForFeet_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement quantityMeasurement2 = quantityMeasurement1;
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenNullForFeet_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement quantityMeasurement2 = null;
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReferenceForInch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenNullForInch_ShouldReturnNotEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAndOInch_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0CmAnd0Cm_ShouldReturnEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CM, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Unit.CM, 0.0);
        Assert.assertEquals(cm1, cm2);
    }

    @Test
    public void given0CmAnd1Cm_ShouldReturnNotEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CM, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Unit.CM, 1.0);
        Assert.assertNotEquals(cm1, cm2);
    }

    @Test
    public void given2CmAnd5Cm_ShouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 2.0);
        double add = inch1.add(inch2);
        Assert.assertEquals(4.0, add, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2.0);
        double add = feet.add(inch);
        Assert.assertEquals(14.0, add, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        double add = feet1.add(feet2);
        Assert.assertEquals(24.0, add, 0.0);
    }

    @Test
    public void given2InchAndTwoAndHalfCm_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 2.5);
        double add = inch.add(cm);
        Assert.assertEquals(3.0, add, 0.0);
    }

    @Test
    public void given0GallonAnd0Gallon_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Unit.GALLON, 0.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0GallonAnd1Gallon_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Unit.GALLON, 1.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0LitreAnd0Litre_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Unit.LITRE, 0.0);
        boolean compareCheck = litre1.compare(litre2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0LitreAnd1Litre_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Unit.LITRE, 1.0);
        boolean compareCheck = litre1.compare(litre2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenGallonAndLitre_WhenVolumeAreEqual_ShouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenLitreAndMl_WhenVolumeAreEqual_ShouldReturnEqual() {
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1000.0);
        boolean compareCheck = litre.compare(ml);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenGallonAndLitre_WhenAdded_ShouldReturnVolumeInLitre() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 3.78);
        double add = gallon.add(litre);
        Assert.assertEquals(7.56,add,0.0);
    }

    @Test
    public void givenLitreAndMl_WhenAdded_ShouldReturnVolumeInLitre() {
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1000.0);
        double add = litre.add(ml);
        Assert.assertEquals(2,add,0.0);
    }

    @Test
    public void given1KgAnd1000Gm_ShouldReturnTrue() {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kg_ShouldReturnTrue() {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_ShouldReturn1001Kg() {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 1000.0);
        double add = tonne.add(gram);
        Assert.assertEquals(1001,add,0.0);
    }

}
