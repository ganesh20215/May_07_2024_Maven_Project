package testng.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAndAfterMethod_1 {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); //Upcasting
    }


    @Test
    public void testForRediffmail_1() throws InterruptedException {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void testForFlipkart_1() throws InterruptedException {
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void testForFacebook_1() throws InterruptedException {
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }

}
