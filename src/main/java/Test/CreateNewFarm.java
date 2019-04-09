package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Configuration.DefaultTestData.userLogin;
import static Configuration.DefaultTestData.userPassword;


public class CreateNewFarm {

    public WebDriver driver;

    @BeforeClass
    public void SetUp()
    {
//        LoginTestFireFox setUp = new LoginTestFireFox();
//        setUp.setUp();
        String url ="http://login.multidetect.eu/login" ;
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @Test(priority = 1)
    public void Login() throws InterruptedException {

//        LoginTestFireFox loginUser = new LoginTestFireFox();
//        loginUser.testLoginUser();
        WebDriverWait wait = new WebDriverWait(driver,3);
        WebElement loginField = driver.findElement(By.name("username"));
        loginField.sendKeys(userLogin);
        System.out.println(userLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(userPassword);
        System.out.println(userPassword);

        WebElement loginButton = driver.findElement(By.cssSelector("button[class*='el-button']"));
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='search-form'] > div > input")));
    }

    @Test(priority = 2)
    public void CreateFarm() {
        WebElement createFarmField = driver.findElement(By.linkText("Utwórz"));
        createFarmField.click();

        String url = driver.getCurrentUrl();
        System.out.println(url);

        for(int i=0;i<1;i++) {

            WebElement nameFarmField = driver.findElement((By.name("name")));
            nameFarmField.sendKeys("Farm"+i);

            WebElement farmCodeField = driver.findElement((By.id("farm-code")));
            farmCodeField.sendKeys(("FCode"+i));

            Select structureFarm = new Select(driver.findElement(By.name("structure")));
            structureFarm.selectByVisibleText("Farm");


        }






    }

}
