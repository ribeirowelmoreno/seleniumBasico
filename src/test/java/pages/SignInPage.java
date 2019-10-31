package pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Web;

public class SignInPage {
    private WebDriver navegador;

    public SignInPage(WebDriver navegador){this.navegador = navegador;}

    public MainScreenPage ReturnToHome(){
        Web.explicitWait(navegador,"//*[@id='columns']//a[@title='Return to Home']");
        navegador.findElement(By.xpath("//*[@id='columns']//a[@title='Return to Home']")).click();

        return new MainScreenPage(navegador);
    }

    public ForgotPasswordPage ForgotPassword(){
        Web.explicitWait(navegador, "//*[@id='login_form']//a[@title='Recover your forgotten password']");
        navegador.findElement(By.xpath("//*[@id='login_form']//a[@title='Recover your forgotten password']")).click();

        return new ForgotPasswordPage(navegador);
    }

    public MyAccountPage SignUp(){
        Web.explicitWait(navegador,"//*[@id='SubmitLogin'][@class='button btn btn-default button-medium']");
        navegador.findElement(By.xpath("//*[@id='SubmitLogin'][@class='button btn btn-default button-medium']")).click();

        return new MyAccountPage(navegador);
    }

    public CreateAccountPage SubmitCreateAccount(){
        Web.explicitWait(navegador, "//*[@id='SubmitCreate']");
        navegador.findElement(By.id("SubmitCreate")).click();

        return new CreateAccountPage(navegador);
    }

    public SignInPage EmailCreate(String firstName){
        //gera string alfanumérica randomica
        String randomString = RandomStringUtils.randomAlphanumeric(8);

        //Gera string alfabetica randomica com 4 letras
        //String alphabet = firstName;
       // String randomString = RandomStringUtils.random(4, alphabet);

        Web.explicitWait(navegador,"//*[@id='email_create']");

        navegador.findElement(By.id("email_create")).sendKeys(firstName+randomString+"@test.com");

        return this;
    }
}
