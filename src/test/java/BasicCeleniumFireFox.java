import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCeleniumFireFox {
    WebDriver foxDriver ;

    @BeforeEach
    public void fireFoxExample(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        foxDriver = new FirefoxDriver();
        foxDriver.get("https://todo.ly/");
    }

    @Test
    public void goToFireFox() throws InterruptedException{

        // img login
        foxDriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();
        // set text email
        foxDriver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("upb_api@api.com");
        // set test pwd
        foxDriver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        // click boton login
        foxDriver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(5000);


    }

    @AfterEach
    public void closeBrowser(){
        foxDriver.close();
    }

}
