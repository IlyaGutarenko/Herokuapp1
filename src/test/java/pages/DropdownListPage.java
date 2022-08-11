package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownListPage extends BasePage {


    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownList() {
        driver.get(URL + "dropdown");
    }

    public int returnDropDownSize(){
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element); // для выпадающего списка
        List<WebElement> options = select.getOptions();
        return options.size();

    }
    public String selectOption1AndGetText() {
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        select.selectByIndex(1);
        return select.getFirstSelectedOption().getText();
    }
}

