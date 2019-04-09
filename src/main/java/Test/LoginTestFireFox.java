package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Configuration.DefaultTestData.*;

public class LoginTestFireFox {
    private WebDriver driver;
    private String url ="http://login.multidetect.eu/login" ;

    @BeforeTest
    public void setUp()
    {
        String url ="http://login.multidetect.eu/login" ;
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @Test(priority = 1)
    public void testLoginUser() {

//        WebDriverWait wait = new WebDriverWait(driver,3);

        WebElement loginField = driver.findElement(By.name("username"));
        loginField.sendKeys(userLogin);
        System.out.println(userLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(userPassword);
        System.out.println(userPassword);

        WebElement loginButton = driver.findElement(By.cssSelector("button[class*='el-button']"));
        loginButton.click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='search-form'] > div > input")));

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"http://login.multidetect.eu/project");
    }
//    @AfterTest
//    public void back()
//    {
//        driver.navigate().refresh();
//    }

}

