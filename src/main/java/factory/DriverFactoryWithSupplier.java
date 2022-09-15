package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactoryWithSupplier {
    private DriverFactoryWithSupplier() {
    }

    private static final Supplier<WebDriver> CHROME = () -> {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> FIREFOX = () -> {
        WebDriverManager.chromedriver().setup();
        return new FirefoxDriver();
    };

    private static final Supplier<WebDriver> EDGE = () -> {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    };
    private static final Map<BrowserType, Supplier<WebDriver>> MYMAP = new HashMap<>();

    static {
        System.out.println("Initializing static variables...\n Static block loads when the class is loaded into memory..");
        MYMAP.put(BrowserType.CHROME, CHROME);
        MYMAP.put(BrowserType.FIREFOX, FIREFOX);
        MYMAP.put(BrowserType.EDGE, EDGE);
    }

    public static WebDriver getDriver(BrowserType browser) {
        return MYMAP.get(browser).get();

    }
}
