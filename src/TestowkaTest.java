import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestowkaTest
{

    static WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver = new FirefoxDriver();
    }

    @Test
    public void ShouldTestowkaPlPageBeOpenable() {
        driver.get("http://commoda.com.pl");

        assertEquals(driver.getTitle(), "Commoda - Bajeczne dodatki do rekodzieła");

        System.out.println("Poprawnie wyświetlona strona - nagłowek się zgadza.");
    }

    @Test
    public void Selenium() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.testarena.pl/zaloguj");

        driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");

        driver.findElement(By.id("login")).click();

        System.out.println("Poprawne logowanie do testarena.pl");

        driver.close();

    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
