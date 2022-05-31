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
        Assert.assertEquals(2, calculator.getSum("jfkdshjkfdhjk3h32kl4j32k%^^)(%$#@$@#$@#10o2"));
    }

}
