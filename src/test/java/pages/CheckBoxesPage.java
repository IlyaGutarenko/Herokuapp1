package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPage extends BasePage {

    String checkBox = "[type='checkbox']";

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckBoxes(){
        driver.get(URL + "checkboxes");
    }


    public void clickCheckboxByIndex0 () {
        List<WebElement> checkbox = driver.findElements(By.cssSelector(checkBox));
        checkbox.get(0).click();
    }

    public void clickCheckboxByIndex1 () {
        List<WebElement> checkbox = driver.findElements(By.cssSelector(checkBox));
        checkbox.get(1).click();
    }



}
