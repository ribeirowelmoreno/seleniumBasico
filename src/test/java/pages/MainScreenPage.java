package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import suporte.Web;

public class MainScreenPage {
    private WebDriver navegador;

    /**Construtor da classe*/

    public MainScreenPage (WebDriver navegador){
        this.navegador = navegador;
    }

    public SearchResultPage SearchSomeProduct(String productName) {
        Web.explicitWait(navegador, "//*[@id='search_query_top'][@name='search_query']");
        navegador.findElement(By.xpath("//*[@id='search_query_top'][@name='search_query']")).click();
        navegador.findElement(By.xpath("//*[@id='search_query_top'][@name='search_query']")).sendKeys(productName);
        navegador.findElement(By.xpath("//*[@id='searchbox']/button[@name='submit_search']")).click();

        return new SearchResultPage(navegador);
    }

    public ContactUsPage ClickInContactUs(){
        Web.explicitWait(navegador,"//*[@id='contact-link']/a[@title='Contact Us']");
        navegador.findElement(By.xpath("//*[@id='contact-link']/a[@title='Contact Us']")).click();

        return new ContactUsPage(navegador);
    }

    public SignInPage ClickInSignInButton(){
        Web.explicitWait(navegador, "//*[@id='header']//a[@class='login']");
        navegador.findElement(By.xpath("//*[@id='header']//a[@class='login']")).click();

        return new SignInPage(navegador);
    }

    public ShoppingCartPage ClickOnCartButton(){
        Web.explicitWait(navegador,"//*[@id='header']//a[@title='Log in to your customer account']");
        navegador.findElement(By.xpath("//*[@id='header']//a[@title='Log in to your customer account']")).click();

        return new ShoppingCartPage(navegador);

    }

    public TShirtPage ClickingOnTShirt(){
        WebElement mouseOver = navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Women']"));
        Actions action = new Actions(navegador);
        action.moveToElement(mouseOver).moveToElement(navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Tops']/parent::li//a[@title='T-shirts']"))).click();

        return new TShirtPage(navegador);
    }

    public BlousePage ClickingOnBlouses(){
        WebElement mouseOver = navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Women']"));
        Actions action = new Actions(navegador);
        action.moveToElement(mouseOver).moveToElement(navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Blouses']"))).click();

        return new BlousePage(navegador);
    }

    public CasualDressesPage ClickingOnCasualDresses(){
        WebElement mouseOver = navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Women']"));
        Actions action = new Actions(navegador);
        action.moveToElement(mouseOver).moveToElement(navegador.findElement(By.xpath("//a[@title='Women']/parent::li//a[@title='Casual Dresses']"))).click();

        return new CasualDressesPage(navegador);
    }

    public EveningDressesPage ClickingOnEveningDresses(){
        WebElement mouseOver = navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Women']"));
        Actions action = new Actions(navegador);
        action.moveToElement(mouseOver).moveToElement(navegador.findElement(By.xpath("//a[@title='Women']/parent::li//a[@title='Evening Dresses']"))).click();

        return new EveningDressesPage(navegador);
    }

    public SummerDressesPage ClickingOnSummerDresses(){
        WebElement mouseOver = navegador.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='Women']"));
        Actions action = new Actions(navegador);
        action.moveToElement(mouseOver).moveToElement(navegador.findElement(By.xpath("//a[@title='Women']/parent::li//a[@title='Summer Dresses']"))).click();

        return new SummerDressesPage(navegador);
    }

    public MainScreenPage ClickingOnPopular(){
        Web.explicitWait(navegador,"//*[@id='home-page-tabs']//a[@class='homefeatured']");
        navegador.findElement(By.xpath("//*[@id='home-page-tabs']//a[@class='homefeatured']")).click();

        return this;
    }

    public MainScreenPage ClickinOnBestSeller(){
        Web.explicitWait(navegador,"//*[@id='home-page-tabs']//a[@class='blockbestsellers']");
        navegador.findElement(By.xpath("//*[@id='home-page-tabs']//a[@class='blockbestsellers']")).click();

        return this;
    }
}
