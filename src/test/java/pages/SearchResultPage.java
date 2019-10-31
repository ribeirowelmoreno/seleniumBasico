package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchResultPage {
    private WebDriver navegador;

    public SearchResultPage(WebDriver navegador){this.navegador = navegador;}

    public ProceedToCheckOutPage AddToCart(){
        WebElement mouseOver = navegador.findElement(By.xpath("//*[@alt='Faded Short Sleeve T-shirts']"));
        Actions action = new Actions(navegador);
        action.moveToElement(mouseOver).moveToElement(navegador.findElement(By.xpath("//span[contains(text(),'Add to cart')]"))).click().build().perform();

        return new ProceedToCheckOutPage(navegador);

    }

}
