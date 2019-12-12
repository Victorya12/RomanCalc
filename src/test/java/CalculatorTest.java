import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class CalculatorTest {


    /**
     * Test of convertToRoman method, of class RomanCalculator.
     */
    @Test
    public void testConvertToRoman() {
        System.out.println("convertToRoman");
        int num = 27;
        String expResult = "XXVII";
        String result = RomanCalculator.convertToRoman(num);
        assertEquals(expResult, result);
        num = 30;
        expResult = "XXX";
        result = RomanCalculator.convertToRoman(num);
        assertEquals(expResult, result);
        num = 9;
        expResult = "IX";
        result = RomanCalculator.convertToRoman(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateResult method, of class RomanCalculator.
     */
    @Test
    public void testCalculateResultRoman() {
        System.out.println("calculateResult");
        RomanCalculator instance = new RomanCalculator("X",'+',"IX");
        String expResult = "XIX";
        String result = instance.calculateResult();
        assertEquals(expResult, result);
        instance = new RomanCalculator("VI",'/',"III");
        expResult = "II";
        result = instance.calculateResult();
        assertEquals(expResult, result);
        instance = new RomanCalculator("VI",'+',"X");
        expResult = "XVI";
        result = instance.calculateResult();
        assertEquals(expResult, result);
    }

    /**
     * Test of convertToInt method, of class RomanCalculator.
     */
    @Test
    public void testConvertToInt() {
        System.out.println("convertToInt");
        RomanCalculator instance = new RomanCalculator("",' ',"");
        String num = "X";
        int expResult = 10;
        int result = instance.convertToInt(num);
        assertEquals(expResult, result);
        num = "IX";
        expResult = 9;
        result = instance.convertToInt(num);
        assertEquals(expResult, result);
        num = "IV";
        expResult = 4;
        result = instance.convertToInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateResultArabic() {
        System.out.println("calculateResult");
        ArabicCalculator instance = new ArabicCalculator(9,'/',9);
        double expResult = 1;
        double result = instance.calculateResult();
        assertEquals(expResult, result, 0.0);
        instance = new ArabicCalculator(10,'-',10);
        expResult = 0;
        result = instance.calculateResult();
        assertEquals(expResult, result, 0.0);
        instance = new ArabicCalculator(5,'+',4);
        expResult = 9;
        result = instance.calculateResult();
        assertEquals(expResult, result, 0.0);
    }
}
