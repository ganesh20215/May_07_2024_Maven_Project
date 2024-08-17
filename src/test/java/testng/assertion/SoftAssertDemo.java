package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

    @Test
    public void verifyRediffmailRegisterPage(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement forgotPasswordElement = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
        WebElement createANewElement = driver.findElement(By.xpath("//u[text()='Create a new account']"));
        softAssert.assertFalse(forgotPasswordElement.isDisplayed(),"This element should be displayed");
        softAssert.assertEquals(createANewElement.getText(), "create a new account", "Create a new account this text should be match");
        softAssert.assertAll();
        driver.close();
    }
}
