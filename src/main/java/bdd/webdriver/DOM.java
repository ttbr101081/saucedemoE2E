package bdd.webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DOM {
    private static WebDriver driver;
    private static String url;
    public static WebDriver webDriver() {
        if (driver == null) {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            //String chromeDriverPath = "C:\\Users\\RODRIGO\\OneDrive - berrymuch\\entrevista de trabajo ntt\\procesosSeleccion\\PruebaE2E\\src\\test\\resources\\webdriver\\chromedriver.exe";
            //System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver(co);
        }
        return driver;
    }


    public DOM() {
        PageFactory.initElements(webDriver(), this);
    }
    public static void inciarNavegador(String url) {
        webDriver().get(url);
        webDriver().manage().window().maximize();
    }


    public void onclick(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getText(WebElement element) {
        return element.getText();
    }


    public void quitDriver() {
        webDriver().quit();
    }

    public void drop (WebElement element,String el){
        WebElement dropdown = element;
        dropdown.findElement(By.xpath(el)).click();
    }
    public void scroll(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private final Duration MAX_TIMEOUT=Duration.ofMinutes(10);
    public void espera(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
