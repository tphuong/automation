import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class btnMultipleSelects {
    public void btnMultipleSelects (String URL) {

        String PROXY = "proxy.adnovum.vn:3128";

        Proxy proxy;
        proxy = new Proxy();
        proxy.setHttpProxy(PROXY)
                .setFtpProxy(PROXY)
                .setSslProxy(PROXY);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY, proxy);

        WebDriver driver = new FirefoxDriver(new FirefoxOptions(cap));
        driver.get(URL);
        // Put an Implicit wait,
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.className("control-group"));

        Select oSelect = new Select(element);
        oSelect.selectByVisibleText("Tester");

    }
}