package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public ContextMenuPage openContextMenu() {
        driver.get(URL + "context_menu");
        return this;
    }

    public ContextMenuPage rightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot")))
                .build()
                .perform();
        return this;
    }

    public ContextMenuPage clickAlert() {
        Alert alert = driver.switchTo().alert();
        return this;
    }

    public String alertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

}
