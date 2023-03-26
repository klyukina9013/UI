package scenario;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

    @Test
    public void testFirst() {
        SoftAssertions softAssertions = new SoftAssertions();
        System.setProperty("webdriver.chrome.driver","/Users/klukina9013/Downloads/untitled5/chromedriver_mac64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        //1. Открыть ссылку https://homebrandofficial.ru/wear
        driver.get("https://homebrandofficial.ru/wear");
        //2. В строку поиска ввести “Лонгслив White&Gree
        driver.findElement(By.xpath("//input[@placeholder=\"Поиск\"]")).sendKeys("Лонгслив White&Green");
        //3. Нажать на иконку “Поиск”
        driver.findElement(By.cssSelector("svg.t-store__search-icon.js-store-filter-search-btn")).click();
        //Проверить:
        //4.Найден 1 товар
        String quantity = driver.findElement(By.cssSelector("span.js-store-filters-prodsnumber")).getText();
        String expectedQuantity = "1";
        softAssertions.assertThat(quantity).as("Неверное количество найденных товаров")
                .isEqualToIgnoringCase(expectedQuantity);
        //5. Название товара “Лонгслив White&Green”
        String nameProduct = driver.findElement(By.xpath("//div[text()=\"Лонгслив White&Green\"] ")).getText();
        String expectedNameProduct = "Лонгслив White&Green";
        softAssertions.assertThat(nameProduct).as("Неверное название товара")
                .isEqualToIgnoringCase(expectedNameProduct);
        //6. Стоимость товара “2800”
        String price = driver.findElement(By.xpath("//div[text()=\"2 800\"]")).getText();
        String expectedPrice = "2 800";
        softAssertions.assertThat(price).as("Неверно указана стоимость товара")
                .isEqualToIgnoringCase(expectedPrice);
        softAssertions.assertAll();

    }
}
