package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AddRemoveElementPage;
import pages.CheckBoxesPage;
import pages.DropdownListPage;
import pages.DynamicControlsPage;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class BaseTest {

    WebDriver driver;
    AddRemoveElementPage addRemoveElementPage;
    DropdownListPage dropdownListPage;
    CheckBoxesPage checkBoxesPage;
    DynamicControlsPage dynamicControlsPage;

    @BeforeTest
    public void setUp(){
        chromedriver().setup(); //установка драйвера из вне
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // полное окно
        options.addArguments("--headless"); //без запуска браузера
        driver = new ChromeDriver(options); //драйвер с опциями
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // время ожидания страницы
        addRemoveElementPage = new AddRemoveElementPage(driver);
        dropdownListPage = new DropdownListPage(driver);
        checkBoxesPage = new CheckBoxesPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
