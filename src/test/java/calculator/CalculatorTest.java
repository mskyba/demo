package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final calculatordemo.Calculator calculator = new calculatordemo.Calculator();
    private final calculatordemo.InputHelper inputHelper = new calculatordemo.InputHelper();



    @Test
    public void getDigitsLarger0() {
        Assert.assertNotNull(inputHelper.getDigits());
    }

    @Test
    public void testSum() {
        Assert.assertEquals(3, calculator.getSum("lmvm;v ;ls ;lsje 10l;k;df )(%U@10kmo 2"));
    }

}
