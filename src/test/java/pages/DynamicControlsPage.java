package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {

    public static final By REMOVE_BUTTON = By.xpath("//button[text()='Remove']");
    public static final By ADD_BUTTON = By.xpath("//button[text()='Add']");
    public static final By MESSAGE_REMOVE = By.id("message");
    public static final By MESSAGE_ADD = By.id("message");

    public DynamicControlsPage openDynamicControls() {
        driver.get(URL + "dynamic_controls");
        return this;
    }

    public DynamicControlsPage clickButtonRemove() {
        driver.findElement((REMOVE_BUTTON)).click();
        return this;
    }

    public String messageAfterClickingTheRemoveButton() {
        return driver.findElement((MESSAGE_REMOVE)).getText();
    }

    public String messagesAfterClickingTheAddButton() {
        return driver.findElement((MESSAGE_ADD)).getText();
    }

    public DynamicControlsPage clickButtonAdd() {
        driver.findElement((ADD_BUTTON)).click();
        return this;
    }


    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }
}
