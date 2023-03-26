package scenario;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
    @Test
    public void testSecond() {
      //  SoftAssertions softAssertions = new SoftAssertions();
        System.setProperty("webdriver.chrome.driver", "/Users/klukina9013/Downloads/untitled5/chromedriver_mac64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        //1. Открыть ссылку https://homebrandofficial.ru/wear
        driver.get("https://homebrandofficial.ru/wear");
        //2. Нажать на товар с названием “Футболка Оversize”
        driver.findElement(By.xpath(" //div[text()=\"Футболка Оversize\"]")).click();
        //3. Нажать на кнопку “Добавить в корзину”
        driver.findElement(By.xpath("//td[@class=\"js-store-prod-popup-buy-btn-txt\"]")).click();
        //4. Нажать на иконку "Корзина"
        driver.findElement(By.cssSelector("svg.t706__carticon-img")).click();
        //5. Нажать "Оформить заказ"
        driver.findElement(By.xpath(" //button[@class=\"t706__sidebar-continue t-btn\"]")).click();
        //6. Заполнить все поля рандомными данными
        //6.1. ФИО полностью
        driver.findElement(By.xpath("//input[@id=\"input_1496239431201\"]"))
                .sendKeys("Клюкина Валерия Петровна");
        //6.2. Телефон
        driver.findElement(By.xpath("//input[@style=\"color: rgb(94, 94, 94);\"]")).click();
        driver.findElement(By.xpath("//input[@style=\"color: rgb(94, 94, 94);\"]")).sendKeys("0000000000");
        //6.3. Карта региона или страны
        driver.findElement(By.id("input_1627385047591")).sendKeys("Москва");
        //6.4.Адрес для доставки*
        driver.findElement(By.id("input_1630305196291")).sendKeys("Москва, ул. Московская, д.1, кв.1");
        //7.Доставка
        //7.1.Город
        //driver.findElement(By.xpath("//input[@class=\"searchbox-input js-tilda-rule t-input\"]")).clear();
        //driver.findElement(By.xpath("//input[@class=\"searchbox-input js-tilda-rule t-input\"]"))
        //        .sendKeys("Москва");
        // driver.findElement(By.xpath("//div[@data-full-name=\"Россия, г Москва\"]")).click();
        //7.2.Почта России (Доставка по РФ)
        driver.findElement(By.xpath("//label[@data-service-id=\"1444328482\"]")).click();
        //7.3.Получатель ФИО
        driver.findElement(By.xpath("//input[@name=\"tildadelivery-userinitials\"]"))
                .sendKeys("Клюкина Валерия Петровна");
        //7.4.Улица
        driver.findElement(By.xpath("//input[@name=\"tildadelivery-street\"]"))
                .sendKeys("Московская");
        driver.findElement(By.xpath("//div[@data-full-name=\"Россия, г Москва, ул Московская\"]")).click();


        //Select drpStreet = new Select(driver.findElement(By.name("tildadelivery-street")));
        //drpStreet.selectByVisibleText("ул Московская");
        //7.5.Дом
        //driver.findElement(By.xpath("//input[@name=\"tildadelivery-house\"]")).sendKeys("1");
        //driver.findElement(By.xpath("//div[@data-name=\"д. 1\"]")).click();


        //4.Найден 1 товар
       // String quantity = driver.findElement(By.cssSelector("span.js-store-filters-prodsnumber")).getText();
       // String expectedQuantity = "1";
       // softAssertions.assertThat(quantity).as("Неверное количество найденных товаров")
          //      .isEqualToIgnoringCase(expectedQuantity);
        //5. Название товара “Лонгслив White&Green”
        //String nameProduct = driver.findElement(By.xpath("//div[text()=\"Лонгслив White&Green\"] ")).getText();
       // String expectedNameProduct = "Лонгслив White&Green";
       // softAssertions.assertThat(nameProduct).as("Неверное название товара")
        //        .isEqualToIgnoringCase(expectedNameProduct);
        //6. Стоимость товара “2800”
        //String price = driver.findElement(By.xpath("//div[text()=\"2 800\"]")).getText();
       // String expectedPrice = "2 800";
      //  softAssertions.assertThat(price).as("Неверно указана стоимость товара")
       //         .isEqualToIgnoringCase(expectedPrice);
      //  softAssertions.assertAll();
    }
}
