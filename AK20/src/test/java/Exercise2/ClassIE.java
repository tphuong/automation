package Exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClassIE {
    public void testIE (String Url){
        System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(Url);
    }
}
