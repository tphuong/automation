package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {
    public static void main (String []args){
        System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://google.com");
    }
}
