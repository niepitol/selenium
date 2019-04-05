import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
/*
public class DefaultTest {

    protected static WebDriver driver;

    @BeforeTest()
    public void BeforeTest() {
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
        driver.get("http://login.multidetect.eu");
    }

    @AfterSuite()
    public void AfterSuite()
    {
        driver.quit();
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
    public void souldTryLoginWithFakePassword()
    {
        driver = new FirefoxDriver();

        driver.get("http://login.multidetect.eu");

        driver.findElement(By.name("username")).sendKeys("x");

        driver.findElement(By.name("password")).sendKeys("y");
        driver.findElement(By.cssSelector("button[class*='el-button']")).click();

        assertEquals(driver.getTitle(),"Logowanie");

        System.out.println("Próba nieudana");
    }

}

*/