package dev.aytiqaqash;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        // chromedriver-i quraşdır və driver obyektini yarat
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://tecrube.aytiqaqash.xampp/yeni_tab_ach");

        Thread.sleep(5000);

        driver.close();

        // driver.quit();
    }
}
