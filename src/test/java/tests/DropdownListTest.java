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
    public void dropDownSizeShouldBe3() {
        dropdownListPage.openDropdownList();

        assertEquals(dropdownListPage.returnDropDownSize(), 3);
    }

    @Test
    public void selectOption1(){
        dropdownListPage.openDropdownList();
        String textSelectedOption =  dropdownListPage.selectOption1AndGetText();

        assertEquals(textSelectedOption, "Option 1" , "text is wrong");
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
