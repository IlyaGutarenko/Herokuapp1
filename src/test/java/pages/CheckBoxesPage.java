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
    
    public boolean checkBoxByIndex0IsSelected(){
        List<WebElement> checkbox = driver.findElements(By.cssSelector(checkBox));
        return checkbox.get(0).isSelected();
    }

    public void clickCheckboxByIndex1 () {
        List<WebElement> checkbox = driver.findElements(By.cssSelector(checkBox));
        checkbox.get(1).click();
    }

    public boolean checkBoxByIndex1IsSelected(){
        List<WebElement> checkbox = driver.findElements(By.cssSelector(checkBox));
        return checkbox.get(1).isSelected();
    }




}
