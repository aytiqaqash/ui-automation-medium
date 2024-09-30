package dev.aytiqaqash;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://aytiqaqash.dev/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
