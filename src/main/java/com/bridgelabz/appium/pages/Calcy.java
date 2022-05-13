package com.bridgelabz.appium.pages;

import com.bridgelabz.appium.base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Calcy extends Base {
  @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
  @CacheLookup
    private AndroidElement plusdigitbtn1;
  @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"plus\"]")
  @CacheLookup
    private AndroidElement plusBtn;
  @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    @CacheLookup
    private AndroidElement plusdigitbtn2;
   @AndroidFindBy(id=("com.android.calculator2:id/result"))
    @CacheLookup
    private AndroidElement addresult;
  @AndroidFindBy(id = "com.android.calculator2:id/eq")
    @CacheLookup
    private AndroidElement equalsAdd;
  @AndroidFindBy(id = "com.android.calculator2:id/clr")
    @CacheLookup
    private AndroidElement clearadd;

  @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
  @CacheLookup
  private AndroidElement subsdigitbtn1;
  @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"minus\"]")
  @CacheLookup
  private AndroidElement subsBtn;
  @AndroidFindBy(id = "com.android.calculator2:id/digit_5")
  @CacheLookup
  private AndroidElement subsdigitbtn2;
  @AndroidFindBy(id=("com.android.calculator2:id/result"))
  @CacheLookup
  private AndroidElement subtractionresult;
  @AndroidFindBy(id = "com.android.calculator2:id/eq")
  @CacheLookup
   private AndroidElement equalssubs;
  @AndroidFindBy(id = "com.android.calculator2:id/clr")
  @CacheLookup
      private AndroidElement clearsubs;


  @AndroidFindBy(id = "com.android.calculator2:id/digit_4")
  @CacheLookup
  private AndroidElement multiplydigitbtn1;
  @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"multiply\"]")
  @CacheLookup
  private AndroidElement multiplyBtn;
  @AndroidFindBy(id = "com.android.calculator2:id/digit_5")
  @CacheLookup
  private AndroidElement multiplydigitbtn2;
  @AndroidFindBy(id=("com.android.calculator2:id/result"))
  private AndroidElement multiplyresult;
    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    @CacheLookup
      private AndroidElement equalsmultiyply;
    @AndroidFindBy(id = "com.android.calculator2:id/clr")
    @CacheLookup
      private AndroidElement clearmultiply;


  @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
  @CacheLookup
  private AndroidElement dividdigitbtn1;
  @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"divide\"]")
  @CacheLookup
  private AndroidElement divideBtn;
  @AndroidFindBy(id = "com.android.calculator2:id/digit_3")
  @CacheLookup
  private AndroidElement dividdigitbtn2;
  @AndroidFindBy(id= ("com.android.calculator2:id/result"))
  private AndroidElement dividresult;
  @AndroidFindBy(id = "com.android.calculator2:id/eq")
  @CacheLookup
    private AndroidElement equalsdivid;
  @AndroidFindBy(id = "com.android.calculator2:id/clr")
  @CacheLookup
    private AndroidElement cleardivid;


  public Calcy(){}

  public Calcy(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

  public void addition(){
    plusdigitbtn1.click();
    plusBtn.click();
    plusdigitbtn2.click();
    addresult.getText();
    equalsAdd.click();
    clearadd.click();
  }

  public void subtraction(){
    subsdigitbtn1.click();
    subsBtn.click();
    subsdigitbtn2.click();
    subtractionresult.getText();
     equalssubs.click();
     clearsubs.click();
  }

  public void multiply(){
      multiplydigitbtn1.click();
      multiplyBtn.click();
      multiplydigitbtn2.click();
      multiplyresult.getText();
      equalsmultiyply.click();
      clearmultiply.click();
  }

  public void division(){
       dividdigitbtn1.click();
       divideBtn.click();
       dividdigitbtn2.click();
       dividresult.getText();
       equalsdivid.click();
       cleardivid.click();
  }

//    public void add(){
//      driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//      driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
//      driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//      String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//      System.out.println("Result of addition " + result);
//      Assert.assertEquals(result, "2");
//      driver.findElement(By.id("com.android.calculator2:id/eq")).click();
//      driver.findElement(By.id("com.android.calculator2:id/clr")).click();
//
//    }
//
//  public void subtraction() {
//    driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
//    driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
//    String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//    System.out.println("Result of subtraction " + result);
//    Assert.assertEquals(result, "4");
//    driver.findElement(By.id("com.android.calculator2:id/eq")).click();
//    driver.findElement(By.id("com.android.calculator2:id/clr")).click();
//  }
//
//
//  public void multiply() {
//    driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
//    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
//    driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
//    String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//    System.out.println("Result of multiply " + result);
//    Assert.assertEquals(result, "20");
//    driver.findElement(By.id("com.android.calculator2:id/eq")).click();
//    driver.findElement(By.id("com.android.calculator2:id/clr")).click();
//  }
//
//
//  public void division() {
//    driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"divide\"]")).click();
//    driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
//    String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//    System.out.println("Result of division " + result);
//    Assert.assertEquals(result, "3");
//    driver.findElement(By.id("com.android.calculator2:id/eq")).click();
//    driver.findElement(By.id("com.android.calculator2:id/clr")).click();
//  }

}
