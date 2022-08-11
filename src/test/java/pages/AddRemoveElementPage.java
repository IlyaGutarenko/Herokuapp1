package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementPage extends BasePage {

    String addButtonLocator = "//button[@onclick='addElement()']";
    String deleteButtonLocator = "[onclick='deleteElement()']";

    public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemoveElements() {
        driver.get(URL + "add_remove_elements/");
    }

    public void add2Button() {
        WebElement addButton = driver.findElement(By.xpath(addButtonLocator));
        addButton.click();
        addButton.click();
    }

    public int getSizeListDeleteButton() {
        List<WebElement> deleteButton = driver.findElements(By.cssSelector(deleteButtonLocator));
        return deleteButton.size();
    }

    public void deleteButtonByIndex1(){
        List<WebElement> deleteButton = driver.findElements(By.cssSelector(deleteButtonLocator));
        deleteButton.get(1).click();
    }
}
