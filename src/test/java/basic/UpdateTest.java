package basic;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateTest {

    WebDriver chrome;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chrome/chromedriver.exe");
        chrome = new ChromeDriver();
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        chrome.manage().window().maximize();
        chrome.get("https://todo.ly/");

    }

    @AfterEach
    public void closeBrowser(){
        chrome.quit();
    }

    @Test
    @DisplayName("Verify update project test is successfully")
    public void verifyAddNewProject() throws InterruptedException {
        chrome.findElement(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]")).click();
        chrome.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("selenium123@123.com");
        chrome.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        chrome.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        // verification
        Assertions.assertTrue(chrome.findElements(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).size() ==1,
                "ERROR! nose pudo iniciar sesion");

        Thread.sleep(3000);

        chrome.findElement(By.className("AddProjectLiDiv")).click();
        chrome.findElement(By.id("NewProjNameInput")).sendKeys("Para actualizar");
        chrome.findElement(By.id("NewProjNameButton")).click();

        Thread.sleep(2000);

        Assertions.assertTrue(chrome.findElement(By.className("CurrentProjectTitle")).getText().contains("Para actualizar"),
                "ERROR! No se pudo crear el proyecto");

    }
}
