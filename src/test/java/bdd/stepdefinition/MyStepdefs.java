package bdd.stepdefinition;
import bdd.step.*;
import bdd.webdriver.DOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {
    private final DOM dom = new DOM();
    private final  loginstep Loginstep = new loginstep();
    private final agregarpruductosstep agPruductosstep  = new agregarpruductosstep();
    private final carritostep carro = new carritostep();
    private final checkoutstep check = new checkoutstep();
    private final confirmacionstep con = new confirmacionstep();
    @Given("Login {string} {string} {string}")
    public void login(String url, String user, String password) {
        Loginstep.stepIniciarNavegador(url);
        Loginstep.esperalogin();
        Loginstep.inuser(user);
        Loginstep.inpass(password);
        Loginstep.btnlogin();
    }

    @When("Agregar dos productos al carrito")
    public void agregarDosProductosAlCarrito() {
        agPruductosstep.esperaproducto1step();
        agPruductosstep.agregarproducto1step();
        agPruductosstep.agregarproducto2step();
    }

    @And("Visualizar el carrito {string}")
    public void visualizarElCarrito(String texto) {
        carro.esperacarrito();
        carro.botoncarrito();
        String t=carro.verifica();
        Assertions.assertEquals(t,texto);
    }

    @And("Completar el formulario de compra {string} {string} {string}")
    public void completarElFormularioDeCompra(String nombre, String apellido, String codigopostal) {
        check.esperabtnCheckout();
        check.clickbtnCheckout();
        check.innombre(nombre);
        check.inape(apellido);
        check.inpostal(codigopostal);
        check.btncontinuar();
    }


    @Then("Finalizar la compra hasta la confirmación {string}")
    public void finalizarLaCompraHastaLaConfirmación(String txt) {
        con.scrollfin();
        con.esperabtn();
        con.btnfin();
        con.esperav();
        String t= con.verificaf();
        Assertions.assertEquals(t,txt);
        dom.quitDriver();
    }
}
