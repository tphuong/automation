package Ex2Upgrade;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.How;

public class Ex2UpgradeMain {
    public static WebDriver driver;
    private int errorCode;


    public int getErrCode() {
        return errorCode;
    }
    public void setErrCode(int errCode) {
        this.errorCode = errCode;
    }

    public static void main(String[] args) throws InterruptedException {

        openBrowser("Chrome");
        visitWebsite("https://the-internet.herokuapp.com/login");
        fill(How.NAME, "username", "tomsmith");
        fill(How.NAME, "password", "SuperSecretPassword!");
        login();
        Thread.sleep(2000);
        logout();
        Thread.sleep(2000);
        driver.quit();
    }

    /*The method will be returned WebElement
    The method has two arguments ( how and locator)
    The method support get element by Name/ID/XPATH/CSS/TAGNAME
    */
    public static WebElement getElement(How how, String locator) {
        return driver.findElement(how.buildBy(locator));
    }

    public static void login() {
        getElement(How.TAG_NAME, "button").submit();
        //driver.findElement(how.buildBy(locator)).submit();
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

    public static void openBrowser(String browser) {
        String urlTemp = browser.toLowerCase();
        switch (urlTemp) {
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
                System.out.println("Browser: " + browser + " is not available");
        }

    }
}
