package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestFireFox {
    private String url;
    private WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        url = "http://login.multidetect.eu";
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);

    }

    @Test
    public void testLogin()
    {
        WebElement loginField = driver.findElement(By.name("login"));
        loginField.sendKeys("p.polanowski@aberit.eu");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("xxxxxx");



    }




}

