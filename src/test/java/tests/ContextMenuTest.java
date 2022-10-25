package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTest {

    @Test
    public void examinationAlert() {
        contextMenuPage.openContextMenu()
                .rightClick()
                .clickAlert();

        assertEquals(contextMenuPage.alertText(), "You selected a context menu");
    }
}
