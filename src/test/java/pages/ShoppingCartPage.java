package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Web;

public class ShoppingCartPage {
    private WebDriver navegador;

    public ShoppingCartPage(WebDriver navegador){this.navegador = navegador;}

    public ShoppingCartPage inStockAssert(){
        Web.explicitWait(navegador, "//*[@id='product_1_1_0_0']//span[@class='label label-success']");
        navegador.findElement(By.xpath("//*[@id='product_1_1_0_0']//span[@class='label label-success']")).isDisplayed();

        return this;
    }
}
