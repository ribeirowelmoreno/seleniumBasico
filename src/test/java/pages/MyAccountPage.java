package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import suporte.Web;

public class MyAccountPage {
    private WebDriver navegador;

    public MyAccountPage(WebDriver navegador) {this.navegador = navegador;}

    public MyAccountPage SignInAssert(){
        Web.explicitWait(navegador,"//*[@id='header']//a[@title='View my customer account']");
        WebElement signInAssert = navegador.findElement(By.xpath("//*[@id='header']//a[@title='View my customer account']"));
        signInAssert.isDisplayed();

        return this;
    }
}
