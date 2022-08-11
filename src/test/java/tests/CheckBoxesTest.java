package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest {


    String checkBox = "[type='checkbox']";


    @Test
    public void checkBoxes1False () {
       checkBoxesPage.openCheckBoxes();
       checkBoxesPage.clickCheckboxByIndex0();
        assertFalse(checkbox.get(0).isSelected());
    }

    @Test
    public void checkBoxes2True() {
        checkBoxesPage.openCheckBoxes();
        List<WebElement> checkbox = driver.findElements(By.cssSelector(checkBox));
        assertTrue(checkbox.get(1).isSelected());
    }

    @Test
    public void clickCheckBox1AndEqualsTrue() {
        checkBoxesPage.openCheckBoxes();
        checkBoxesPage.clickCheckboxByIndex0();
        assertTrue(checkbox.get(0).isSelected());
    }

    @Test
    public void clickCheckBox2AndEqualsFalse() {
        checkBoxesPage.openCheckBoxes();
        checkBoxesPage.clickCheckboxByIndex1();
        assertFalse(checkbox.get(1).isSelected());
    }

    @Test
    public void clickCheckBox1AndEqualCheckBox1TrueAndCheckBoxTrue() {
        checkBoxesPage.openCheckBoxes();
        checkBoxesPage.clickCheckboxByIndex0();
        assertTrue(checkbox.get(0).isSelected());
        assertTrue(checkbox.get(1).isSelected());
    }

}
