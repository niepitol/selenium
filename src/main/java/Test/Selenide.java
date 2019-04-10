package Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenide {
    @Test
    public void userCanLoginByUsername(){
        open("http://login.multidetect.eu");
        $(By.name("username")).setValue("p.polanowski@aberit.eu");
        $(By.name("password")).setValue("xxxxxx").pressEnter();

    }
}
