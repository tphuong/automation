import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class exerciseBtn {

    public void Btn(String URL) throws InterruptedException {

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

        List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));

        boolean bStatus = false;

        bStatus =rdBtn_Sex.get(0).isSelected();

        if (bStatus == true){
            rdBtn_Sex.get(1).click();
        }else rdBtn_Sex.get(0).click();

        WebElement radioBtn_Exp = driver.findElement(By.id("exp-2"));
        radioBtn_Exp.click();

        List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
        int iSize = chkBx_Profession.size();
        for (int i = 0; i < iSize; i++){
            String sValue = chkBx_Profession.get(i).getAttribute("Value");
            if (sValue.equalsIgnoreCase("Automation Tester")){
                chkBx_Profession.get(i).click();
                break;
            }
        }

        WebElement chkBx_Tool = driver.findElement(By.cssSelector("input[value = 'Selenium IDE']"));
        chkBx_Tool.click();

        Thread.sleep(100000);
        driver.quit();

    }


}
