package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends DOM {

    @FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/button[2]")
    protected WebElement btncheckout;

    @FindBy(xpath="/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")
    protected WebElement inputapellido;
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")
    protected WebElement inputnombre;

    @FindBy(xpath="/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")
    protected WebElement inputcodpostal;
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/form/div[2]/input")
    protected WebElement btncontinuar;

    public void espera1(){espera(btncheckout);}
    public void btnC1(){onclick(btncheckout);}


    public void inombre(String nombre){type(inputnombre,nombre);}
    public void iapellido(String apellido){type(inputapellido, apellido);}

    public void ipostal(String codpostal){type(inputcodpostal,codpostal);}
    public void btncontinuar(){onclick(btncontinuar);}
}
