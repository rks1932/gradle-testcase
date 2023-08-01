import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleSearchTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        // Set up the remote WebDriver (Chrome) with the Selenium Grid Hub URL
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
    }

    @Test
    public void testGoogleSearch() {
        // Open Google
        driver.get("https://www.google.com");

        // Perform Google search
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
        driver.findElement(By.name("btnK")).submit();

        // Add any test assertions if needed
        // Example: Assert the title of the page
        // assertEquals("Expected Page Title", driver.getTitle());
    }

    @AfterClass
    public static void tearDown() {
        // Close the WebDriver after the test
        if (driver != null) {
            driver.quit();
        }
    }
}
