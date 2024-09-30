package dev.aytiqaqash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // 1 - Veb drayveri quraşdıraq
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:/Users/ziko_/Desktop/chromedriver-win64/chromedriver.exe");

        //2- Chrome drayverin obyektini yaradaq.
        WebDriver driver = new ChromeDriver();

        // driver brauzerdə saytımızı açsın
        driver.get("https://aytiqaqash.dev/");
    }
}
