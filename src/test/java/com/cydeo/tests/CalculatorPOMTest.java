package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CalculatorPOMTest {
    CalculatorPage calculatorPage=new CalculatorPage();

    @Test
    public void test() {
        calculatorPage.clickSingleDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickSingleDigit(8);
        calculatorPage.equals.click();
        System.out.println(calculatorPage.result.getText());
        Assertions.assertEquals("40",calculatorPage.result.getText());


    }


}
