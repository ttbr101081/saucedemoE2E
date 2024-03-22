package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends DOM {
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")
    protected WebElement inputuser;
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")
    protected WebElement inputpassword;
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/form/input")
    protected WebElement btnLogin;
    public void iniciarNavegador(String url) {
        inciarNavegador(url);
    }
    public void inuser(String user){type(inputuser,user);}
    public void inpass(String password){type(inputpassword,password);}
    public void btlogin(){onclick(btnLogin);}
    public void esperLogin(){espera(btnLogin);}

}
