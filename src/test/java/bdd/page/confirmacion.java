package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class confirmacion extends DOM{
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")
    protected WebElement btnfinalizar;
    @FindBy(xpath="/html/body/div/div/div/div[2]/h2")
    protected WebElement textocon;
    public  void scrollfin(){scroll(btnfinalizar);}
    public void esperabtn(){espera(btnfinalizar);}
    public void btnfinalizar(){onclick(btnfinalizar);}
    public String verificaf(){
        String t;
        return t = getText(textocon);
    }
    public void esperav(){espera(textocon);}
}
