package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrito extends DOM{

    @FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a")
    protected WebElement btncarrito;

    @FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement txtcarrito;
    public void ecarro(){espera(btncarrito);}
    public void carro(){onclick(btncarrito);}
    public String verifica(){
        String t;
        return t = getText(txtcarrito);
    }

}
