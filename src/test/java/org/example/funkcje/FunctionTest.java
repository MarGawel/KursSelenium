package org.example.funkcje;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testFormularz() {

        WebElement firstNameLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[1]/label"));
        WebElement firstName = driver.findElement(By.id("first-name"));
        if (firstName.isEnabled()) {
            firstName.clear();
            firstName.sendKeys("Marcin");
            System.out.println(firstNameLabel.getText() + ": Marcin");
        } else {
            Assert.fail();
        }

        WebElement lastNameLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[2]/label"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        if (lastName.isEnabled()) {
            lastName.clear();
            lastName.sendKeys("Gaweł");
            System.out.println(lastNameLabel.getText() + ": Gaweł");
        } else {
            Assert.fail();
        }

        WebElement genderLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[3]/label"));
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]"));
        if (gender.isEnabled()) {
            gender.click();
            System.out.println(genderLabel.getText() + ": Male");
        } else {
            Assert.fail();
        }

        WebElement dateLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[4]/label"));
        WebElement date = driver.findElement(By.name("dob"));
        if (date.isEnabled()) {
            date.clear();
            date.sendKeys("11/30/1989");
            System.out.println(dateLabel.getText() + ": 11/30/1989");
        } else {
            Assert.fail();
        }

        WebElement addressLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[5]/label"));
        WebElement address = driver.findElement(By.id("address"));
        if (address.isEnabled()) {
            address.clear();
            address.sendKeys("Prosta 51");
            System.out.println(addressLabel.getText() + ": Prosta 51");
        } else {
            Assert.fail();
        }

        WebElement emailLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[6]/label"));
        WebElement email = driver.findElement(By.id("email"));

        if (email.isEnabled()) {
            email.clear();
            email.sendKeys("Marcin@gawel.pl");
            System.out.println(emailLabel.getText() + ": Marcin@gawel.pl");
        } else {
            Assert.fail();
        }

        WebElement passwordLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[7]/label"));
        WebElement password = driver.findElement(By.id("password"));
        if (password.isEnabled()) {
            password.clear();
            password.sendKeys("Pass123");
            System.out.println(passwordLabel.getText() + ": Pass123");
        } else {
            Assert.fail();
        }

        WebElement companyLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[8]/label"));
        WebElement company = driver.findElement(By.id("company"));
        if (company.isEnabled()) {
            company.clear();
            company.sendKeys("Coderslab");
            System.out.println(companyLabel.getText() + ": Coderslab");
        } else {
            Assert.fail();
        }

        WebElement roleLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[9]/label"));
        WebElement roleElement = driver.findElement(By.xpath("//*[@id='role']"));
        if (roleElement.isEnabled()) {
            Select role = new Select(roleElement);
            role.selectByVisibleText("QA");
            System.out.println(roleLabel.getText() + ": QA");
        } else {
            Assert.fail();
        }

        WebElement commentLabel = driver.findElement(By.xpath("//*[@id='infoForm']/div[12]/label"));
        WebElement comment = driver.findElement(By.id("comment"));
        if (comment.isEnabled()) {
            comment.clear();
            comment.sendKeys("To jest mój pierwszy test automatyczny");
            System.out.println(commentLabel.getText() + ": To jest mój pierwszy test automatyczny");
        } else {
            Assert.fail();
        }

        WebElement submit = driver.findElement(By.id("submit"));
        if (submit.isEnabled()) {
            submit.click();
        } else {
            Assert.fail();
        }

    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }


}
