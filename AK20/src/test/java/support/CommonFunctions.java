package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.How;

import java.util.List;

public class CommonFunctions {
    public static WebDriver driver;

    public static void navigateBack(){
        driver.navigate().back();
    }

    public static void navigate(String url){
        driver.navigate().to(url);
    }

    public static void checkboxSelect(How how, String locator){
        if (!getElement(how,locator).isSelected())
        {
            getElement(how,locator).click();
        }
    }

    public static void click(How how, String locator){
        getElement(how,locator).click();
    }

    public static WebElement getElement(How how, String locator) {
        return driver.findElement(how.buildBy(locator));
    }

    public static List<WebElement> getElements (How how, String locator){
        return driver.findElements(how.buildBy(locator));
    }

    public static void login() {
        getElement(How.TAG_NAME, "button").submit();
    }

    public static void logout() {
        getElement(How.CLASS_NAME, "button").click();//how to add full class name "button secondary radius"
        // driver.findElement(how.buildBy(locator)).click();
    }

    /*
    The method used to fill a text into a field
    */
    public static void fill(How how, String locator, String withInputText) {
        getElement(how, locator).sendKeys(withInputText);
    }
    /*
    The method use to navigate to specific URL
     */
    public static void visitWebsite(String url) {
        driver.get(url);
    }

    public static void openBrowser(Browsers browser) {
        //String urlTemp = browser.toLowerCase();
        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case IE:
                System.setProperty("webdriver.gecko.driver", "Drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case EDGE:
                System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser: " + browser + " is not supported");
        }

    }
}
