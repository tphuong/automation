package Exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassFirefox {
    public void testFirefox(String Url) {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get(Url);
    }
}