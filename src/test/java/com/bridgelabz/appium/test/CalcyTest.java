package com.bridgelabz.appium.test;

import com.bridgelabz.appium.base.Base;
import com.bridgelabz.appium.pages.Calcy;
import org.testng.annotations.Test;

public class CalcyTest extends Base {

    @Test(priority = 1)
    public void additionOperation() {
        Calcy cal = new Calcy(driver);
        cal.addition();
    }
    @Test(priority = 2)
    public void subtarction(){
        Calcy cal = new Calcy(driver);
        cal.subtraction();

    }
    @Test(priority = 3)
    public void multiply(){
        Calcy cal = new Calcy(driver);
        cal.multiply();
    }
    @Test(priority = 4)
    public void division(){
        Calcy cal = new Calcy(driver);
        cal.division();
    }
    }

