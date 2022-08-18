package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class iFramePage extends BasePage {

    public static final By FRAME = By.id("mce_0_ifr");
    public static final By TEXT_FRAME = By.id("tinymce");


    public iFramePage(WebDriver driver) {
        super(driver);
    }

    public iFramePage openUrlIFrame() {
        driver.get(URL + "iframe");
        return this;
    }

    public iFramePage useFrame() {
        WebDriver frame = driver.switchTo().frame(driver.findElement(FRAME));
        return this;
    }

    public String textFrame() {
        return driver.findElement(TEXT_FRAME).getText();

    }
}
