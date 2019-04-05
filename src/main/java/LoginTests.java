import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests
{

    protected static WebDriver driver;

    @BeforeTest()
    public void BeforeTest()
    {
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
    }

    @Test(priority = 1)
    public void shouldLoginAsUser()
    {
        driver = new FirefoxDriver();

        driver.get("http://login.multidetect.eu");

        driver.findElement(By.name("username")).sendKeys("p.polanowski@aberit.eu");
        driver.findElement(By.name("password")).sendKeys("xxxxxx");
        driver.findElement(By.cssSelector("button[class*='el-button']")).click();

        assertEquals(driver.getTitle(),"Moja strona");

        System.out.println("Poprawne logowanie");
    }

    @Test(priority = 2)
    public void shouldTryLoginWithFakePassword()
    {
        driver = new FirefoxDriver();

        driver.get("http://login.multidetect.eu");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("p.polanowski@aberit.eu");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("y");
        driver.findElement(By.cssSelector("button[class*='el-button']")).click();

        assertTrue(driver.findElement(By.className("help-block")).getText().equals("Nieprawidłowe dane uwierzytelniające "));

        System.out.println("Próba nieudana");
    }

    @Test(priority = 3)
    public void shouldTryLoginWithFakeLogin()
    {
        driver = new FirefoxDriver();

        driver.get("http://login.multidetect.eu");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("p.polanowski@abert.eu");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("xxxxxx");
        driver.findElement(By.cssSelector("button[class*='el-button']")).click();

        assertEquals(driver.getTitle(),"Logowanie");

        System.out.println("Próba nieudana");
    }
    }

