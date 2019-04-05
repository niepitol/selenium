import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
    public static void main (String[] args)
    {
        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://login.multidetect.eu");

        driver.findElement(By.name("username")).sendKeys("p.polanowski@aberit.eu");

        driver.findElement(By.name("password")).sendKeys("xxxxxx");
        driver.findElement(By.cssSelector("button[class*='el-button']")).click();

        System.out.println("Poprawne logowanie");

        driver.quit();

    }
}
