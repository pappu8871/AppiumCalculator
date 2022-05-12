package com.bridgelabz.appium.test;

import com.bridgelabz.appium.base.Base;
import com.bridgelabz.appium.pages.Calcy;
import org.testng.annotations.Test;

public class CalcyTest extends Base {

    @Test
    public void additionOperation(){
        Calcy cal = new Calcy(driver);
        cal.add();
        cal.subtraction();
        cal.multiply();
        cal.division();
    }
}
