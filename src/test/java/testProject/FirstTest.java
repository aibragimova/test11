package testProject;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FirstTest {
    @Test
    public void firstTest(){
    System.setProperty("webdriver.chrome.driver","/WorkSpace/testProject/drivers/chromedriver.exe");
   ChromeDriver driver =new ChromeDriver();
   driver.get("http://woolwave.com/");
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ButtomContact = driver.findElement(By.cssSelector("#menu-item-23>a"));
        ButtomContact.click();

        WebElement ApplicationFormName =driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-text.wpcf7-validates-as-required"));
        ApplicationFormName.sendKeys("Aliia");

        WebElement ApplicationFormEmail =driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-text.wpcf7-email.wpcf7-validates-as-required.wpcf7-validates-as-email"));
        ApplicationFormEmail.sendKeys("aibragimova@mail.com");

        WebElement ApplicationFormPhone =driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-text.wpcf7-tel.wpcf7-validates-as-required.wpcf7-validates-as-tel"));
        ApplicationFormPhone.sendKeys("1233211111");

        WebElement ApplicationFormMessage =driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-textarea"));
        ApplicationFormMessage.sendKeys("Hello my test project");

        WebElement SubmitForm = driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-submit"));
        SubmitForm.click();

        driver.quit();




    }
}
