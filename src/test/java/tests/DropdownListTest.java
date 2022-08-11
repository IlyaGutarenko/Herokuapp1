package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownListTest extends BaseTest {




    @Test
    public void dropdownSelect1() {
        dropdownListPage.openDropdownList();

        assertEquals(dropdownListPage.select(), 3);

        dropdownListPage.выбираемЭлемент();
        assertEquals(dropdownListPage.select().getFirstSelectedOption().getText(), "Option 1");
    }

    @Test
    public void dropdownSelect2() {
        dropdownListPage.openDropdownList();
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        List options = select.getOptions();
        assertEquals(options.size(), 3);

        select.selectByIndex(2);
        assertEquals(select.getFirstSelectedOption().getText(), "Option 2");
    }
}
