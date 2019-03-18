package Inspect;

import static support.CommonFunctions.*;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import support.Browsers;

import java.util.ArrayList;
import java.util.List;

public class tableTest {
    public static void main(String[] args) {

        openBrowser(Browsers.CHROME);
        navigate("https://the-internet.herokuapp.com/tables");
        List<WebElement> rows = getElements(How.XPATH, "//table[@id='table1']/tbody/tr");
        List<WebElement> columns = getElements(How.XPATH, "//table[@id='table1']/thead/tr/th");

        String cellLocator = "//table[@id='table1']/tbody/tr[%d]/td[%d]";

        List<List<String>> dataRowList = new ArrayList<>();


        for (int i = 1; i <= rows.size(); i++) {
            List<String> cellList = new ArrayList<>();
            for (int j = 1; j <= columns.size(); j++) {

                cellList.add(getElement(How.XPATH, String.format(cellLocator, i, j)).getText());
                //System.out.println(stringList.get(stringList.size() - 1)); test
            }
            dataRowList.add(cellList);
        }

      for (List<String> cellList:dataRowList)
      {
          //for (String cellValue:cellList)
          //{
              //if (cellValue.contains("John"))
          if (cellList.get(1).contains("John"))
          {
                  System.out.println(cellList);
              }
          //}
      }
        driver.quit();

        }

    }
