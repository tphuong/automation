package Inspect;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import support.Browsers;

import static support.CommonFunctions.*;

public class DropdownTest {
    public static void main (String []args){
        openBrowser(Browsers.CHROME);
        navigate("https://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(getElement(How.ID,"dropdown"));
        dropdown.selectByValue("1");
    }
}
