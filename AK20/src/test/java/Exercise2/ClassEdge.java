package Exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassEdge {
    public void testEdge (String Url) {
        System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(Url);
    }
}
