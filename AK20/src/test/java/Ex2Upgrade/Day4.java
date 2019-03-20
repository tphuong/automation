package Ex2Upgrade;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import support.Browsers;

import java.util.ArrayList;
import java.util.List;

import static support.CommonFunctions.*;
import static support.CommonFunctions.driver;

public class Day4 {
    public class tableTest {
        public static void main(String[] args) {

            openBrowser(Browsers.CHROME);
            navigate("https://the-internet.herokuapp.com/tables");
            List<WebElement> rows = getElements(How.XPATH, "//table[@id='table1']/tbody/tr");
            List<WebElement> columns = getElements(How.XPATH, "//table[@id='table1']/thead/tr/th");

            String cellLocator = "//table[@id='table1']/tbody/tr[%d]/td[%d]";

            //List<String> stringList = new ArrayList<>();
            List<List<String>> dataRowList = new ArrayList<>();

       /* for (int i = 1; i<=rows.size();i++)
        {
            for (int j = 1; j<=columns.size();j++)
            {
                String value = getElement(How.XPATH,String.format(cellLocator,i,j)).getText();
                System.out.println(value);
            }
        }*/
//delete gia tri trong bang, verify co update ko
            // dung mang de store gia tri cua 1 dong hoac 1 bang, dung 1 for la du
/*
        int arrayIndex = 0;
        for (int i = 1; i <= rows.size(); i++) {
            for (int j = 1; j <= columns.size(); j++) {

                stringList.add(getElement(How.XPATH, String.format("//table[@id='table1']/tbody/tr[%d]/td[%d]", i, j)).getText());
                //System.out.println(stringList.get(stringList.size() - 1));
            }
        }
*/
            for (int i = 1; i <= rows.size(); i++) {
                List<String> cellList = new ArrayList<>();
                for (int j = 1; j <= columns.size(); j++) {

                    cellList.add(getElement(How.XPATH, String.format(cellLocator, i, j)).getText());
                    //System.out.println(stringList.get(stringList.size() - 1));
                }
                dataRowList.add(cellList);
            }
        /*for (int i = 0; i < stringList.size(); i++)
        {

            if (stringList.get(i).contains("Smith")) {
                System.out.println(stringList.get(i));
            }
        }*/
      /*  for (String element : stringList)
        {
            if (element.contains("John")) {
                System.out.println(element);
            }
        }
*/
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

            //  stringList.stream().filter(element->element.contains("John")).forEach(element-> System.out.println(element));
            driver.quit();

        }

    }

}
