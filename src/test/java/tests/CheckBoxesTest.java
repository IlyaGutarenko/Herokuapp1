package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void checkBoxes1False() {
        checkBoxesPage.openCheckBoxes();

        assertFalse(checkBoxesPage.checkBoxByIndex0IsSelected());
    }

    @Test
    public void checkBoxes2True() {
        checkBoxesPage.openCheckBoxes();

        assertTrue(checkBoxesPage.checkBoxByIndex1IsSelected());
    }

    @Test
    public void clickCheckBox1AndEqualsTrue() {
        checkBoxesPage.openCheckBoxes()
                .clickCheckboxByIndex0();

        assertTrue(checkBoxesPage.checkBoxByIndex0IsSelected());
    }

    @Test
    public void clickCheckBox2AndEqualsFalse() {
        checkBoxesPage.openCheckBoxes()
                .clickCheckboxByIndex1();

        assertFalse(checkBoxesPage.checkBoxByIndex1IsSelected());
    }

    @Test
    public void clickCheckBox1AndEqualCheckBox1TrueAndCheckBoxTrue() {
        checkBoxesPage.openCheckBoxes()
                .clickCheckboxByIndex0();

        assertTrue(checkBoxesPage.checkBoxByIndex1IsSelected() && checkBoxesPage.checkBoxByIndex0IsSelected());
    }

}
