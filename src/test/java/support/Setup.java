package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Setup {
    public static WebDriver driver;
    private static final long DEFAULT_WAIT_TIMEOUT = 40;
    //Open browser dimension web
    public void startweb(String parBrowser) {
        String title;
        try {
            title = driver.getTitle();
        } catch (Exception e) {
            title = "ERROR";
        }
        if (title.equals("ERROR")) {
            switch (parBrowser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    driver.manage().window().maximize();
                    break;
                default:
            }
        }
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        int size = driver.manage().window().getSize().getWidth();
        if (size < 1400) {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }
    }
    //Open browser dimension mobile
    public void startmobile(String parBrowser) {
        String title;
        try {
            title = driver.getTitle();
        } catch (Exception e) {
            title = "ERROR";
        }
        if (title.equals("ERROR")) {
            switch (parBrowser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    driver.manage().window();
                    break;
                default:
            }
        }
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(400, 792));
    }
    private String getAttributeType(String... parType) {
        String type;
        if (parType.length == 0) {
            type = "id";
        } else {
            type = parType[0];
        }
        return type;
    }
    private By getLocatorBy(String parValue, String... parType) {
        final String selector = getAttributeType(parType);
        switch (selector) {
            case "id":
                return By.id(parValue);
            case "name":
                return By.name(parValue);
            case "css":
                return By.cssSelector(parValue);
            case "xpath":
                return By.xpath(parValue);
            case "link":
                return By.linkText(parValue);
            case "class":
                return By.className(parValue);
            case "tag":
                return By.tagName(parValue);
            default:
                return By.id(parValue);
        }
    }
    public WebElement findElement(String parValue, String... parType) {
        final By locator = getLocatorBy(parValue, parType);
        WebElement element;
        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            element = null;
        }
        return element;
    }
    public void click(String parValue, String... parType) {
        final WebElement element = findElement(parValue, parType);
        element.click();
    }
    public void openURL(String parURL) {
        driver.get(parURL);
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void quit() {
        driver.quit();
    }
    public void sendKeys(String parText, String parValue, String parType) {
        final WebElement element = findElement(parValue, parType);
        element.clear();
        element.sendKeys(parText);
    }
    public void assertStrings(String expected, String actual) {
        try {
            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            throw e;
        }
    }
}