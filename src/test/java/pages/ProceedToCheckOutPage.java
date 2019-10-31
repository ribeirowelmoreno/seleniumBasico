package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Web;

public class ProceedToCheckOutPage {
    private WebDriver navegador;

    public ProceedToCheckOutPage(WebDriver navegador) {this.navegador = navegador;}


    public ShoppingCartPage ProceedToCheckOut(){
        Web.explicitWait(navegador,"//*[@id='layer_cart']//a[@title='Proceed to checkout']");
        navegador.findElement(By.xpath("//*[@id='layer_cart']//a[@title='Proceed to checkout']")).click();

        return new ShoppingCartPage(navegador);
    }
}
