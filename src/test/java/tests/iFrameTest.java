package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class iFrameTest extends BaseTest {

    @Test
    public void useFrame() {
        iFramePage.openUrlIFrame()
                .useFrame();

        assertEquals(iFramePage.textFrame(), "Your content goes here.");
    }
}
