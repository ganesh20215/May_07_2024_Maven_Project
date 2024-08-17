package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHomePage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement forgotPasswordElement = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
        WebElement createANewElement = driver.findElement(By.xpath("//u[text()='Create a new account']"));
        Assert.assertTrue(forgotPasswordElement.isDisplayed(),"This element should be displayed");
        Assert.assertEquals(createANewElement.getText(), "create a new account", "Create a new account this text should be match");

        driver.close();
    }
}
