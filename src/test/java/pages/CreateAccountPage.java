package pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suporte.Web;

public class CreateAccountPage {
    private WebDriver navegador;

    public CreateAccountPage(WebDriver navegador) {this.navegador = navegador;}

    public MainScreenPage BackToHome(){
        Web.explicitWait(navegador, "//*[@id='columns']//a[@title='Return to Home']");
        navegador.findElement(By.xpath("//*[@id='columns']//a[@title='Return to Home']"));

        return new MainScreenPage(navegador);
    }

    public CreateAccountPage SelectGenderMale() {
        Web.explicitWait(navegador, "//*[@id='id_gender1'][@name='id_gender']");
        navegador.findElement(By.id("id_gender1")).click();

        return this;
    }

    public CreateAccountPage SelectGenderFemale() {
        Web.explicitWait(navegador, "//*[@id='id_gender2'][@name='id_gender']");
        navegador.findElement(By.id("id_gender2")).click();

        return this;

    }

    public CreateAccountPage InsertFirstName(String firstName){
        Web.explicitWait(navegador,"//*[@id='customer_firstname']");
        navegador.findElement(By.id("customer_firstname")).sendKeys(firstName);

        return this;
    }

    public CreateAccountPage InsertLastName(String lastName){
        Web.explicitWait(navegador, "//*[@id='customer_lastname']");
        navegador.findElement(By.id("customer_lastname")).sendKeys(lastName);

        return this;
    }

    public CreateAccountPage InsertPassword(){
        Web.explicitWait(navegador,"//*[@id='passwd']");
        String randomPassword = RandomStringUtils.randomAlphanumeric(8);
        navegador.findElement(By.id("passwd")).sendKeys(randomPassword);

        return this;
    }

    public CreateAccountPage SelectDay(Integer indexDay){
        Web.explicitWait(navegador,"//*[@id='account-creation_form']//label[contains(text(), 'Date of Birth')]");
        Select selectDateOfBirth = new Select(navegador.findElement(By.id("days")));
        selectDateOfBirth.selectByIndex(indexDay);

        return this;
    }

    public CreateAccountPage SelectMonth(Integer indexMonth) {
        Web.explicitWait(navegador, "//*[@id='account-creation_form']//label[contains(text(), 'Date of Birth')]");
        Select selectDateOfBirth = new Select(navegador.findElement(By.id("months")));
        selectDateOfBirth.selectByIndex(indexMonth);

        return this;
    }
    public CreateAccountPage SelectYear(Integer indexYear) {
        Web.explicitWait(navegador, "//*[@id='account-creation_form']//label[contains(text(), 'Date of Birth')]");
        Select selectDateOfBirth = new Select(navegador.findElement(By.id("years")));
        selectDateOfBirth.selectByIndex(indexYear);

        return this;
    }

    public CreateAccountPage InsertAddress(){
        Web.explicitWait(navegador,"//*[@id='address1']");
        String randomPassword = RandomStringUtils.randomAlphabetic(5);
        navegador.findElement(By.id("address1")).sendKeys("Rua"+randomPassword);

        return this;
    }

    public CreateAccountPage InsertCity(){
        Web.explicitWait(navegador,"//*[@id='city']");
        navegador.findElement(By.id("city")).sendKeys("Campinas");

        return this;
    }

    public CreateAccountPage SelectState(){
        //Web.explicitWait(navegador, "//*[@id='id_state']");
        navegador.findElement(By.id("id_state")).findElement(By.xpath("//option[contains(text(),'Alaska')]")).click();
//        Select selectState = new Select(navegador.findElement(By.id("id_state")));
//        selectState.selectByIndex(indexState);

        return this;
    }

    public CreateAccountPage InsertZipCode(String zipCode){
        Web.explicitWait(navegador,"//*[@id='postcode']");
        navegador.findElement(By.id("postcode")).sendKeys(zipCode);

        return this;
    }

    public CreateAccountPage SelectCountry() {
        //Web.explicitWait(navegador, "//*[@id='id_country']");
        navegador.findElement(By.xpath("//*[@id='id_country']//option[contains(text(),'United States')]")).click();
//        Select selectState = new Select(navegador.findElement(By.id("id_country")));
//        selectState.selectByIndex(indexCountry);

        return this;
    }

    public CreateAccountPage InsertMobilePhone(String phoneNumber){
        Web.explicitWait(navegador,"//*[@id='phone_mobile']");
        navegador.findElement(By.id("phone_mobile")).sendKeys("999999999");

        return this;
    }

    public CreateAccountPage InsertAddress2(){
        Web.explicitWait(navegador,"//*[@id='alias']");
        navegador.findElement(By.id("alias")).sendKeys("Rua 1");

        return this;
    }

    public MyAccountPage submitAccount(){
        Web.explicitWait(navegador,"//*[@id='submitAccount']");
        navegador.findElement(By.id("submitAccount")).click();

        return new MyAccountPage(navegador);
    }
}
