package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultTestConfiguration {
    WebDriver driverFireFox = new FirefoxDriver();
    WebDriver driverChrome = new ChromeDriver();
    WebDriver driverOpera = new OperaDriver();
    WebDriver driverInternetExplorer = new InternetExplorerDriver();


    }


