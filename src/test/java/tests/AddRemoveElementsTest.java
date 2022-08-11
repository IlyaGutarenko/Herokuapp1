package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void add2ButtonAndEqualsSize(){
        addRemoveElementPage.openAddRemoveElements();
        addRemoveElementPage.add2Button();
        assertEquals(addRemoveElementPage.getSizeListDeleteButton(),2, "количество элементов не равно 2");

    }

    @Test
    public void delete1ButtonAndEqualsSize(){
        addRemoveElementPage.openAddRemoveElements();
        addRemoveElementPage.add2Button();

        addRemoveElementPage.deleteButtonByIndex1();
        assertEquals(addRemoveElementPage.getSizeListDeleteButton(),1, "количество элементов не равно 2");

    }
}
