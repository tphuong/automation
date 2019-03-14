package Ex2Upgrade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.How;

public class Ex2UpgradeMain {
    public static WebDriver driver;
    public static void main (String []args) throws InterruptedException {

        openBrowser("Chrome");
        visitWebsite("https://the-internet.herokuapp.com/login");

        fill(getElement(How.NAME,"username"),"tomsmith");
        fill(getElement(How.NAME,"password"),"SuperSecretPassword!");

        login(How.TAG_NAME,"button");
        Thread.sleep(2000);
        logout(How.CLASS_NAME,"button"); //how to add full class name "button secondary radius"

        Thread.sleep(2000);
        driver.quit();
    }

    public static WebElement getElement(How how, String locator){
        return driver.findElement(how.buildBy(locator));
    }

    public static void login(How how, String locator){
        driver.findElement(how.buildBy(locator)).submit();
    }

    public static void logout(How how, String locator){
        driver.findElement(how.buildBy(locator)).click();
    }

    public static void fill (WebElement element, String withInputText){
        element.sendKeys(withInputText);
    }

    public static void visitWebsite(String url){
        driver.get(url);
    }

    public static void openBrowser(String url){
        String urlTemp = url.toLowerCase();
        switch (urlTemp){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.gecko.driver", "Drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser: "+url+" is not available");
        }

    }
}
