package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AgProducto extends DOM {
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    protected WebElement btnA1;
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
    protected WebElement btnA2;
    public void agregarproducto1(){onclick(btnA1);}
    public void esperaproducto1() {espera(btnA1);}
    public void agregarproducto2() {onclick(btnA2);}

}
