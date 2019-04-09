package Test;

import Configuration.DefaultTestConfiguration;
import Configuration.DefaultTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTestsChrome {

    WebDriver driver = new FirefoxDriver();

    @BeforeTest()
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
    }

    @Test(priority = 1)
    public void shouldLoginAsUser() {

        driver.get("http://login.multidetect.eu");
        driver.findElement(By.name("username")).sendKeys("p.polanowski@aberit.eu");
        driver.findElement(By.name("password")).sendKeys("xxxxxx");
        driver.findElement(By.cssSelector("button[class*='el-button']")).click();
        assertEquals(driver.getTitle(), "Logowanie");

        System.out.println("Poprawne logowanie");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

