package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void clickButtonRemove(){
        dynamicControlsPage.openDynamicControls()
                .clickButtonRemove();

        assertEquals(dynamicControlsPage.messageAfterClickingTheRemoveButton(), "It's gone!");
    }

    @Test
    public void clickButtonAdd(){
        dynamicControlsPage.openDynamicControls()
                .clickButtonRemove()
                .clickButtonAdd();

        assertEquals(dynamicControlsPage.messagesAfterClickingTheAddButton(),"It's back!");
    }
}
