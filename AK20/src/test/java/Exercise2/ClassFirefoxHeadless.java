package Exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ClassFirefoxHeadless {
    public void FirefoxHeadless (String Url)    {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get(Url);
    }
}