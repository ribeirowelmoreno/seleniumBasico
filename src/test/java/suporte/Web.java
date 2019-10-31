package suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Wellynton\\BrowserDrivers\\chromedriver.exe");

        //Abrindo o navegador
        WebDriver navegador = new ChromeDriver(); //Cria uma instância/objeto do tipo webdriver
        navegador.manage().window().maximize(); //maximiza a janela do navegador
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navegando para a página do teste
        navegador.get("http://automationpractice.com/index.php");

        return navegador;
    }

    public static void takeScreenShot(WebDriver navegador, String arquivo) {
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
        }
    }

    public static String dataHoraParaArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyymmddhhmmss").format(ts);
    }

    public static void explicitWait(WebDriver navegador, String itemPath){
        WebDriverWait wait = new WebDriverWait(navegador, 10) ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(itemPath)));
    }
}


