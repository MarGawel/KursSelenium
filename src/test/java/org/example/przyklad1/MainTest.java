package org.example.przyklad1;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MainTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testFormularz(){
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
        firstName.sendKeys("Marcin");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.clear();
        lastName.sendKeys("Gaweł");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]"));
        gender.click();

        WebElement date = driver.findElement(By.name("dob"));
        date.clear();
        date.sendKeys("11/30/1989");

        WebElement address = driver.findElement(By.id("address"));
        address.clear();
        address.sendKeys("Prosta 51");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("Marcin@gawel.pl");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Pass123");

        WebElement company = driver.findElement(By.id("company"));
        company.clear();
        company.sendKeys("Coderslab");

        // Wybieranie jednej opcji z pola Select nie działa i jeszcze nie wiem dlaczego??
        //Select role = (Select) driver.findElement(By.xpath("//*[@id='role']"));
        //role.selectByVisibleText("QA");

        WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy test automatyczny");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

    }

    @After
    public void tearDown(){
       // driver.quit();
    }
}
